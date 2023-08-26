package com.example.formdangki.utils;

import com.example.formdangki.entity.User;
import com.example.formdangki.service.UserService;
import com.example.formdangki.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Set;
@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof User))
        {
            return;
        }
        User user=(User) target;
        String userId =user.getId();
        if (userId.length() != 4) {
            errors.rejectValue("id", "User.id.length",
                    new String[]{"4"}, "ID phải có 5 ký tự");
        } else if (!userId.matches("B[0-9]{3}")) {
            errors.rejectValue("id", "User.id",
                    null, "ID phải đúng định dạng");
        } else if (userService.findById(userId) != null) {
            errors.rejectValue("id", "User.exist",
                    null, "ID đã tồn tại");
            // khi mà User.exist k có trong messages.properties thì sẽ hiện thị cái ID đã tồn tại
        }
    }
}
