/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class Unit_TestingTest {
    
    public Unit_TestingTest() {
    }

    @Test
    public void testAddition() {
        
        // create an instance 
        Unit_Testing u = new Unit_Testing();
        
        int expected = 8;
        int actual = u.addition(4, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        // create an instance 
        Unit_Testing u = new Unit_Testing();
        
        int expected = 6;
        int actual = u.addition(10, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testMessage() {
        // create an instance 
        Unit_Testing u = new Unit_Testing();
        
        String expected = "Hello World!";
        String actual = u.message();
        assertEquals(expected, actual);
    }
    
}
