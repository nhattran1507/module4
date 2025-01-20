package com.codegym.c0924g1_spring_boot.service.impl;


import com.codegym.c0924g1_spring_boot.model.Student;
import com.codegym.c0924g1_spring_boot.repository.IStudentRepository;
import com.codegym.c0924g1_spring_boot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public void save(Student s) {
    studentRepository.save(s);
    }

    @Override
    public void update(int id, Student s) {
        if(studentRepository.findById(id).isPresent()) {
            s.setId(id);
            studentRepository.save(s);
        }
    }

    @Override
    public void remove(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

}
