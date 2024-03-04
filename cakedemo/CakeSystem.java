/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakedemo;


import java.util.*;
//import java . util . Date;
//import java . util . Locale;
import java.text.SimpleDateFormat;

/**
 *
 * @author rahaf
 */
public class CakeSystem {
    static Scanner in = new Scanner(System.in);

    ArrayList <Orders> order = new ArrayList <>(100);

    public static int numberOfOrder ;
    
    public CakeSystem() {
        for(int i = 0 ; i < 100 ; i++)
            order.add(i, new Orders()); 
    }
    //print all the elements in the arraylist
    public void displayMenu(){
    Orders o = new Orders();
       for(int i = 0 ; i < o.special.cakes.size() ; i++)
          System.out.println(i+1 +" :" +o.special.cakes.get(i));
    }
    //this method takes two parameters the number of the cake in the menu 
    //and the quantity ,then it checks if the number is in the array list index and creat an order object return it 
    // and increment order number.    
    public Orders addOrder(int num , int quntity){
        Orders o = new Orders();
        for(int i = 0 ; i < o.special.cakes.size();i++){
        if(num - 1 == i){
        o = new Orders(o.special.cakes.get(i),quntity); 
        order.add(numberOfOrder, o);
        numberOfOrder++;
        }
        }
        return o;
    }
    // this method takes one parameter of order object and delete it frome the array list of order it is a void method
     public void deleteOrder(Orders delete){
        order.remove(delete) ;
        System . out .println("YOUR ORDER HAS BEEN DELETED :)");
     }
    // 
    public Orders updateOrder(int num , int quntity){
        Orders o = new Orders();
        for(int i = 0 ; i < o.special.cakes.size();i++){
        if(num - 1 == i){
        o = new Orders(o.special.cakes.get(i),quntity); 
        order.add(numberOfOrder, o);
        }
        }
        System . out .println("YOUR ORDER HAS BEEN UPDATED :)");    
     return o; 
     }
        
    public void showBill(int num , int quntity){
    Orders o = new Orders();
    System . out . println("Order: " + o.special.cakes.get(num-1).getName() + " SIZE: "+ o.special.cakes.get(num-1).size.toUpperCase()+ " Price: "+o.special.cakes.get(num-1).calculatePrice(quntity,num)+", quntity: " + quntity);
    
    }
  
    public void showBillForCustomOrder( Customized c ,int quntity,int num){
    Orders o = new Orders(c,quntity);
    if(num == 1)
        o.custome.setSize("LARGE");
    if(num == 2)
        o.custome.setSize("MEDIUM");
    if(num == 3)
        o.custome.setSize("SMALL");
    System . out . println("ORDER: "+o.custome.getFlavor()+" CAKE FLAVORED TO A " +o.custome.getOccasion()+" PARTIY"+ " TOTAL PRICE: "+(o.custome.calculatePrice(quntity,num)+o.driver.getDeliveryPrice())
            +" SIZE: "+o.custome.getSize() +", QUNTITY: " + quntity);
    
    }
    
    
    public void printOrder(Orders o){
    System.out.println("Order: "+ o.getSpecial().name+ " SIZE: "+ o.getSpecial().size.toUpperCase()+" Quntity: "+ o.getQuntity()+" Price: "+o.getSpecial().price +" Order Number : "+o.getOrderNumber());
        
    }
    
    public Orders addCustomOrder(Customized custome,int quntity){
     Orders o = new Orders(custome, quntity); 
     order.add(numberOfOrder, o);
        numberOfOrder++;
    return o;
    }
    
    public Driver driver(int num){
    Driver driver1 = new Driver();
        if(num == 1)
          System . out . println(driver1.drivers.get(num-1));
        if(num == 2)
          System . out . println(driver1.drivers.get(num-1));
        if(num == 3)
          System . out . println(driver1.drivers.get(num-1));
   
    return driver1.drivers.get(num-1);
    }
    
    public Orders reOrder(Orders reOrder){
    order.add(numberOfOrder, reOrder.clone());
    return reOrder.clone();
    
    }
    
    public boolean isExpired(String ExpiryDate){
    boolean EX = false;
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/YY");
    Date date = new Date();
    String dateEX = dateFormat.format(date);
    if(ExpiryDate.compareTo(dateEX)> 0){
       EX = true;}
    return EX;
    }
        
    
    public boolean payment(String cardHolderName ,long cardNumber ,String expiryDate ){
    boolean payment = false;
    if(isExpired(expiryDate)){
        System . out . println("Payment completed successfully");
        payment = true;
    }
    return payment;
    }
    // polymarphsim concept: add the deliverd order object to the array of orders
    public void delivered(Customer customer ,Customized c ,Driver driver, int quntity){
    DeliveryOrder d = new DeliveryOrder(customer,c,driver,quntity);
        order.set(numberOfOrder, d);
        numberOfOrder++;//new
    }
    // polymarphsim concept: add the local order object to the array of orders
        public void local(int num , int quntity){
        Orders o = new Orders();
        LocalOrder l = new LocalOrder(o.special.cakes.get(num-1),o.special.cakes.get(num-1).calculatePrice(quntity, num-1), quntity);
        order.set(numberOfOrder, l);
        numberOfOrder++;//new [8,9,10,11,12][9]
    }
    // polymarphsim concept: add the custom local order object to the array of orders    
    // the array of orders will have two diffrent
        public void localCustom(Customer Customers, Customized custome, int quntity) {
        LocalOrder l = new LocalOrder(Customers,custome, quntity);
        order.set(numberOfOrder, l);
        numberOfOrder++;//new
        }
        
    public void displayDelivered(){
    for(int i = 0 ; i < order.size() ; i++ )
        if(order.get(i)instanceof DeliveryOrder)
            System . out . println(order.get(i));
    
    }
    
    public void displaylocal(){
    for(int i = 0 ; i < order.size() ; i++ )
        if(order.get(i)instanceof LocalOrder)
           System . out . println(order.get(i));
    
    }
     public void displayAllOrders(){
     for(int i = 0 ; i < order.size();i++){
         if(order.get(i)instanceof LocalOrder || order.get(i)instanceof DeliveryOrder)
         System.out.println(order.get(i));
     }
     }
    
}//END OF THE CLASS