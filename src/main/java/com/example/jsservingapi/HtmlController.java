package com.example.jsservingapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
