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
public class Databasesetup extends Database{
     final static String DB_BASE_URL = "jdbc:mysql://localhost";
    final static String USER = "ooc2023";
    final static String PASSWORD ="ooc2023";
   
    //method to set up our database
    public static boolean setupDB() throws SQLException{
        try(
       Connection conn= DriverManager.getConnection( DB_BASE_URL,USER,PASSWORD);
      Statement stmt =conn.createStatement();
      ){
            stmt.execute("CREATE DATABASE IF NOT EXISTS  'administrator';");
            stmt.execute("USE 'administrator';");
            String sql;
            sql =  "CREATE TABLE IF NOT EXISTS 'userdata';)"
                        + "name VARCHAR(25),"
                        + "username varchar (20)"
                        + "password(6),"
                        + "grossIncome DOUBLE NOT NULL,"
                        + "taxCredits DOUBLE NOT NULL"
                        + "PRSIBand VARCHAR(20) NOT NULL,"
                        + "PRSIRate DOUBLE NOT NULL;"
                        + ");";
            stmt.execute(sql);
            return true;
           
}catch (Exception e){
    e.printStackTrace();
    return false;
}
}
}


    
