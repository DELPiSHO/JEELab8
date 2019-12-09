package com.example.lab8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
    @Autowired
    private PersonDao dao;

    @GetMapping("/")
    public String handleGetRequest(Model model) {
        model.addAttribute("persons", dao.loadAll());
        return "person-view";
    }
}