/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Charuka
 */
public class CustomerController {
        private final CustomerModel CUSTOMER_MODEL;
    
    public CustomerController(){
        this.CUSTOMER_MODEL = new CustomerModel();
    }
    
    public ArrayList<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException{
        ArrayList<CustomerDto> customerList = CUSTOMER_MODEL.getAll();
        return customerList;      
    }
    
    public String saveCustomer(CustomerDto customerDto)throws SQLException ,ClassNotFoundException{
        String resp = CUSTOMER_MODEL.saveCustomer(customerDto);
        return resp;
    }
    
    public String deleteCustomer(String customerID) throws ClassNotFoundException, SQLException {
        String resp = CUSTOMER_MODEL.deleteCustomer(customerID);
        return resp;
    }
    
    public String updateCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException {
        String resp = CUSTOMER_MODEL.updateCustomer(customerDto);
        return resp;
    } 
}
