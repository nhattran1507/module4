package com.example.baitap1.controller;

import com.example.baitap1.entity.User;
import com.example.baitap1.service.IUserService;
import com.example.baitap1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String viewUserForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("")
    public String addUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "index";
        }
        userService.save(user);
        return "redirect:/users/result";
    }
    @GetMapping("/result")
    public String showResultPage(){
        return "result";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user-details";
    }
    @GetMapping("/{id}")
    public String getUserByID(@PathVariable("id") int id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user-details";
    }
}
