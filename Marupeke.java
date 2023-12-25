/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Random;

/**
 * The part 1 Marupeke grid. This is a simple implementation of a grid, where
 * the squares of the grid can be set editable as required.
 *
 * @author ianw@sussex.ac.uk
 */
public class Marupeke {

    // Not strictly necessary, since implicit in grid
    private final int size;
    private final char grid[][];
    private final boolean editable[][];

    public Marupeke(int size) {
        this.size = size;
        grid = new char[size][size];
        editable = new boolean[size][size];
        for (int i = 0; i < editable.length; i++) {
            for (int j = 0; j < editable[i].length; j++) {
                editable[i][j] = true;
            }
        }
    }

    /**
     * Extract a character from a location
     *
     * @param x
     * @param y
     * @return the character at that location
     */
    public char get(int x, int y) {
        return grid[y][x];
    }

    /**
     * Set the given square solid
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setSolid(int x, int y) {
        return setGrid(x, y, false, '#');
    }

    /**
     * Set the given square X
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setX(int x, int y, boolean canEdit) {
        return setGrid(x, y, canEdit, 'x');
    }

    /**
     * Set the given square )
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setO(int x, int y, boolean canEdit) {
        return setGrid(x, y, canEdit, 'o');
    }

    // A convenience method since the public API does pretty much the same
    // thing.  Note that x and y are transposed in referencing the arrays
    private boolean setGrid(int x, int y, boolean canEdit, char c) {
        if (!editable[y][x]) {
            return false;
        }
        grid[y][x] = c;
        editable[y][x] = canEdit;
        return true;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    s += "_";
                } else {
                    s += grid[i][j];
                }
                
            }
            s += "\n";
        }
        return s;
    }
    /**
     * Generate a random puzzle, filled with initial positions of the specified
     * numbers
     * @param size
     * @param numFill
     * @param numX
     * @param numO
     * @return 
     */
    public static Marupeke randomPuzzle(int size, 
                                        int numFill, 
                                        int numX,  
                                        int numO) {
        Marupeke mp = new Marupeke(10);
        Random rand = new Random();
        // There is repetition of code here, but removing the repetition
        // requires some functional manipulation which we haven't covered yet 
        int countSolid = 0;
        while(countSolid < numFill) {
            if(mp.setSolid(rand.nextInt(size),rand.nextInt(size))) {
                countSolid++;
            }
        }
        int countX = 0;
        while(countX < numX) {
            if(mp.setX(rand.nextInt(size),rand.nextInt(size),false)) {
                countX++;
            }
        }
        int countO = 0;
        while(countO < numO) {
            if(mp.setO(rand.nextInt(size),rand.nextInt(size),false)) {
                countO++;
            }
        }
        return mp;
    }

}
