package com.sid12g.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    String GetHello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String GetAbout() {
        return "it is me";
    }

}
