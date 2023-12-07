package com.codan.swagger2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Swagger!";
    }

    @PostMapping("/greet/{name}")
    public String greet(@PathVariable String name, @RequestParam(defaultValue = "false") boolean formal) {
        if (formal) {
            return "Good day, " + name + "!";
        } else {
            return "Hey, " + name + "!";
        }
    }

    @GetMapping("/square")
    public int square(@RequestParam int number) {
        return number * number;
    }

    @DeleteMapping("/remove/{id}")
    public String remove(@PathVariable Long id) {
        return "Item with ID " + id + " removed.";
    }
}
