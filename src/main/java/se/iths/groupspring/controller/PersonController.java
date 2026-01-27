package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.groupspring.model.Person;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public String personList(Model model) {
        List<Person> persons = List.of(
                new Person(1L, "Pelle", "Göransson"),
                new Person(2L, "Camilla", "Haraldsson"),
                new Person(3L, "Göran", "Bengtsson")
        );
        model.addAttribute("persons", persons);
        return "persons";
    }
}
