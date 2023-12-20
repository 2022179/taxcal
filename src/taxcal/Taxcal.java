/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        User user = new User(name, taxCredits) {};
        
        // to calculate the taxes 
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator(user);
        USCCalculator uscCalculator = new USCCalculator(user);
        PRSICalculator prsiCalculator = new PRSICalculator(user);
        
        double incomeTax = incomeTaxCalculator.calculateTax();
        double usc = uscCalculator.calculateTax();
        double prsi = prsiCalculator.calculateTax();
        
                
        // Display tax calculation results
        System.out.println("Tax Calculation Results:");
        System.out.println("Name: " + name);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Tax Credits: " + taxCredits);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("USC: " + usc);
        System.out.println("PRSI: " + prsi);
        System.out.println("Total Tax: " + (incomeTax + usc + prsi));
    }
    public static void dataInput() throws FileNotFoundException, IOException{
        
    BufferedReader br = new BufferedReader(new FileReader("taxpayer.csv"));// adding a file method
    
    String line;// = br.readLine();// reading line 
     

    }
}

        // TODO code application logic here
    
  
