/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Databasesetup {
     final static String DB_BASE_URL = "jdbc:mysql://localhost";
    final static String USER = "CCT";
    final static String PASSWORD ="dublin";
   
    //method to set up our database
    public static boolean setupDB() throws SQLException{
        try(
       Connection conn= DriverManager.getConnection( DB_BASE_URL,USER,PASSWORD);
      Statement stmt =conn.createStatement();
      ){
            stmt.execute("CREATE DATABASE IF NOT EXISTS  'administrator';");
            stmt.execute("USE 'administrator';");
            String sql;
            sql =  "CREATE TABLE IF NOT EXISTS 'employeedata';)"
                        + "name VARCHAR(25),"
                        + "surname varchar (20)"
                        + "birthdate DATE,"
                        + "email varchar (30)"
                        + "staffID INT(5),"
                        + "password(6)"
                        + ");";
            stmt.execute(sql);
            return true;
           
}catch (Exception e){
    e.printStackTrace();
    return false;
}
}
}


    
