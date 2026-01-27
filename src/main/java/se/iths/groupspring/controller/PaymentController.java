package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.groupspring.model.Payment;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PaymentController {
    @GetMapping("/payment")
    public String paymentList(Model model) {
        List<Payment> payments = List.of(
                new Payment(1L, 200, "Swish", LocalDate.of(2025, 5, 10)),
                new Payment(2L, 300, "Credit card", LocalDate.of(2025, 8, 5)),
                new Payment(3L, 400, "Cash", LocalDate.of(2025, 10, 25))
        );
        model.addAttribute("payments", payments);
        return "payments";
    }
}
