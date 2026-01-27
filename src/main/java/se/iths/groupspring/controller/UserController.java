package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.groupspring.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {

        List<User> users = new ArrayList<>();

        users.add(new User(1L, "connie", "connie@example.com", "ADMIN"));
        users.add(new User(2L, "alex", "alex@example.com", "USER"));
        users.add(new User(3L, "sara", "sara@example.com", "USER"));

        model.addAttribute("users", users);

        return "users";
    }
}

