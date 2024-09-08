/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.model.OrderDetailModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hasid
 */
public class OrderDetailController {
    private final OrderDetailModel ORDERDETAIL_MODEL;

    public OrderDetailController() {
        this.ORDERDETAIL_MODEL = new OrderDetailModel();
    }

    public ArrayList<OrderDetailDto> getAllOrderDetail() throws SQLException, ClassNotFoundException{
        ArrayList<OrderDetailDto> orderdetailList = ORDERDETAIL_MODEL.getAll();
        return orderdetailList;
    }
    
    public String saveOrderDetail(OrderDetailDto orderdetailDto) throws SQLException, ClassNotFoundException{
        String resp = ORDERDETAIL_MODEL.saveOrderDetail(orderdetailDto);
        return resp;
    }
}
