package com.qa.ims.persistence.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Item {

    private Long id;
    private String itemName;
    private LocalDate itemStockDate;
    private String itemDescription;
    private double itemPrice;

    public Item(String itemName, LocalDate itemStockDate, String itemDescription, double itemPrice) {
        this.itemName = itemName;
        this.itemStockDate = itemStockDate;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }



    public Item(Long id, String itemName, LocalDate itemStockDate, String itemDescription, double itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemStockDate = itemStockDate;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getItemStockDate() {
        return itemStockDate;
    }

    public void setItemStockDate(LocalDate itemStockDate) {
        this.itemStockDate = itemStockDate;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }



}
