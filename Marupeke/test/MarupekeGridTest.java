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
 * @author MrCloud
 */
public class MarupekeGridTest {
    marupeke.MarupekeGrid game;
    public MarupekeGridTest() {
    }
    
    @Test
    public void testMarupeke(){
        assertNotNull(game.grid);
        assertNotNull(game.editable);
        assertTrue(game.setSolid(2,2));
        assertTrue(game.setX(4, 4, false));
        assertFalse(game.setX(4, 4, true));
        assertTrue(game.setO(5, 5, false));
        assertFalse(game.setO(5, 5, true));
        System.out.println(game.toString());
        assertNull(game.randomPuzzle(4, 17, 3, 3));
        assertNotNull(game.randomPuzzle(4, 8, 3, 3));
        System.out.println(game.randomPuzzle(4, 8, 3, 3));
        System.out.println(game.randomPuzzle(10, 40, 18, 18));
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        game = new marupeke.MarupekeGrid(10);
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