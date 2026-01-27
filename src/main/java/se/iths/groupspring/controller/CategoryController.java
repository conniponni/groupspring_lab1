package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.groupspring.model.Category;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @GetMapping
    public String categoryList(Model model) {
        List<Category> categoryList = List.of(
                new Category(1, "Telefoner", "En apparat som används för att ringa med."),
                new Category(2, "TV", "Används för att se program och följa serier"),
                new Category(3, "Radio", "Används för att lyssna på musik och viktiga program")
        );
        model.addAttribute("categories", categoryList);
        return "categories";
    }
}
