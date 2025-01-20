package com.example.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BlogNotFoundException.class)
    public ModelAndView handleBlogNotFoundException(BlogNotFoundException ex) {
        ModelAndView modelAndView = new ModelAndView("blog/404"); //
        modelAndView.addObject("error", ex.getMessage());
        modelAndView.setStatus(HttpStatus.NOT_FOUND); // HTTP 404
        return modelAndView;
    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ModelAndView handleResourceNotFoundException(ResourceNotFoundException ex) {
        ModelAndView modelAndView = new ModelAndView("blog/404"); // Đường dẫn đến templates/404.html
        modelAndView.addObject("error", ex.getMessage());
        modelAndView.setStatus(HttpStatus.NOT_FOUND); // HTTP 404
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleGenericException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("blog/error"); // Đường dẫn đến templates/error.html
        modelAndView.addObject("error", "An unexpected error occurred: " + ex.getMessage());
        modelAndView.setStatus(HttpStatus.INTERNAL_SERVER_ERROR); // HTTP 500
        return modelAndView;
    }
}
