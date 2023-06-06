package com.circus.controllers;

import com.circus.controllers.Main.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexCont extends Main {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("role", getRole());
        return "about";
    }

    @GetMapping
    public String index1(Model model) {
        model.addAttribute("role", getRole());
        return "index";
    }

    @GetMapping("/index")
    public String index2(Model model) {
        model.addAttribute("role", getRole());
        return "index";
    }
}