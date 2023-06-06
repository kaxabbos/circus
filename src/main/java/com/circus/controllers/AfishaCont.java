package com.circus.controllers;

import com.circus.controllers.Main.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AfishaCont extends Main {
    @GetMapping("/catalog")
    public String catalog(Model model) {
        model.addAttribute("sessions", repoSessions.findAll());
        model.addAttribute("role", getRole());
        return "catalog";
    }

    @GetMapping("/catalog/all")
    public String catalog_main(Model model) {
        model.addAttribute("sessions", repoSessions.findAll());
        model.addAttribute("role", getRole());
        return "catalog";
    }
}
