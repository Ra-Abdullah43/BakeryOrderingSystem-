/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public class Customized extends Cake implements PriceCalculation {
  private String occasion;
  private String text;
  private String detailes;
  private String flavor;
  final double LARGE_CAKE = 500.0;
  final double MADIUM_CAKE = 350.0;
  final double SMALL_CAKE = 200.0;

    public Customized(String occasion, String text, String detailes, String flavor) {
        this.occasion = occasion;
        this.text = text;
        this.detailes = detailes;
        this.flavor = flavor;
    }
  

    public String getOccasion() {
        return occasion;
    }

    public String getText() {
        return text;
    }

    public String getDetailes() {
        return detailes;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }
    
    

    public void setDetailes(String detailes) {
        this.detailes = detailes;
    }
    
     public double calculatePrice(int quntity,int option){
        double price = 0.0;
         if(option == 1)
             price = quntity * ((LARGE_CAKE*TAX)+LARGE_CAKE);
         if(option == 2)
             price = quntity * ((MADIUM_CAKE*TAX)+MADIUM_CAKE);
         if(option==3)
             price = quntity * ((SMALL_CAKE*TAX)+SMALL_CAKE);
    return price;
    }

    @Override
    public String toString() {
        return "FLAVOR: " + flavor + "OCCASION" + occasion + ", DETAILES: " + detailes +  ", TEXT : " + text;
    }
     
     
 
  
  
  
  
  
    
}
