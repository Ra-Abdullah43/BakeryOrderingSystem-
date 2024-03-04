/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */

public class Orders {
    Customer Customers;
    Driver driver = new Driver();
    Special special = new Special();
    Customized custome;
    protected int quntity;
    public static int  orderN0 ;
    
    public Orders(){
        this.Customers = new Customer() ;
        this.quntity = 0;
        this.special = new Special(); 
    }
    public Orders(Special cake ,int quntity) {
        this.quntity = quntity;
        this.special = cake; 
        orderN0++;
       
    }

    public Orders(Customized custome, int quntity) {
        this.custome = custome;
        this.quntity = quntity;
        orderN0++;
    }
    
    
        public Orders(Customer Customers, Customized custome, Driver driver , int quntity) {
        this.Customers = Customers;
        this.custome = custome;
        this.driver= driver;
        this.quntity = quntity;
        orderN0++;

    }
    
    public void setCustomers(Customer Customers) {
        this.Customers = Customers;
    }

    public void setDelivery(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomers() {
        return Customers;
    }

    public Driver getDelivery() {
        return driver;
    }

    public Special getSpecial() {
        return special;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public int getOrderNumber() {
        return orderN0;

    }

    @Override
    protected Orders clone(){
        return new Orders(this.special ,this. quntity); 
    }



    
    

    
    
}
