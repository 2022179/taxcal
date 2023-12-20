/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author User
 */
public class DBWriter extends Database {
    public boolean addUser(User user) throws SQLException{
     try(
          Connection conn = DriverManager.getConnection(DB_URL, USER,PASSWORD);   
          Statement stmt = conn.createStatement();
             
        ){
     String sql = String.format("INSERT INTO" + TABLE_NAME +" VALUES ("+"'%S', '%S', '%S', '%d');"
     
     user.getName(),user.getusername user.getPassword(), user.getGrossIncome(), user.getPRSIRate(), user.getPRSIBand(), user.getTaxCredits());
     
     stmt.execute(sql);
     return true;
     
     }catch(Exception e){
         e.printStackTrace();
         return false;
    
     }
     
    }
    
    public boolean addAllUser(List<User>userlist){
        return true;
    
    
    }
    
}
