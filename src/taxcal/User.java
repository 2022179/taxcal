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
    private double grossIncome;
    private int taxCredits;
    private double PRSIBand;
    private double PRSIRate;
//constructor
    public User(String name, double grossIncome, int taxCredits) {
        this.name = name;
        this.grossIncome = grossIncome;
        this.taxCredits = taxCredits;
        this.PRSIBand = PRSIBand;
        this.PRSIRate = PRSIRate;
    }
//getters
    public String getName() {
        return name;
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

}
