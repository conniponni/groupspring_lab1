package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.groupspring.model.Review;

import java.util.List;

@Controller
public class ReviewController {
    @GetMapping("/review")
    public String reviewList(Model model) {
        List<Review> reviews = List.of(
                new Review(1L, 5, "Toppen!"),
                new Review(2L, 3, "Helt ok"),
                new Review(3L, 1, "Sämst!")
        );
        model.addAttribute("reviews", reviews);
        return "reviews";
    }
}
