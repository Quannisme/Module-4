package codegym.vn.repository;

import codegym.vn.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class StudentReponsitoryImpl implements StudentReponsitory
{
    private static Map<String ,Student>studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put("SV001",new Student("SV001","toan",22,"Da nang"));
        studentMap.put("SV001",new Student("SV002","toan1",23,"Da nang1"));
        studentMap.put("SV001",new Student("SV003","toan2",24,"Da nang2"));
        studentMap.put("SV001",new Student("SV004","toan3",25,"Da nang3"));
    }
    @Override
    public void createOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void deleteById(String id) {
        studentMap.remove(id);
    }
}
