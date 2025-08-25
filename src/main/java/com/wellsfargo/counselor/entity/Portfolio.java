package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @JoinColumn(nullable = false)
    private LocalDate creationDate;

    protected Portfolio(){}

    public Portfolio(Client client, long portfolioId, LocalDate creationDate){
        this.client = client;
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {return portfolioId;}

    private Client getClient(){
        return client;
    }
    private void setClient(Client client){
        this.client = client;
    }
    private LocalDate getCreationDate(){
        return creationDate;
    }
    private void setCreationDate(LocalDate creationDate){
        this.creationDate = creationDate;
    }


}
