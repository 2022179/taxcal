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
          PreparedStatement stmt = conn.prepareStatement("INSERT INTO " + TABLE_NAME + " VALUES (?, ?, ?, ?, ?, ?, ?)");

             
        ){
         stmt.setString(1, user.getName());
            stmt.setString(2, user.getusername());
            stmt.setString(3, user.getPassword());
            stmt.setDouble(4, user.getGrossIncome());
            stmt.setDouble(5, user.getPRSIRate());
            //stmt.setString(6, user.getPRSIBand());
            stmt.setInt(7, user.getTaxCredits());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addAllUser(List<User> userList) throws SQLException, IOException, ClassNotFoundException {
        for (User user : userList) {
            if (!addUser(user)) {
                return false;
