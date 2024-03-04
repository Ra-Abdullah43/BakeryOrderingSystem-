/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
import java . util .* ;
public class Driver {
private String name;
private long phoneN0; 
public static final double DELIVERY_PRICE = 20.0;
List <Driver> drivers = new ArrayList<>(3);

    public Driver() {

        drivers.add(0, new Driver ("AHMAD",567893212));
        drivers.add(1, new Driver ("OMAR",561436891));
        drivers.add(2, new Driver ("SALEM",555342025));
        
    }
    
    public Driver(String name, long phoneN0) {
        this.name = name;
        this.phoneN0 = phoneN0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneN0(long phoneN0) {
        this.phoneN0 = phoneN0;
    }


    public String getName() {
        return name;
    }

    public long getPhoneN0() {
        return phoneN0;
    }

    public double getDeliveryPrice() {
        return DELIVERY_PRICE;
    }

    @Override
    public String toString() {
        return "name : " + name + ", phone number : " + phoneN0 + ", delivery Price : " + DELIVERY_PRICE ;
    }

}

