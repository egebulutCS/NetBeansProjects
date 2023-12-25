/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpart1;

import part1.Marupeke;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * The Part 1 tests
 * @author ianw
 */
public class MarupekeTest {

    private final String basicTopBlock = "_#__\n____\n____\n____\n";
    private final String basicTopX =     "_#_x\n____\n____\n____\n";
    private final String basicFull =     "_#_x\n_o__\nx___\n___o\n";
    private final String basicFullEdit = "_#_x\n_o__\nx_x_\n___o\n";
    private Marupeke mp;

    @Before
    public void setup() {
        mp = new Marupeke(4);
    }
    
    // I have collapsed all the tests into a single test method, since I
    // I started from considering how to incrementally test all the public
    // API.  Smaller test methods are possible, and possibly better
    @Test
    public void testInsertion() {

        assertTrue(mp.setSolid(1, 0));
        assertEquals(basicTopBlock, mp.toString());
        // Having set the solid, we shouldn't be able to edit
        assertFalse(mp.setX(1, 0, false));
        assertEquals(basicTopBlock, mp.toString());
        assertFalse(mp.setO(1, 0, false));
        assertEquals(basicTopBlock, mp.toString());
        // Check we can edit and then not change on X
        assertTrue(mp.setX(3, 0, false));
        assertFalse(mp.setO(3, 0, true));
        assertEquals(basicTopX, mp.toString());
        // Make sure eveerything else works
        assertTrue(mp.setO(1, 1, false));
        assertTrue(mp.setO(3, 3, false));
        assertTrue(mp.setX(0, 2, false));
        assertEquals(basicFull, mp.toString());
        // Can we reverse and back out
        assertTrue(mp.setO(2, 2, true));
        assertNotEquals(basicFullEdit, mp.toString());
        assertTrue(mp.setX(2, 2, true));
        assertEquals(basicFullEdit, mp.toString());

    }

   @Test
   public void testRandomPuzzle() {
       // This is a one off test.  One might argue that this is a random 
        // method, so should be called multiple times.  However, given the
        // fill occupancy used, there are multiple collisions with very
        // high probability
        Marupeke mp = Marupeke.randomPuzzle(10,33,33,33);
      
        String s = mp.toString();
        int[] counter = new int[3];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                counter[0]++;
            } else if (s.charAt(i) == 'x') {
                counter[1]++;
            } if (s.charAt(i) == 'o') {
                counter[2]++;
            }
        }
        for(int count: counter) {
            assertEquals(33, count);
        }
   }

}
