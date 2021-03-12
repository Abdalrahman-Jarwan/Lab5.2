/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Blank47
 */
public class MainTest {
    
    public MainTest() {
    }

    

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] Array = {1,2,3};
        int expResult = 6;
        int result = Main.getTotal(Array);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] Array = {1,2,3};
        double expResult = 2.0;
        double result = Main.getAverage(Array);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] Array = {1,2,3};
        int expResult = 3;
        int result = Main.getHighest(Array);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] Array = {1,2,3};
        int expResult = 1;
        int result = Main.getLowest(Array);
        assertEquals(expResult, result);
       
    }
    
}
