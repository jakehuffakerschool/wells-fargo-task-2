package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class InvestmentSecurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    private Portfolio portfolio;

    // Constructor
    public InvestmentSecurity(String name, double price, Portfolio portfolio) {
        this.name = name;
        this.price = price;
        this.portfolio = portfolio;
    }

    public InvestmentSecurity() {}

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}