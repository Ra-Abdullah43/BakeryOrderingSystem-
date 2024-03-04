/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public class DeliveryOrder extends Orders {

    public DeliveryOrder() {
    }

    public DeliveryOrder(Customer Customers, Customized custome, Driver driver , int quntity)  {
    this.Customers = Customers;
    this.custome = custome;
    this.driver = driver;
    }

    @Override
    public String toString() {
        return "DELIVERY ORDER { " + " CUSTOMER INFORMATION : "+Customers +"\n"+" CAKE INFORMATION : "+custome+"\n"+"  DRIVER INFORMATION : "+driver+ '}';
    }
    
    

    
}
