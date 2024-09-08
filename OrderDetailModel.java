/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hasid
 */
public class OrderDetailModel {
    public ArrayList<OrderDetailDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM orderdetail";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();

        ArrayList<OrderDetailDto> orderdetailDtos = new ArrayList<>();
        while (rst.next()) {            
            OrderDetailDto dto = new OrderDetailDto();
            dto.setOrderIDTextField(rst.getString("Order ID"));
            dto.setItemCodeTextField(rst.getString("Item Code"));
            dto.setOrderQTYTextField(rst.getInt("Order QTY"));
            dto.setDiscountTextField(rst.getDouble("Discount"));

            orderdetailDtos.add(dto);
        }

        return orderdetailDtos;
    }
    
    public String saveOrderDetail(OrderDetailDto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO orderdetail VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getOrderIDTextField());
        statement.setString(2, dto.getItemCodeTextField());
        statement.setInt(3, dto.getOrderQTYTextField());
        statement.setDouble(4, dto.setDiscountTextField());      

        int result = statement.executeUpdate();
        return result > 0 ? "Successful" : "Fail";
    }
}
