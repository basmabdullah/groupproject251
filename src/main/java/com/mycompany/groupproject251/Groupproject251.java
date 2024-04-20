/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.java.com.mycompany.groupproject251;

import java.util.Scanner;
import java.util.ArrayList;
import main.java.com.mycompany.groupproject251.Price;

public class Groupproject251 {
    
    static ArrayList<Customer> Customers = new ArrayList<>();
    
    
    
    
    
     public static Price calcPrice(Scanner input){
        System.out.println("enter the fabric");
        String fabric = input.next(); 
        System.out.println("enter your meters");
        double meter = input.nextDouble(); 
        System.out.println("enter the type");
        String garment = input.next();
        boolean isUrgent = false;
         System.out.println("is the order urgent? yes=1/ no=2");
         
         int answer = input.nextInt();
         if (answer == 1){
            isUrgent = true; 
         }
        
        Price price = new Price(fabric, meter,isUrgent, garment);
        
         
         
         return price;
         
     }
    
    
    
    
    
    
    //method to display the required info to enter
    public static Customer addCustomerDisplay(Scanner input){
        //enter phone number
        System.out.print("Enter customer phone number: ");
        String PhoneNumber1=input.next();
        //check phone
        String phoneNumber2= checkPhone(PhoneNumber1, input);
        //customer name
        System.out.print("Enter customer name: ");
        String CustomerName= input.next();

        Customer customer = new Customer(phoneNumber2, CustomerName);
        return customer;
    }
    
    //--------------------------------
    // method to add customer to arraylist
    public static void addCustomer(Customer customer){
        Customers.add(customer);
    }
    //--------------------------------
    //method to search customer by his/her phone number
    public static Customer searchCustomer(Scanner input){
        //phone want to search
        String PhoneNumber1=input.next();
        //check phone number
        String PhoneNumber2= checkPhone(PhoneNumber1, input);
        
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
        
        
        //print add customer name and phone number
        Customer newCustomer= addCustomerDisplay(input);
        //add customer to arraylist
        addCustomer(newCustomer);
        //search customer command
        Customer searchedCustomer=searchCustomer(input);
        //if customer not found
        if(searchedCustomer == null)
            System.out.println("Customer with phone number does not exist!");
        else
            System.out.println(searchedCustomer.getName());
        

        
    }
}
