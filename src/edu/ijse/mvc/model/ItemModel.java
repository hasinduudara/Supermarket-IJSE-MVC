/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Charuka
 */
public class ItemModel {
     public ArrayList<ItemDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();

        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        while (rst.next()) {            
            ItemDto dto = new ItemDto();
            dto.setCode(rst.getString("ItemCode"));
            dto.setDescription(rst.getString("Description"));
            dto.setPack(rst.getString("PackSize"));
            dto.setUnitPrice(rst.getDouble("UnitPrice"));
            dto.setQoh(rst.getInt("QtyOnHand"));
            

            itemDtos.add(dto);
        }

        return itemDtos;
    }
     
    public String saveItem(ItemDto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO item VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getCode());
        statement.setString(2, dto.getDescription());
        statement.setString(3, dto.getPack());
        statement.setDouble(4, dto.getUnitPrice());
        statement.setInt(5, dto.getQoh());
        
        int result = statement.executeUpdate();
        return result > 0?"Successful" : "Failed";
    }
    
    public String deleteItem(String ItemCode) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, ItemCode);
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Delete Failed";
    }
    
    public String updateItem(String itemCode, String description, String pack, double unitPrice, int qoh) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE item SET ItemCode = ?, Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, itemCode);
        statement.setString(2, description);
        statement.setString(3, pack);
        statement.setDouble(4, unitPrice);
        statement.setInt(5, qoh);
        
           
        int result = statement.executeUpdate();
        return result > 0 ? "SuccessFully Updated " : " Update Failed ";
    }
    
}
