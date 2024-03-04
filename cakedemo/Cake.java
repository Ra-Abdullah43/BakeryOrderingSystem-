/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
public abstract class Cake {
protected String name;  
protected String topping;  
protected String filling;
protected String size;  
protected int layers;
protected double price;

    public Cake() {
    }


    
    public Cake(String name, String topping, String filling, String size, int layers, double price) {
        this.name = name;
        this.topping = topping;
        this.filling = filling;
        this.size = size;
        this.layers = layers;
        this.price = price;
    }
    
    

    public Cake(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Cake(String name, String size, int layers) {
        this.name = name;
        this.size = size;
        this.layers = layers;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getTopping() {
        return topping;
    }

    public String getFilling() {
        return filling;
    }

    public String getSize() {
        return size;
    }

    public int getLayers() {
        return layers;
    }


    public double getPrice() {
        return price;
    }
    

    
    
    @Override
    public String toString() {
        return name +", size: " + size +"\n"+
                " price: " + price ;
    }

   
}
