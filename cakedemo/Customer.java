/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public class Customer {
 
private String name;
private long phoneN0;
private String email;
private String address;

    public Customer() {
    }

    public Customer(String name, long phoneN0) {
        this.name = name;
        this.phoneN0 = phoneN0;
    }



    public Customer(String name, long phoneN0, String email) {
        this.name = name;
        this.phoneN0 = phoneN0;
        this.email = email;
    }

    
    public Customer(String name, long phoneN0, String email, String address) {
        this.name = name;
        this.phoneN0 = phoneN0;
        this.email = email;
        this.address = address;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneN0(long phoneN0) {
        this.phoneN0 = phoneN0;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getName() {
        return name;
    }

    public long getPhoneN0() {
        return phoneN0;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + ", phoneN0: " + phoneN0 + ", email: " + email + ", address: " + address ;
    }
   
}
