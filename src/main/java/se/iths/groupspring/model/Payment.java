package se.iths.groupspring.model;

import java.time.LocalDate;


public class Payment {
    private Long id;
    private double amount;
    private String method;
    private LocalDate paymentDate;

    public Payment(Long id, double amount, String method, LocalDate paymentDate) {
        this.id = id;
        this.amount = amount;
        this.method = method;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
