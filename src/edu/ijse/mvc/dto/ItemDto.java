/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Charuka
 */
public class ItemDto {
    
    private String code;
    private String description;
    private String pack;
    private double unitPrice;
    private int qoh;

    public ItemDto() {
        
    }

    public ItemDto(String code, String description, String pack, double unitPrice, int qoh) {
        this.code = code;
        this.description = description;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }
    
    
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getPack() {
        return pack;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQoh() {
        return qoh;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "code=" + code + ", description=" + description + ", pack=" + pack + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
}
