/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Charuka
 */
public class CustomerDto {
   
    private String custID;
    private String custTitle;
    private String custName;
    private java.sql.Date DOB;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;
    

    public CustomerDto() {
        
    }

    public CustomerDto(String custID, String custTitle, String custName, java.sql.Date DOB, double salary, String custAddress, String city, String province, String postalCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.DOB = DOB;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        
    }

    
    public String getCustID() {
        return custID;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public String getCustName() {
        return custName;
    }

    public java.sql.Date getDOB() {
        return DOB;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getCustAddress() {
        return custAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }


    
    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setDOB(java.sql.Date DOB) {
        this.DOB = DOB;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custID=" + custID + ", custTitle=" + custTitle + ", custName=" + custName + ", DOB=" + DOB + ", salary=" + salary + ", custAddress=" + custAddress + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + '}';
    }
}

