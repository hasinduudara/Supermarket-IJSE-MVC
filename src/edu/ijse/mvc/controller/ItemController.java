/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Charuka
 */
public class ItemController {
    
    private final ItemModel ITEM_MODEL;
    
    public ItemController(){
        this.ITEM_MODEL = new ItemModel();
    }
    
    public ArrayList<ItemDto> getAllItem() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> itemList = ITEM_MODEL.getAll();
        return itemList;      
    }
    
    public String saveItem(ItemDto itemDto)throws SQLException ,ClassNotFoundException{
        String resp = ITEM_MODEL.saveItem(itemDto);
        return resp;
    }
    
    public String updateItem(String itemCode, String description, String pack, double unitPrice, int qoh) throws ClassNotFoundException, SQLException {
        String resp = ITEM_MODEL.updateItem(itemCode,description,pack,unitPrice,qoh);
        return resp;
    } 

    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
        String resp = ITEM_MODEL.deleteItem(itemCode);
        return resp;
    }
}
