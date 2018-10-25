package com.example.jsservingapi;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/greeting")
    public ResponseJson hello() {
        return new ResponseJson(1, "Hello World!");
    }
}
