package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.groupspring.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(Model model) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1L, "iPhone", "Smartphone från Apple", 12999.0));
        products.add(new Product(2L, "Samsung TV", "55 tum Smart TV", 8999.0));
        products.add(new Product(3L, "Bluetooth-högtalare", "Trådlös högtalare", 999.0));

        model.addAttribute("products", products);

        return "products";
    }
}

