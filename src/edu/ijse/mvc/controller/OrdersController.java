package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrdersDto;
import edu.ijse.mvc.model.OrdersModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hasid
 */
public class OrdersController {
    private final OrdersModel ordersModel;
    
    public OrdersController(){
        this.ordersModel = new OrdersModel();
    }
    
    public ArrayList<OrdersDto> getAllOrders() throws SQLException, ClassNotFoundException{
        return ordersModel.getAll();      
    }
    
    public String saveOrders(OrdersDto ordersDto) throws SQLException, ClassNotFoundException {
        return ordersModel.saveOrders(ordersDto);
    }
    
    public String deleteOrders(String orderID) throws ClassNotFoundException, SQLException {
        return ordersModel.deleteOrders(orderID);
    }
    
    public String updateOrders(OrdersDto ordersDto) throws ClassNotFoundException, SQLException {
        return ordersModel.updateOrders(ordersDto);
    }
    
}
