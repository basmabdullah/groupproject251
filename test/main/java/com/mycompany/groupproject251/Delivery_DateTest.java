/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main.java.com.mycompany.groupproject251;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author basma
 */
public class Delivery_DateTest {
    
    public Delivery_DateTest() {
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
     * Test of CalculateDeliveryDate method, of class Delivery_Date.
     */
    @Test
    public void testCalculateDeliveryDate() {
        LocalDate orderDate = LocalDate.now();
        int expectedProduction_days = 7;
        Delivery_Date instance = new Delivery_Date(orderDate, expectedProduction_days);;
        LocalDate expResult = orderDate.plusDays(expectedProduction_days);;
        LocalDate result = instance.CalculateDeliveryDate(orderDate, expectedProduction_days);

        assertEquals(expResult, result);
    }
      @Test
    public void testCalculateDeliveryDate2() {
        LocalDate orderDate =LocalDate.of(2024, 5, 4);
;
        int expectedProduction_days = 9;
        Delivery_Date instance = new Delivery_Date(orderDate, expectedProduction_days);;
        LocalDate expResult = orderDate.plusDays(expectedProduction_days);;
        LocalDate result = instance.CalculateDeliveryDate(orderDate, expectedProduction_days);

        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testExpectedProductionDaysNotNull() {

        LocalDate orderDate = LocalDate.now(); // Change null to actual order date
        Integer expectedProductionDays = null;
        Delivery_Date instance = new Delivery_Date(orderDate, expectedProductionDays); // Instantiate Delivery_Date

        // Invoke the method under test
        instance.CalculateDeliveryDate(orderDate, expectedProductionDays);
    }
    
      @Test(expected = IllegalArgumentException.class)
    public void testExpectedProductionDaysValidNumber() {

        LocalDate orderDate = LocalDate.now(); // Change null to actual order date
        String invalidExpectedProductionDays = "abc";
        Delivery_Date instance = new Delivery_Date(orderDate, 7); // Instantiate Delivery_Date

        // Invoke the method under test
        instance.CalculateDeliveryDate(orderDate, Integer.parseInt(invalidExpectedProductionDays));
    }
    
}
