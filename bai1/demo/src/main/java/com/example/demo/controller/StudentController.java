package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public ModelAndView viewAllStudents() {
        return new ModelAndView("student/list", "students", studentService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        return new ModelAndView("student/create", "student", new Student());
    }

    @PostMapping("/create")
    public String createStudent(Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/id/edit")
    public ModelAndView editForm(@PathVariable int id) {
        Student student = studentService.findById(id);
        return new ModelAndView("student/id/edit", "student", student);
    }

    @PostMapping("/edit")
    public String updateStudent(Student student) {
        studentService.update(student.getCode(), student);
        return "redirect:/students";
    }

    @GetMapping("/id/delete")
    public String deleteStudent(@PathVariable int id) {
        studentService.delete(id);
        return "redirect:/students";
    }

    @GetMapping("/id")
    public ModelAndView viewStudentDetails(@PathVariable int id) {
        Student student = studentService.findById(id);
        if (student == null) {
            return new ModelAndView("error/404"); 
        }
        return new ModelAndView("student/id", "student", student);
    }
}

