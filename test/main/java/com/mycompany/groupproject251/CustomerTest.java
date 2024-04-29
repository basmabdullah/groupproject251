/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.groupproject251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author msbbr
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkDiscount method, of class Customer.
     */
    @Test
    public void testCheckDiscount_NoDiscount() {
        
        System.out.println("checkDiscount");
        //testing data
        Customer specialCustomer = new Customer();
        specialCustomer.setNumOfOrders(3);
        Double price = 100.0;
        //expected result
        double expResult = 100.0;
        
        Customer instance = new Customer();
        
        double result = instance.checkDiscount(specialCustomer, price);
        assertEquals(expResult, result, 0.0);
    }


    /**
     * Test of checkDiscount method, of class Customer.
     */
    @Test
    public void testCheckDiscount_discount() {
        System.out.println("checkDiscount");
        //testing data
        Customer specialCustomer = new Customer();
        specialCustomer.setNumOfOrders(5);
        Double price = 100.0;
        //expected result
        double expResult = 85.0;
        
        Customer instance = new Customer();
        
        double result = instance.checkDiscount(specialCustomer, price);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }



    }

    

