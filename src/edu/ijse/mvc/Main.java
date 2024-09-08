/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;
import edu.ijse.mvc.view.Itemform;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.Customerform;;


/**
 *
 * @author Charuka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        DBConnection.getInstance().getConnection();
        //new Itemform().setVisible(true);
        new Customerform().setVisible(true);
    }
    
}
