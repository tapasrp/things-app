package com.tapas.thymeuiproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloworld";
    }

    @GetMapping("/table")
    public String table(Model model) {

        List<Endpoint> endpoints = new ArrayList<>();
        endpoints.add(new Endpoint("address-validation","address validation url"));
        endpoints.add(new Endpoint("lock-validation","lock validation url"));

        model.addAttribute("endpoints", endpoints);
        return "endpoints";
    }

    @GetMapping("/")
    public String vue(Model model) {


        model.addAttribute("title", "Hello Vue!");
        return "vue";
    }
}
