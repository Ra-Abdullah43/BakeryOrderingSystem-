/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public interface PriceCalculation {
    public static final double TAX = 0.15 ;
    
    public abstract double calculatePrice(int quntity , int option);
    
}
