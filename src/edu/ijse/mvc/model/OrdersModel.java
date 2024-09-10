/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrdersDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hasid
 */
public class OrdersModel {
    public ArrayList<OrdersDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM orders";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();

        ArrayList<OrdersDto> ordersDtos = new ArrayList<>();
        while (rst.next()) {            
            OrdersDto dto = new OrdersDto();
            dto.setOrderID(rst.getString("OrderID"));
            dto.setOrderDate(rst.getDate("OrderDate"));
            dto.setCustID(rst.getString("CustID"));
            
            ordersDtos.add(dto);
        }

        return ordersDtos;
    }
     
    public String saveOrders(OrdersDto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO orders VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getOrderID());
        statement.setDate(2, dto.getOrderDate());
        statement.setString(3, dto.getCustID());
        
        
        int result = statement.executeUpdate();
        return result > 0?"Successfully saved" : "Failed";
    }
    
    public String deleteOrders(String OrderID) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM orders WHERE OrderID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, OrderID);
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Delete Failed";
    }
    
    public String updateOrderID(OrdersDto Dto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE orders SET OrderID = ?, OrderDate = ?, CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, Dto.getOrderID());
        statement.setDate(2, Dto.getOrderDate());
        statement.setString(3, Dto.getCustID());
         
        int result = statement.executeUpdate();
        return result > 0 ? "SuccessFully Updated " : " Update Failed ";
    }

    public String updateOrders(OrdersDto ordersDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
