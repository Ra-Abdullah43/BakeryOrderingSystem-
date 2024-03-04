/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public class LocalOrder extends Orders{
    public LocalOrder() {
    }

    public LocalOrder(Special cake, double price ,int quntity) {
    this.special = cake;
    this.quntity = quntity;
    }

    public LocalOrder(Customer Customers, Customized custome, int quntity) {
    this.Customers = Customers;
    this.custome = custome;
    this.quntity = quntity ;
    }
    
    


    @Override
    public String toString() {
        return "LOCAL ORDER{" +  special + ", QUNTITY: " + quntity +" , PRICE: "+", ORDER NUMBER: " + orderN0 + '}';
    }
    
    
}
