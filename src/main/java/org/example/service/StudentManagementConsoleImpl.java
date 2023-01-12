package org.example.service;

import org.example.data_access.StudentDao;
import org.example.models.Student;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement{

    private UserInputService scannerService;
    private StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
        this.scannerService = scannerService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
