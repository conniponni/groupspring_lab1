package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.groupspring.model.Adress;

import java.util.List;

@Controller
@RequestMapping("/adress")
public class AdressController {

    @GetMapping
    public String adressList(Model model) {
        List<Adress> adressList = List.of(
                new Adress("Hemvägen", 13, "Hemstad", 12345),
                new Adress("Fjällvägen", 69, "Fjällbyn", 23456),
                new Adress("Byavägen", 37, "Byn", 12456)
        );
        model.addAttribute("adresses", adressList);
        return "adresses";
    }
}
