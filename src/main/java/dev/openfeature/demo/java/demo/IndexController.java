package dev.openfeature.demo.java.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
}
