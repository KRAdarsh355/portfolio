package com.mashup.classwork2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class portfolioController {

    @GetMapping("/start")
    public String s() {
        return "redirect:/portfolio";
    }
	
    @GetMapping("/portfolio")
    public String p() {
        return "portfolio";
    }
}