package com.test.aws.demoaws.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
public class DemoAwsController {
    @GetMapping("/hola")
    public String saludar() {
        return "Hola Javero Omar !!! 🚀";
    }
}
