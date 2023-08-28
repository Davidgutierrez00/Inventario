/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package papeleria;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ruth Alvarez
 */
public class conection {
    Connection cn;
    public Connection Conectar(){
  
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Papeleria","root","");
           System.out.println("CONECTADO");
            
        } catch(Exception e){
            System.out.println("ERROR"+e);
        }
        return cn;
    }
}
