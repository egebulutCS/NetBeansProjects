/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupekepart2;

import java.util.Random;

/**
 * The part 1 Marupeke grid. This is a simple implementation of a grid, where
 * the squares of the grid can be set editable as required.
 *
 * @author ianw@sussex.ac.uk
 */
public class MarupekePart2 {

    // Not strictly necessary, since implicit in grid
    private final int size;
    private final String grid[][];
    private MPTile[][] tileArray;

    public MarupekePart2(int size) {
        this.size = size;
        grid = new String[size][size];
        tileArray = new MPTile[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                tileArray[i][j] = new MPTile("blank");
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
    public String get(int x, int y) {
        return grid[x][y];
    }

    /**
     * Set the given square solid
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setSolid(int x, int y) {
        return setGrid(x, y, false, "#");
    }

    /**
     * Set the given square X
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setX(int x, int y, boolean canEdit) {
        return setGrid(x, y, canEdit, "x");
    }

    /**
     * Set the given square )
     *
     * @param x
     * @param y
     * @return true if able to edit and set, false if not
     */
    public boolean setO(int x, int y, boolean canEdit) {
        return setGrid(x, y, canEdit, "o");
    }

    // A convenience method since the public API does pretty much the same
    // thing.  Note that x and y are transposed in referencing the arrays
    private boolean setGrid(int x, int y, boolean canEdit, String str) {
        if (!tileArray[x][y].isEditable()) {
            return false;
        }
        tileArray[x][y] = new MPTile(str);
        tileArray[x][y].setEditable(canEdit);
        grid[x][y] = tileArray[x][y].getTile().getString();
        return true;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == null) {
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
    public static MarupekePart2 randomPuzzle(int size, 
                                        int numFill, 
                                        int numX,  
                                        int numO) {
        MarupekePart2 mp = new MarupekePart2(size);
        Random rand = new Random();
        
        int sum = numFill + numX + numO;
        if(sum > (size*size)/2){
            return null;
        }
        
        int countSolid = 0;
        while(countSolid < numFill) {
            if(mp.setSolid(rand.nextInt(size),rand.nextInt(size))) {
                if(mp.isLegal()){
                    countSolid++;
                }
            }
        }
        int countX = 0;
        while(countX < numX) {
            if(mp.setX(rand.nextInt(size),rand.nextInt(size),false)) {
                if(mp.isLegal()){
                    countX++;
                }
            }
        }
        int countO = 0;
        while(countO < numO) {
            if(mp.setO(rand.nextInt(size),rand.nextInt(size),false)) {
                if(mp.isLegal()){
                    countO++;
                }
            }
        }
        return mp;
    }

    public boolean isLegal(){
	return (checkDiagonal() && checkHorizontal() && checkVertical());
    }
    
    public boolean checkDiagonal(){
        for(int i = 1; i < size-1; i++){
            for(int j = 1; j < size-1; j++){
                if(grid[i][j] != "blank"){
                    if(((grid[i-1][j-1] == grid[i][j]) && (grid[i+1][j+1] == grid[i][j])) || ((grid[i-1][j+1] == grid[i][j]) && (grid[i+1][j-1] == grid[i][j]))){
                        return false;
                    }
                }
            }
        }
	return true;
    }
    
    public boolean checkHorizontal(){
        for(int i = 1; i < size-1; i++){
            for(int j = 0; j < size; j++){
                if(grid[i][j] != "blank"){
                    if((grid[i+1][j] == grid[i][j]) && (grid[i-1][j] == grid[i][j])){
                        return false;
                    }
                }
            }   
        }
	return true;
    }
    
    public boolean checkVertical(){
        for(int i = 0; i < size; i++){
            for(int j = 1; j < size-1; j++){
                if(grid[i][j] != "blank"){
                    if((grid[i][j+1] == grid[i][j]) && (grid[i][j-1] == grid[i][j])){
                        return false;
                    }
                }
            }   
        }
	return true;
    }
    
    public String[] illegalities(){
        String [] reasons = new String [1];
        reasons[0] = "The grid is illegal if 3 consecutive characters are the same in horizontal, vertical or diagonal positions.";
        return reasons;
    }
    
    public void markX(int x, int y){
        if(tileArray[x][y].isEditable()){
            setX(x, y, true);
        }
    }
    
    public void markO(int x, int y){
        if(tileArray[x][y].isEditable()){
            setO(x, y, true);
        }
    }
    
    public boolean unmark(int x, int y){
        if(!tileArray[x][y].isEditable()){
            return false;
        } else {
            setGrid(x, y, true, "");
            tileArray[x][y] = new MPTile("blank");
            return true;
        }
    }
    
    public boolean isPuzzleComplete(){
        return (isGridFull() && isLegal());
    }
    
    public boolean isGridFull(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(get(i, j) == "blank"){
                    return false;
                }
            }
        }
        return true;
    }
}