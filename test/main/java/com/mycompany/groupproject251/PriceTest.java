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
 * @author AHC
 */
public class PriceTest {
    
    public PriceTest() {
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
     * Test of getPrice method, of class Price.
     */
    @Test
    public void testGetPriceNOTUrgent() {
        System.out.println("getPrice");
        Price instance = new Price("crepe", 5, false, "dress");
        double expResult = 300;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    
       
    }
    @Test
    public void testGetPriceisUrgent() {
        System.out.println("getPrice");
        Price instance = new Price("crepe", 5, true, "dress");
        double expResult = 345;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    
       
    }

    /**
     * Test of getFabricCost method, of class Price.
     */
    @Test
    public void testGetFabricCost() {
        System.out.println("getFabricCost");
        Price instance = new Price("crepe", 0, true, "dress");
        int expResult = 20;
        int result = instance.getFabricCost();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetFabricCost2() {
        System.out.println("getFabricCost");
        Price instance = new Price("Cotton", 0, true, "dress");
        int expResult = 30;
        int result = instance.getFabricCost();
        assertEquals(expResult, result);
    }
    
}
