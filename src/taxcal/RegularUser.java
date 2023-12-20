/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */

    class RegularUser extends User{
   public RegularUser(String name, double grossIncome, int taxCredits) {
        super(name, grossIncome, taxCredits);
    }

    // Modify their own profile (name, surname, and any other attribute you define for them).

    public void modifyProfile(String attributeName, String newValue) {
        if (attributeName.equals("name")) {
            this.setName(newValue);
        } else if (attributeName.equals("surname")) {
            this.setSurname(newValue);
        } else {
            System.out.println("Invalid attribute name");
        }
    }

    // Access a list of all other users in the system.

    public List<User> getAllOtherUsers() throws SQLException, IOException, ClassNotFoundException {
        // Retrieve a list of all users from the database
        List<User> allUsers = DBWriter.getAllUsers();

        // Remove the current user from the list
        allUsers.remove(this);

        return allUsers;
    }

    // Remove other users from the system.

    public boolean removeUser(int userId) throws SQLException, IOException, ClassNotFoundException {
        // Check if the user ID is valid
        List<User> allUsers = DBWriter.getAllUsers();
        if (!allUsers.stream().anyMatch(user -> user.getId() == userId)) {
            System.out.println("Invalid user ID");
            return false;
        }

        // Delete the user from the database
        boolean deleted = DBWriter.deleteUser(userId);

        return deleted;
    }

    // Review the operations performed by other users.

    public List<String> getOperationsPerformedByOtherUsers() throws SQLException, IOException, ClassNotFoundException {
        // Retrieve a list of all operations performed by other users from the database
        List<String> operations = DBWriter.getOperationsPerformedByOtherUsers();

        return operations;
    }

    private void setName(String newValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSurname(String newValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

