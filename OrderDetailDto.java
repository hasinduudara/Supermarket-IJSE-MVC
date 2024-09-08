/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author hasid
 */
public class OrderDetailDto {
    private String orderIDTextField;
    private String itemCodeTextField;
    private int orderQTYTextField;
    private double discountTextField;
    
    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderIDTextField, String itemCodeTextField, int orderQTYTextField, double discountTextField) {
        this.orderIDTextField = orderIDTextField;
        this.itemCodeTextField = itemCodeTextField;
        this.orderQTYTextField = orderQTYTextField;
        this.discountTextField = discountTextField;
    }

    public String getOrderIDTextField() {
        return orderIDTextField;
    }

    public void setOrderIDTextField(String orderIDTextField) {
        this.orderIDTextField = orderIDTextField;
    }

    public String getItemCodeTextField() {
        return itemCodeTextField;
    }

    public void setItemCodeTextField(String itemCodeTextField) {
        this.itemCodeTextField = itemCodeTextField;
    }

    public int getOrderQTYTextField() {
        return orderQTYTextField;
    }

    public void setOrderQTYTextField(int orderQTYTextField) {
        this.orderQTYTextField = orderQTYTextField;
    }

    public double getDiscountTextField() {
        return discountTextField;
    }

    public void setDiscountTextField(double discountTextField) {
        this.discountTextField = discountTextField;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "orderIDTextField=" + orderIDTextField + ", itemCodeTextField=" + itemCodeTextField + ", orderQTYTextField=" + orderQTYTextField + ", discountTextField=" + discountTextField + '}';
    }

    public double setDiscountTextField() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
