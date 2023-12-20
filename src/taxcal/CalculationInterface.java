/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taxcal;

/**
 *
 * @author User
 */
public interface CalculationInterface {
    void calculateIncomeTax(User user, double grossIncome, double taxCredits, String PRSIBand);
    void saveSolution(User user,double grossIncome, double taxCredits, String PRSIBand, double incomeTax );
}
