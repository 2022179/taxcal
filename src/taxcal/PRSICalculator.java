/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

/**
 *
 * @author Primm
 */
class PRSICalculator {

    PRSICalculator(User user) {
    }

   private int getPRSIBand(double taxableIncome) {
        //logic to determine PRSI band based on taxable income
        if (taxableIncome < 20000) {
            return 1;
        } else if (taxableIncome < 40000) {
            return 2;
        } else {
            return 3;
        }
    }

    private double getPRSIRate(int prsiBand) {
        // logic to determine PRSI rate based on PRSI band
        switch (prsiBand) {
            case 1:
                return 0.02; // 2%
            case 2:
                return 0.04; // 4%
            case 3:
                return 0.06; // 6%
            default:
                throw new IllegalArgumentException("Invalid PRSI band");// error message 
        }
    }

    public static void main(String[] args) {
        User user = null;
        PRSICalculator calculator = new PRSICalculator(user);

        double taxableIncome = 30000;
        double prsiBand = calculator.getPRSIBand(taxableIncome);
        double prsiRate = calculator.getPRSIRate((int) prsiBand);

        System.out.println("PRSI Band: " + prsiBand);
        System.out.println("PRSI Rate: " + (prsiRate * 100) + "%");
    }

    
}
