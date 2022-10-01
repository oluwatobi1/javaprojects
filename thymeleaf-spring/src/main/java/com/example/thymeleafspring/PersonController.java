package com.example.thymeleafspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping
    String getPeople(Model model){
        model.addAttribute("people", Arrays.asList(
                new Person("Akin-taiwo Blessing Olusola", "Face of Etranzact"),
                new Person("Oluwatobi Akintunlese", "Corporate Payment"),
                new Person("Akin-taiwo Blessing Olusola", "Devops Engineer"),
                new Person("Oluwatobi Akintunlese", "Software Engineer")
        ));
        return "index";
    }
    @GetMapping("home")
    String Home(Model model){
        model.addAttribute("personName", "unit");
        return "person";
    }

}
