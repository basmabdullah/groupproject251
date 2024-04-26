/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.java.com.mycompany.groupproject251;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.Scanner;
import java.util.ArrayList;
import main.java.com.mycompany.groupproject251.Price;


public class Groupproject251 {
    
    static ArrayList<Customer> Customers = new ArrayList<>();
    static ArrayList<Order> Orders = new ArrayList<>();
    
    
    
    
     public static Price calcPrice(Scanner input){
        System.out.println("Please choose what type of fabric you want by choosing their number."); 
        System.out.println("Fabric Options:\n 1. Crepe\n 2. Polyester\n 3. Leather\n 4. Linen\n 5. Satin\n 6. Chiffon\n 7. Cotton\n 8. Denim\n 9. Silk\n 10. Tulle");
        String fabric = null;
        int choice;
        boolean isValid = false;
        do {
            
            choice = input.nextInt();
            if (choice > 0 && choice < 11) {
                isValid = true;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
            }
        
        }  while (!isValid);
        if (choice == 1) {
            fabric = "Crepe";
        } else if (choice == 2) {
            System.out.println("You chose: Polyester");
            fabric = "Polyester";
        } else if (choice == 3) {
            System.out.println("You chose: Leather");
            fabric = "Leather";
        } else if (choice == 4) {
            fabric = "Linen";
        } else if (choice == 5) {
            fabric = "Satin";
        } else if (choice == 6) {
            fabric = "Chiffon";
        } else if (choice == 7) {
            fabric = "Cotton";
        } else if (choice == 8) {
            fabric = "Denim";
        } else if (choice == 9) {
            fabric = "Silk";
        } else if (choice == 10) {
            fabric = "Tulle";
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 10.");
        }
        
         
        System.out.println("Please enter the meters");
        double meter = input.nextDouble(); 
        System.out.println("Please enter the type of garment");
        String garment = input.next();
        boolean isUrgent = false;
         System.out.println("Is the order urgent? yes=1/ no=2");
         
         int answer = input.nextInt();
         if (answer == 1){
            isUrgent = true; 
         }
        
        Price price = new Price(fabric, meter,isUrgent, garment);
        
         
         
         return price;
         
     }
//---------------------------Delivery Date--------------------------------
    // function to enter the required parametrs for delivery date
    public static Delivery_Date calcDate(Scanner input){
        LocalDate orderDate = now();
       System.out.println("Enter the Expected production date");
       int expectedProduction_days =input.nextInt();
       
       Delivery_Date delivery_date = new Delivery_Date(orderDate,expectedProduction_days);
       LocalDate date = delivery_date.CalculateDeliveryDate(orderDate,expectedProduction_days); //invoke calculateDeliveryDate method
       System.out.println("The delivery date of this garment is "+ date);

        return delivery_date;
   
    }
    
    //-----------------------------------------------------------------------
    
    
    //method to display the required info to enter
    public static Customer addCustomerDisplay(Scanner input){
        //enter phone number
        System.out.print("Enter customer phone number: ");
        String PhoneNumber1=input.next();
        //check phone
        String phoneNumber2= checkPhone(PhoneNumber1, input);
        //check if the customer a new one or an existed one:
        Customer customer = searchCustomer(phoneNumber2, input); 
        //Customer customer = null;
        //if the customer is a new one
        if (customer == null){
        //customer name
        System.out.print("Enter customer name: ");
        String CustomerName= input.next();

        customer = new Customer(phoneNumber2, CustomerName);
        //add customer to Custoers arraylist
        Customers.add(customer);
        System.out.println("The customer is successfully added");
        }
        customer.newOrder();
        return customer;
    }

    
    
    //--------------------------------
    //method to search customer by their phone number
    public static Customer searchCustomer(String phone, Scanner input){
        
        //check phone number
        String PhoneNumber2= checkPhone(phone, input);
        
        Customer requiredCustomer = null;
        //search for customer
        for (int i=0; i<Customers.size(); i++){
            if(Customers.get(i).getPhoneNumber().equals(PhoneNumber2) && Customers.get(i)!=null){
                //if found
                requiredCustomer=Customers.get(i);
                return requiredCustomer;
            }
        }
        //if not found
        return null;
    }
    
    //-----------------------
    //method to check phone number that satisfy the conditions
    public static String checkPhone(String PhoneNumber, Scanner input){
        //if phone number was wrong
        while(PhoneNumber.length()!=10
                || !(PhoneNumber.matches("\\d+")) 
                || !(PhoneNumber.startsWith("05"))){
            System.out.println("incorrect phone number! It should be 10 digits and not containning any charachters. Try Again.");
            System.out.print("Enter customer phone number: ");
            PhoneNumber= input.next();
            }
        //return phone
        return PhoneNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("        Welcome to Tailor Management system\n"
                + "______________________________________________");

        System.out.println("press1: if you want to add customer\n"
                + "press2: \n"
                + "press3: \n"
                + "press4: if you want to calculate delivery date\n"
                + "press5: to exit from the system");
        System.out.println("______________________________________________\n");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        
        do{
            if(choice==1){
                Customer newCustomer = addCustomerDisplay(input);
            }
            else if(choice==2){}
            else if(choice==3){}
            else if(choice==4){
                Delivery_Date delivery_date = calcDate(input);
            
            }
            
            System.out.println("______________________________________________");
            System.out.print("Enter your choice: ");
            System.out.println("press1: if you want to add customer\n"
                + "press1: \n"
                + "press2: \n"
                + "press3: \n"
                + "press4: \n"
                + "press5: to exit from the system\n");
        
            System.out.print("Enter your choice: ");
            choice=input.nextInt();
        }while(choice!=5);
        if(choice==5){
            
            System.out.println("Exist from system successfully!");
            System.exit(0);
        }
        //display adding Customer display and add customer to arraylist
        Customer newCustomer = addCustomerDisplay(input);
        //if customer not found
        //if(searchedCustomer == null)
        //    System.out.println("Customer with phone number does not exist!");
        //else
        //    System.out.println(searchedCustomer.getName());
        
        
        Price price_details = calcPrice(input);
        //total price
        double TotalPrice = newCustomer.checkDiscount(newCustomer, price_details.getPrice());
        
        Order newOrder = new Order(TotalPrice, newCustomer, price_details);
        //add order to array list
        Orders.add(newOrder);
        //print the invoicee
        System.out.println(newOrder.toString());
        
        

          
    }
}
