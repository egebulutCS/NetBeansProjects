/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import marupekepart2.MarupekePart2;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * 
 * @author 181509
 */
public class MarupekePart2Test {

    private final String basicTopBlock = "_#__\n____\n____\n____\n";
    private final String basicTopX =     "_#_x\n____\n____\n____\n";
    private final String basicFull =     "_#_x\n_o__\nx___\n___o\n";
    private final String basicFullEdit = "_#_x\n_o__\nx_x_\n___o\n";
    private final String basicSoloX =    "___x_\n_____\n_____\n_____\n_____\n";
    private final String basicXandO =    "_o_x_\n_____\n_____\n_____\n_____\n";
    private MarupekePart2 mp;

    @Before
    public void setup() {
        mp = new MarupekePart2(4);
    }
    
    @Test
    public void testInsertionForPart1() {

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
        // Make sure everything else works
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
   public void testRandomPuzzleForPart1() {
       // This is a one off test.  One might argue that this is a random 
        // method, so should be called multiple times.  However, given the
        // fill occupancy used, there are multiple collisions with very
        // high probability
        MarupekePart2 mp = MarupekePart2.randomPuzzle(10,33,33,33);
      
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
   
   @Test
   public void testForPart2(){
       //This method is to test the methods that let users mark on the
       //marupeke grid.
       MarupekePart2 mp = new MarupekePart2(5);
       
       //First checking marking process
       mp.markX(0,3);
       assertEquals(mp.toString(), basicSoloX);
       mp.markO(0, 1);
       assertEquals(mp.toString(), basicXandO);
       //Then unmarking
       assertTrue(mp.unmark(0, 1));
       //Checking if the grid is full
       assertFalse(mp.isGridFull());
       //Legality checks from all angles
       assertFalse(mp.checkHorizontal());
       assertFalse(mp.checkDiagonal());
       assertFalse(mp.checkVertical());
       //General legality check
       assertFalse(mp.isLegal());
       //Checking if the puzzle is complete
       assertFalse(mp.isPuzzleComplete());
   }

}

