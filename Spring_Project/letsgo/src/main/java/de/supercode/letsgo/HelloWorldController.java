package de.supercode.letsgo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 */
@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/api/bye")
    public String byeWorld() {
        return "Bye, World!";
    }
}