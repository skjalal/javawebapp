package com.example.controller;

import com.example.model.Person;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        LOGGER.info("This is Index Controller");
        model.addAttribute("person", new Person(101, "ABC"));
        return "index";
    }
}
