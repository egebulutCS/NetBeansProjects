/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eb431
 */
public class MoneyTest {
    lab3.Sterling3 sterling;
    lab3.Euro euro;
    
    public MoneyTest() {
        
    }
    
    @Test
    public void testMoney(){
        assertTrue(sterling.equals(sterling));
        assertTrue(euro.equals(euro));
        assertFalse(sterling.equals(euro));
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sterling = new lab3.Sterling3(5);
        euro = new lab3.Euro(5);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
