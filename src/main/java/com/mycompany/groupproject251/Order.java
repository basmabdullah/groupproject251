/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.groupproject251;



/**
 *
 * @author shaha
 */
public class Order {
    private static int OrderID =0;
    private double TotalPrice;
    private Customer customer;
    private Price price;
   // private DeliveryTime time;
    
    //constructer
        public Order(double TotalPrice, Customer customer, Price price ) {
        ++OrderID;
        this.TotalPrice = TotalPrice;
        this.customer = customer;
        this.price = price;
        //this.delivery_date = delivery_date;
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

    public void setPrice(Price price) {
        this.price = price;
    }

   // public void setTime(DeliveryTime time) {
  //      this.time = time;
    //}

    //getter
    public double getTotalPrice() {
        return TotalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Price getPrice() {
        return price;
    }

  //  public DeliveryTime getTime() {
    //    return time;
   // }


    public int getOrderID() {
        return OrderID;
    }

 
    //to string method
    @Override
    public String toString() {
        return "             Invoice        " + "\n" +
               "Order ID:              " + OrderID + "\n" + 
               "Customer Name:         " + customer.getName() + "\n" + 
               "Customer Phone Number: " + customer.getPhoneNumber() + "\n" +
               "Garment Type:          " + price.getGarment() + "\n" +
               "Fabric Type:           " + price.getFabric() + "\n" +
               "Total price:           " + customer.checkDiscount(customer, price.getPrice()) + "\n" //+
                //"Delivery Time:         " deliveryTime.
                ;
    }

    
}
