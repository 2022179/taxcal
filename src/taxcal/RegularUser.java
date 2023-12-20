/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */

    class RegularUser extends User{

    private static void viewUsers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void removeUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void reviewOperations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public RegularUser(String name, double grossIncome, int taxCredits) {
        super(name, grossIncome, taxCredits);
    }  

    public static void login(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (username.equals("CCT") && password.equals("Dublin")) {
            System.out.println("Administrator login successful!");
            runAdminCommands(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void runAdminCommands(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\nPlease enter an administrative command:");
            System.out.println("modify profile");
            System.out.println("view users");
            System.out.println("remove user");
            System.out.println("review operations");
            System.out.println("exit");

            String command = scanner.nextLine();

            switch (command) {
                case "modify profile":
                    // Implement logic to modify the admin's profile
                    break;
                case "view users":
                    viewUsers();
                    break;
                case "remove user":
                    removeUser();
                    break;
                case "review operations":
                    reviewOperations();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }
    }

  
}