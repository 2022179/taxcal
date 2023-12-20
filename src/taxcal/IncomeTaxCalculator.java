/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

/**
 *
 * @author Primm
 */
class IncomeTaxCalculator extends PRSICalculator{
    
    private final User user = null;

    public IncomeTaxCalculator(User user) {
        super(user);
    }




//    public double calculateTax() {
//        double taxAmount = user.getGrossIncome();
//        // Calculate the tax based on the user's income and other factors
//        // (e.g., PRSI rate, tax credits)
//        // ...
//
//        return taxAmount;
//    }
//   
    public double calculateTax() {
        // Retrieve the user's income
        double grossIncome = user.getGrossIncome();

        // Identify the applicable tax band
        int taxBand = calculateTaxBand(grossIncome);

        // Apply the tax rate for the current tax band
        double taxRate = getTaxRate(taxBand);

        // Calculate the taxable income
        double taxableIncome = calculateTaxableIncome(grossIncome, taxBand);

        // Calculate the tax amount
        double taxAmount = taxableIncome * taxRate;

        // Apply any applicable tax credits
        double taxCredits = calculateTaxCredits(user);

        // Calculate the final tax amount
        double netTaxAmount = taxAmount - taxCredits;

        return netTaxAmount;
    }

    private int calculateTaxBand(double grossIncome) {
        int taxBand = 0;
        // Implement logic to determine the applicable tax band based on the gross income
        // ...

        return taxBand;
    }

    private double getTaxRate(int taxBand) {
        double taxRate = 0;
        // Implement logic to retrieve the tax rate for the given tax band
        // ...

        return taxRate;
    }

    private double calculateTaxableIncome(double grossIncome, int taxBand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double calculateTaxCredits(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
