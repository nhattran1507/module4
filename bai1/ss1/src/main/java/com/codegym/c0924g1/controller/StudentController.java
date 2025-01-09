package com.codegym.c0924g1.controller;


import com.codegym.c0924g1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class StudentController {

//    Field DI
//    Constructor
//    Setter
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public ModelAndView viewAll(Model model) {
//        List<Student> students = studentService.findAll();
//        model.addAttribute("students", students);
//        return "student/list";
        return new ModelAndView("student/list", "students", studentService.findAll());
    }
}
