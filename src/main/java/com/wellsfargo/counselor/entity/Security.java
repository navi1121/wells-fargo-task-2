package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

public class Security {
    @Id
    @GeneratedValue
    private Long securityId;

    @OneToMany
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @JoinColumn(nullable = false)
    private String name;

    @JoinColumn(nullable = false)
    private String category;

    @JoinColumn(nullable = false)
    private BigDecimal purchasePrice;

    @JoinColumn(nullable = false)
    private LocalDate purchaseDate;

    @JoinColumn(nullable = false)
    private int quantity;

    protected Security(){}

    public Security(Portfolio portfolio, String name, String category, BigDecimal purchasePrice, LocalDate purchaseDate, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;

    }

    public long getSecurityId(){return securityId;}

    public Portfolio getPortfolio(){return portfolio;}
    public void setPortfolio(Portfolio portfolio){this.portfolio = portfolio;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getCategory(){return category;}
    public void setCategory(String category){this.category = category;}

    public BigDecimal getPurchasePrice(){return purchasePrice;}
    public void setPurchasePrice(BigDecimal purchasePrice){this.purchasePrice = purchasePrice;}

    public LocalDate getPurchaseDate(){return purchaseDate;}
    public void setPurchaseDate(LocalDate purchaseDate){this.purchaseDate = purchaseDate;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}
}
