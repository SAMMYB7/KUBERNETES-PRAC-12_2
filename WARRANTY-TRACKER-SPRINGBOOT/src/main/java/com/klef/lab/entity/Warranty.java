package com.klef.lab.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "warranties")
public class Warranty {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String itemName;
    
    @Column(nullable = false)
    private LocalDate purchaseDate;
    
    @Column(nullable = false)
    private Integer warrantyPeriodMonths;
    
    @Column(nullable = false)
    private LocalDate expiryDate;
    
    @Column(nullable = false)
    private String vendor;
    
    @Column(length = 500)
    private String notes;
    
    public Warranty() {}
    
    public Warranty(Long id, String itemName, LocalDate purchaseDate, Integer warrantyPeriodMonths, LocalDate expiryDate, String vendor, String notes) {
        this.id = id;
        this.itemName = itemName;
        this.purchaseDate = purchaseDate;
        this.warrantyPeriodMonths = warrantyPeriodMonths;
        this.expiryDate = expiryDate;
        this.vendor = vendor;
        this.notes = notes;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
    
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    public Integer getWarrantyPeriodMonths() {
        return warrantyPeriodMonths;
    }
    
    public void setWarrantyPeriodMonths(Integer warrantyPeriodMonths) {
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }
    
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public String getVendor() {
        return vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        return "Warranty{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", warrantyPeriodMonths=" + warrantyPeriodMonths +
                ", expiryDate=" + expiryDate +
                ", vendor='" + vendor + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
