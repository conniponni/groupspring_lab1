package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.groupspring.model.OrderItem;

import java.util.List;

@Controller
@RequestMapping("/orderitem")
public class OrderItemController {

    @GetMapping
    public String orderList(Model model) {
        List<OrderItem> orderItemList = List.of(
                new OrderItem(1, "iPhone", 3),
                new OrderItem(2, "Nokia 3310", 5),
                new OrderItem(3, "Samsung S12", 3)
        );
        model.addAttribute("orderItems", orderItemList);
        return "orderItems";
    }
}
