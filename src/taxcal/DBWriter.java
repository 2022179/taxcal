/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DBWriter extends Database {
    public boolean addUser(User user) {
     try(
          Connection conn = DriverManager.getConnection(DB_URL, USER,PASSWORD);   
          Statement stmt = conn.createStatement();
             
        ){
     String sql = String.format("INSERT INTO" + TABLE_NAME +" VALUES ("+"'%S', '%S', '%S', '%d');"
     
     user.getName(), user.getuserName(), user.getPassword(), user.getGrossIncome(), user.getPRSIRate(), user.getPRSIBand(), user.getTaxCredits());
     
     
     
     }catch(Exception e){
     
     
     
     }
     
     
     
     
    }
    
    
    
}
