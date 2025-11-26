package org.example.splabvladutpetrea.controllers;

import org.example.splabvladutpetrea.Library.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record HelloController(ClientComponent clientComponent) {

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + clientComponent;
    }
}