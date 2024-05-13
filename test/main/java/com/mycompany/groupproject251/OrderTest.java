/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.groupproject251;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author shaha
 */
public class OrderTest {
    public Order instance;
    public Delivery_Date time;
    public Pricing price;
    public Customer customer;
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //instance = new Order(TotalPrice, newCustomer, price_details, delivery_date);
        customer = new Customer("0512345678", "shahad");
        price = new Pricing("Crepe", 2.0, true, "dress");
        time = new Delivery_Date(now(), 5);
        instance = new Order (1, customer, price, time);
    }
    
    @After
    public void tearDown() {
    }





    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testInvoice() {
       LocalDate orderDate = now();
        System.out.println("toString");
        
        String expResult = "             Invoice        \n";
        expResult += "Order ID:              2\n";
        expResult += "Customer Name:         shahad\n";
        expResult += "Customer Phone Number: 0512345678\n";
        expResult += "Garment Type:          dress\n";
        expResult += "Fabric Type:           Crepe\n";
        expResult += "Total price:           234.6\n";
        expResult += "Delivery Time:         null\n";
        String result = instance.Invoice();
        assertEquals(expResult, result);
        
    }
    
    
        /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testInvoiceNull() {
       LocalDate orderDate = now();
        System.out.println("toString");
        
        String expResult = "             Invoice        \n";
        expResult += "Order ID:              1\n";
        expResult += "Customer Name:         shahad\n";
        expResult += "Customer Phone Number: 0512345678\n";
        expResult += "Garment Type:          dress\n";
        expResult += "Fabric Type:           Crepe\n";
        expResult += "Total price:           234.6\n";
        expResult += "Delivery Time:         null\n";
        String result = instance.Invoice();
        assertNotNull(expResult);
        
    }
    
}
