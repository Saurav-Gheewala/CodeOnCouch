package com.example.CodeOnCouch.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class Controller {
    @GetMapping("/")
    public String getName()
    {
            return "Saurav";
    }

}
