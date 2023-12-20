/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

/**
 *
 * @author Primm
 */
class User {
    
    private String name;
    private String username;
    private String password;
    private double grossIncome;
    private int taxCredits;
    private double PRSIBand;
    private double PRSIRate;
   
//constructor

    public User(String name, double grossIncome, int taxCredits) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.grossIncome = grossIncome;
        this.taxCredits = taxCredits;
        this.PRSIBand = PRSIBand;
        this.PRSIRate = PRSIRate;
    }
  
//getters

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public int getTaxCredits() {
        return taxCredits;
    }

    public double getPRSIBand() {
        return PRSIBand;
    }

    public double getPRSIRate() {
        return PRSIRate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    void getuserName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  

}
