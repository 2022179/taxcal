/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcal;

import java.util.Scanner;

/**
 *
 * @author Primm
 */
public class Taxcal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your gross income:");
        double grossIncome = scanner.nextDouble();

        System.out.println("Enter your tax credits:");
        int taxCredits = scanner.nextInt();

        // Create person object
        User user = new User(name, grossIncome, taxCredits);
        // to calculate the taxes 
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator(user);
        USCCalculator uscCalculator = new USCCalculator(user);
        PRSICalculator prsiCalculator = new PRSICalculator(user);
        
        double incomeTax = incomeTaxCalculator.calculateTax();
        double usc = uscCalculator.calculateTax();
        double prsi = prsiCalculator.calculateTax();
        

    }
}

        // TODO code application logic here
    
  
