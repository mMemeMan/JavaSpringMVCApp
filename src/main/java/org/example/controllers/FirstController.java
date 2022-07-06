package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                           Model model) {

        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello.html";
    }

    @GetMapping("/goodbye")
    public String sayGoodBye() {
        return "first/goodbye.html";
    }
}
