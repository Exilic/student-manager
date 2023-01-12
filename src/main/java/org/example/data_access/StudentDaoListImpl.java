package org.example.data_access;


import org.example.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }



    @Override
    public void delete(int id) {

    }

}
