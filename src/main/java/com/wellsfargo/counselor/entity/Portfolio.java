package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Client owner;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<InvestmentSecurity> securities;

    // Constructor
    public Portfolio(String name, Client owner) {
        this.name = name;
        this.owner = owner;
    }

    public Portfolio() {}

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Client getOwner() { return owner; }
    public void setOwner(Client owner) { this.owner = owner; }

    public List<InvestmentSecurity> getSecurities() { return securities; }
    public void setSecurities(List<InvestmentSecurity> securities) { this.securities = securities; }
}
