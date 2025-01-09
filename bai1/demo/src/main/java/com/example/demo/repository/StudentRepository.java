package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "HaTT", "QN", 9, "C0724M1"));
        students.add(new Student(3, "HaTT1", "QN", 9, "C0724M1"));
        students.add(new Student(5, "HaTT2", "QN", 9, "C0724M1"));
        students.add(new Student(6, "HaTT3", "QN", 9, "C0724M1"));
    }

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }

    public void update(long id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getCode() == id) {
                student.setName(updatedStudent.getName());
                student.setAddress(updatedStudent.getAddress());
                student.setPoint(updatedStudent.getPoint());
                student.setClassName(updatedStudent.getClassName());
                break;
            }
        }
    }

    public void delete(int id) {
        students.removeIf(student -> student.getCode() == id);
    }

    public Student findById(int id) {
        return students.stream().filter(student -> student.getCode() == id).findFirst().orElse(null);
    }
}
