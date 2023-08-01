package codegym.vn.service;

import codegym.vn.bean.Student;

import java.util.List;

public interface StudentService {
    void createOrUpdate(Student student);
    Student findById(String id);
    List<Student> findAll();
    void deleteById(String id);
}
