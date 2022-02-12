package lesson10_practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
public class TestLamda {
	/*
    @Test
    public void testComaparing(){
        int i=LibraryComapnion.customerCompairing("Mazed","Abir");
        assertEquals(1, i);
    }
    */
    
    @Test
    public void testgetSpecificCustomerByCity() {
    	Customer cust2 = new Customer("Laurence Lebihans", "12, rue des Bouchers", "Marseille", "13008");
    	boolean b =LibraryComapnion.getSpecificCustomerByCity(cust2);
    	assertEquals(false, b);
    }
    
    
}
