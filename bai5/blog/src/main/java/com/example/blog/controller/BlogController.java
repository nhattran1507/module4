package com.example.blog.controller;

import com.example.blog.entity.Blog;
import com.example.blog.exception.BlogNotFoundException;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ModelAndView viewAllBlogs() {
        return new ModelAndView("blog/list", "blogs", blogService.getAll());
    }

    @GetMapping("/create")
    public String viewAddBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/add";
    }

    @PostMapping("/create")
    public String addBlog(@ModelAttribute("blog") Blog blog,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "blog/add";
        }
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteBlog(@PathVariable(name = "id") Integer id,
                             RedirectAttributes redirectAttributes) {
        Blog blog = blogService.getById(id);
        if (blog == null) {
            throw new BlogNotFoundException("Blog not found with id: " + id);
        }
        blogService.remove(blog);
        redirectAttributes.addFlashAttribute("message", "Delete blog successfully");
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editBlog(@PathVariable(name = "id") Integer id, Model model) {
        Blog blog = blogService.getById(id);
        if (blog == null) {
            throw new BlogNotFoundException("Blog not found with id: " + id);
        }
        model.addAttribute("blog", blog);
        return "blog/edit";
    }

    @PostMapping("/{id}/update")
    public String updateBlog(@PathVariable(name = "id") Integer id,
                             @ModelAttribute("blog") Blog blog,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "blog/edit";
        }
        if (blogService.getById(id) == null) {
            throw new BlogNotFoundException("Blog not found with id: " + id);
        }
        blog.setId(id);
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("message", "Update blog successfully!");
        return "redirect:/";
    }
    @GetMapping("/{id}")
    public String viewBlogDetails(@PathVariable(name = "id") Integer id, Model model) {
        Blog blog = blogService.getById(id);
        if (blog == null) {
            throw new BlogNotFoundException("Blog not found with id: " + id);
        }
        model.addAttribute("blog", blog);

        return "blog/detail";
    }
}
