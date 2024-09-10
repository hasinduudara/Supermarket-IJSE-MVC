package edu.ijse.mvc.dto;

/**
 *
 * @author hasid
 */
public class OrdersDto {
    private String orderID;
    private java.sql.Date orderDate;
    private String custID;
    
    public OrdersDto() {  
    }

    public OrdersDto(String orderID, java.sql.Date orderDate, String custID) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.custID = custID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    @Override
    public String toString() {
        return "OrdersDto{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", custID=" + custID + '}';
    }
}
