/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
import java . util .*;

public class Special extends Cake implements PriceCalculation{
    static Scanner in = new Scanner(System.in);
       ArrayList <Special> cakes = new ArrayList<>(9);
    
        public Special() {
       
        cakes.add(new Special("Chocolate Mud Cake","Swiss chocolate curls","Semi sweet chocolate","Large",3,110.0));
        cakes.add(new Special("Chocolate Mud Cake","Swiss chocolate curls","Semi sweet chocolate","Medium",3,95.5));
        cakes.add( new Special("Chocolate Mud Cake","Swiss chocolate curls","Semi sweet chocolate","Small",3,65.5)) ;
        cakes.add(new Special("Red Velvet Cake","Cream Cheese Icing","Cream Cheese Icing","Small",2,65.5)) ;
        cakes.add(new Special("Chocolate Mocha Cake","Crushed Chocolate","Coffe Buttercream","Small",3,65.5));
        cakes.add(new Special("Chocolate Mocha Cake","Crushed Chocolate","Coffe Buttercream","Medium",3,95.5));
        cakes.add(new  Special("Chocolate Strawberry Cake ","Rosettes Chocolate & Fresh Strawberry","Chocolate ganache & Strawberry Puree","Small",3,65.5));
        cakes.add(new  Special("Chocolate Strawberry Cake ","Rosettes Chocolate & Fresh Strawberry","Chocolate ganache & Strawberry Puree","Medium",3,95.5));
        cakes.add(new  Special("Chocolate Strawberry Cake ","Rosettes Chocolate & Fresh Strawberry","Chocolate ganache & Strawberry Puree","Large",3,110.0));
        cakes.add(new Special("Marbled Mud Cake","White & Dark chocolate ","","Large",1,110.0)) ;
        
    }

    public Special(String name, String topping, String filling, String size, int layers, double price) {
        super(name, topping, filling, size, layers, price);
    }

    public List <Special> getCakes() {
        return cakes;
    }

    public double calculatePrice(int quntity , int option){
    double price = 0.0;
    Special cake = new Special();
    for(int i = 0; i < cake.cakes.size() ; i++)
        if(option-1 == i)
        price = quntity * ( (cake.cakes.get(i).getPrice()*TAX)+cake.cakes.get(i).getPrice());
    return price;
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    }

}
