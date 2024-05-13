/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.groupproject251;

import java.time.LocalDate;


/**
 *
 * @author shaha
 */
public class Order {
    private static int OrderID =0;
    private double TotalPrice;
    private Customer customer;
    private Pricing price;
    private Delivery_Date time;
    //static ArrayList<Order> Orders = new ArrayList<>();
  
    //constructer
        public Order(double TotalPrice, Customer customer, Pricing price, Delivery_Date time) {
        ++OrderID;
        this.TotalPrice = TotalPrice;
        this.customer = customer;
        this.price = price;
        this.time = time;
    }

    //seter
        
    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }
        
    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPrice(Pricing price) {
        this.price = price;
    }

    public void setTime(Delivery_Date time) {
        this.time = time;
    }

    //getter
    public double getTotalPrice() {
        return TotalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pricing getPrice() {
        return price;
    }

    public Delivery_Date getTime() {
        return time;
    }


    public int getOrderID() {
        return OrderID;
    }

 
    //to string method
    public String Invoice() {
        return "             Invoice        " + "\n" +
               "Order ID:              " + OrderID + "\n" + 
               "Customer Name:         " + customer.getName() + "\n" + 
               "Customer Phone Number: " + customer.getPhoneNumber() + "\n" +
               "Garment Type:          " + price.getGarment() + "\n" +
               "Fabric Type:           " + price.getFabric() + "\n" +
               "Total price:           " + customer.checkDiscount(customer, price.getPrice()) + "\n" +
               "Delivery Time:         " + time.getDelivery_date() + "\n"
                ;
    }

    
}
