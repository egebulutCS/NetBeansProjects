/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupeke;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author MrCloud
 */
public class MarupekeGrid {
    public char[][] grid;
    public boolean[][] editable;
    
    public MarupekeGrid(int width){
        grid = new char[width][width];
        editable = new boolean[width][width];
        for(int i = 0; i < width; i++){
            Arrays.fill(editable[i], true);
        }
    }
    
    public boolean setSolid(int x, int y){
        boolean edit = false;
        if(edit == true){
            edit = true;
            editable[x][y] = false;
            grid[x][y] = '#';
        }
        return edit;
    }
    
    public boolean setX(int x, int y, boolean canEdit){
        boolean value = false;
        if(value == true){
            value = true;
            editable[x][y] = canEdit;
            grid[x][y] = 'X';
        }
        return value;
    }
    
    public boolean setO(int x, int y, boolean canEdit){
        boolean value = false;
        if(value == true){
            value = true;
            editable[x][y] = canEdit;
            grid[x][y] = 'O';
        }
        return value;
    }
    
    public static MarupekeGrid randomPuzzle(int size, int numFill, int numX, int numO){
        MarupekeGrid marupeke = new MarupekeGrid(size);
        Random rand = new Random();
        if(numFill+numX+numO>size*size){
            return null;
        } else {
            int counterSolid = 0;
            while (counterSolid < numFill) {
                int x = rand.nextInt(size);
                int y = rand.nextInt(size);
                if (marupeke.setSolid(x,y)) {
                    counterSolid++;
                }
            }
            int counterX = 0;
            while (counterX < numX) {
                int x = rand.nextInt(size);
                int y = rand.nextInt(size);
                if (marupeke.setX(x,y,false)) {
                    counterX++;
                }
            }
            int counterO = 0;
            while (counterO < numO) {
                int x = rand.nextInt(size);
                int y = rand.nextInt(size);
                if (marupeke.setO(x, y, false)) {
                    counterO++;
                }
            }
        }
        marupeke.toString();
        return marupeke;
    }
    
    @Override
    public String toString(){
        String print = "";
        for(int x = 0; x < grid.length; x++){
            String row = "";
            for(int y = 0; y < grid.length; y++){
                if(grid[x][y] == '\u0000'){
                    row += '_';
                    row += ' ';
                } else {
                row += grid[x][y];
                row += ' ';
                }
            }
            print += row;
            print += '\n';
        }
        return print;
    }
}
