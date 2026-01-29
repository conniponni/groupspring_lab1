package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyController {
    @GetMapping
    public String my(Model model) {
        model.addAttribute("name", "Ellinor");
        return "my";
    }
}
