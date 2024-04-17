/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.groupproject251;

import java.util.Scanner;
import java.util.ArrayList;

public class Groupproject251 {
    
    static ArrayList<Customer> Customers = new ArrayList<>();
    
    //method to display the required info to enter
    public static Customer addCustomerDisplay(Scanner input){
        //enter phone number
        System.out.print("please enter customer phone number:");
        String StrPhoneNumber=input.next();
        //check phone
        String phoneNumber= checkPhone(StrPhoneNumber, input);
        //customer name
        System.out.print("please enter customer name:");
        String CustomerName= input.next();

        Customer customer = new Customer(phoneNumber, CustomerName);
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
        String StrPhoneNumber=input.next();
        //check phone number
        String PhoneNumber= checkPhone(StrPhoneNumber, input);
        
        Customer requiredCustomer = null;
        //search for customer
        for (int i=0; i<Customers.size(); i++){
            if(Customers.get(i).getPhoneNumber().equals(PhoneNumber) && Customers.get(i)!=null){
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
    public static String checkPhone(String StrPhoneNumber, Scanner input){
        //if phone number was wrong
        while(StrPhoneNumber.length()!=10
                || !(StrPhoneNumber.matches("\\d+")) 
                || !(StrPhoneNumber.startsWith("05"))){
            System.out.println("incorrect phone number! It should be 10 digits and not containning any charachters. Try Again.");
            System.out.print("please enter customer phone number:");
            StrPhoneNumber= input.next();
            }
        //return phone
        return StrPhoneNumber;
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
