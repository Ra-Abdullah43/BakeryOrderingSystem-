/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cakedemo;

/**
 *
 * @author rahaf
 */
import java . util .*;

public class CakeDemo {
static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
    int option ;
    CakeSystem cake = new CakeSystem();
    Customer customer;
   
    
    Loop: for(int i = 0 ; i <= cake.order.size() ; i++){
    System . out .println("************************************************************************");   
    System . out .println("1- TAKE ORDER                 2- GO TO SYSTEM             3- EXIT ");
    int log = in .nextInt();
    switch(log){
        case 1:
    System . out . println("                            WELCOM TO OUR CAKE SHOP         ");
    System . out . println("HOW CAN WE HELP YOU!");
    System . out . println("1- WANT TO BAY FROM OUR SPECIAL CAKE ? :)                 2-WANT TO CUSTOM YOUR OWN CAKE ?");
    option = in .nextInt();
    switch(option){
      case 1:
      System . out . println("                      INTERDOSE TO YOU OUR SPECIAL CAKES MENU                 ");
      cake.displayMenu();
      System.out.println("ENTER YOUR OPTION");
      option = in . nextInt();
      System.out.println("ENTER THE QUANTITY");
      int quntity = in . nextInt();
      Orders o = cake.addOrder(option, quntity);
      System . out . println("YOUR ORDER : ");
      cake.printOrder(o);
      System . out .println("BEFORE YOU PAY, DO YOU WANT TO:\n1- DELETE THE ORDER\n2- UPDATE THE ORDER\n3- COMPLETE TO PAY");
      int servic = in .nextInt();
      switch(servic){
          case 1 :
            cake.deleteOrder(o);
              break;
          case 2 :
            System.out.println("");
            System.out.println("************SPECIAL CAKES MENU****************");
            cake.displayMenu();
            System.out.println("ENTER YOUR CAKE NUMBER:" );
            int num = in .nextInt();
            System.out.println("HOW MANY? " );
            quntity = in .nextInt();
            cake.updateOrder(num,quntity);
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            String cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            long cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            String expiryDate = in . next();
            boolean t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            int yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(num,quntity );
            cake.local(num,quntity);
            break;
            
            case 2:
            System.out.println("SORRY ABOUT THAT :("); 
            break;
            }
            
            }
            else{
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(num,quntity );
            cake.local(num,quntity);
            System . out .println("DO YOU WANT TO REODER YOUR ORDER ? :)\n1-YES               2-NO            ");
            int reOrder = in . nextInt();
            switch(reOrder){
            case 1 : 
            cake.reOrder(cake.updateOrder(num,quntity));
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in . nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(num,quntity );
            cake.local(num,quntity);
            break;
          case 2 :
              System . out . println("THANK YOU");
              break;
      }//END OF REORDER SWITCH
            }   
            break;
          case 3 :
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            in . nextLine();
            System.out.println("CARDHOLDER NAME: ");
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            int yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            System . out .println("DO YOU WANT TO REODER YOUR ORDER ? :)\n1-YES               2-NO            ");
            int reOrder = in . nextInt();
            switch(reOrder){
            case 1 : 
            cake.reOrder(o);
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in . nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            break;
            
            case 2:
            System.out.println("SORRY ABOUT THAT :(");
            break;
            }
            
            }
            else{
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            }
            break;
          case 2 :
              System . out . println("THANK YOU");
              break;
      }//END OF REORDER SWITCH
            break;
            
            case 2:
            System.out.println("SORRY ABOUT THAT :(");
            break;
            }
            
            }
            else{
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            }
            System . out .println("DO YOU WANT TO REODER YOUR ORDER ? :)\n1-YES               2-NO            ");
            int reOrder = in . nextInt();
            switch(reOrder){
            case 1 : 
            cake.reOrder(o);
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in . nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            int yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            break;
            
            case 2:
            System.out.println("SORRY ABOUT THAT :(");
            break;
            }
            
            }
            else{
            System.out.println("THANK YOU");
            System.out.println("YOUR BILL: ");
            cake.showBill(option,quntity );
            cake.local(option,quntity);
            }
            break;
          case 2 :
              System . out . println("THANK YOU");
              break;
      }//END OF REORDER SWITCH
            break;
            
      }

      break;
      
      case 2:
          System . out . println("                  TO HELP US CUSTOM YOUR CAKE TO MUCH YOUR IDEA PLEASE ANSWER THESE QUESTIONS:                        ");
          System . out . println("WHAT IS THE OCCASION ? ");
          String occasion = in .next() ;
          System . out . println("CHOSE YOUR CAKE FLAVOR BY WRITING DOWN THE FLAVOR");
          System . out . println("1- CHOCOLATE \n2- VANILA \n3- REDVELVATE ");
          String flavor = in .next();
          System . out . println("CHOSE YOUR CAKE SIZE");
          System . out . println("1- LARGE \n2- MEDIUM \n3- SMALL ");
          int size = in . nextInt();
          System . out . println("HOW MANY ?");
          int Quntity = in . nextInt();
          in .nextLine();
          System . out . println("TELL US THE DETAILES OF YOUR CAKE");
          String detailes = in .nextLine();
          System . out . println("WHAT DO YOU WANT US TO WRITE ON THE CAKE ?");
          String text = in .nextLine();
          Customized c = new Customized(occasion, text, detailes, flavor);
          cake.addCustomOrder(c, Quntity);
        System . out . println("                      NOW ENTER YOUR CONTACT INFORMATION PLEASE :)               ");
        System . out . println("YOUR NAME : ");
        String name = in . nextLine();
        System . out . println("YOUR phone number : "); 
        long phone = in . nextInt();
        System . out . println("YOUR EMAIL : ");
        String email = in . next();    
        System . out . println("DO WANT US TO DELIEVER IT TO YOU ?" );
        System . out . println("1- YES      2- NO" );   
        int accept = in . nextInt();
        if(accept == 1){
        System . out . println("ENTER YOU ADDRESS ");
        String address = in . next();          
        customer = new Customer(name, phone, email , address);
        System . out . println("CHOSE THE SUITABLE TIME FOR YOU ");
        System . out . println("1-FROM 2PM TO 4PM      2- FROM 4PM TO 6PM       3- FROM 6PM TO 8PM ");
        int time = in .nextInt();
        System . out . println("YOUR DRIVER INFORMATION :");
        Driver d = cake.driver(time);
        System.out.println("YOUR BILL : ");
        cake.showBillForCustomOrder(c,Quntity,size);
        cake.delivered(customer,c,d,Quntity);
        System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            in . nextLine();
            System.out.println("CARDHOLDER NAME: ");
            String cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            long cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            String expiryDate = in . next();
            boolean t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            int yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            break;
            
            case 2:
            System.out.println("SORRY ABOUT THAT :(");
            break;
            }
            }
            else
            System.out.println("THANK YOU");
            
            
                
        
        } // end of if statment1
        if(accept == 2){
        customer = new Customer(name, phone, email );
        cake.localCustom(customer, c, Quntity);
        System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            in . nextLine();
            System.out.println("CARDHOLDER NAME: ");
            String cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            long cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            String expiryDate = in . next();
                    boolean t = cake.payment(cardHolderName , cardNumber , expiryDate );
            if(t != true){
            System.out.println("OH NO :( YOUR CREDIT IS EXPIRED DO YOU HAVE ANOTHER ONE?\n1-YES              2-NO");
            int yesNo = in . nextInt();
            switch(yesNo){
            case 1: 
            System.out.println("                    ENTER YOUR CREDIT CARD INFORMATION                      ");
            System.out.println("CARDHOLDER NAME: ");
            in.nextLine();
            cardHolderName = in . nextLine();
            System.out.println("CARD NUMBER: ");
            cardNumber = in . nextLong();
            System.out.println("EXPIRATION DATE IN MM/YY FORM PLEASE");
            expiryDate = in . next();
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            }
            }
            else{
            cake.payment(cardHolderName , cardNumber , expiryDate );
            System.out.println("THANK YOU");
            
            }
          
        }// end of if statment2
        break;
  
    }// end of INNER switch statment
    break;
        case 2:
            System.out.println("ENTER THE PASSWORD: ");
            long password = in .nextLong();
            PASSWORD: for(i = 0 ; i < 2 ; i++){
            if(password != 443004133){
                System . out .println("WRONG PASSWORD!! TRY AGAIN");
                password = in .nextLong();
                continue PASSWORD;
            }
            } //end of for loop for password tries
            if (password == 443004133){
               System.out.println("                                 WELCOME :)                                      ");
               System.out.println("1- DISPLAY ALL ORDERS\n2- DISPLAY ALL LOCAL ORDERS\n3- DISPLAY ALL DELIVERY ORDERS\n4- EXIT\n");
               int choice = in .nextInt();
               switch(choice){
                   case 1 :
                      System . out . println("ALL ORDERS: ");
                      cake.displayAllOrders();
                      break;
                   case 2 :
                      cake.displaylocal();
                      break;   
                   case 3 :
                      cake.displayDelivered();
                      break;
                   case 4:
                      continue Loop;
                      
               }// end of switch manger statment
            }
            break;
        case 3:
            System . exit(0);
            break;
    }// end of OUTER switch statment
    
    }//end of for loop

    }// end of main
    
}//end of class