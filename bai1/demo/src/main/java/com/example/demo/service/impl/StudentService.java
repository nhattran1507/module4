package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(long id, Student updatedStudent) {
        studentRepository.update(id, updatedStudent);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }
}
