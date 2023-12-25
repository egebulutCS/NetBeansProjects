/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupekepart2;

/**
 *
 * @author egebu
 */
public enum Tile {
    BLANK("blank"),
    SOLID("#"),
    X("x"),
    O("o");
    
    private String tile;
    
    Tile(String tile){
        this.tile = tile;
    }
    
    public static Tile getTileValue(String s){
        for (Tile c: Tile.values()){
            if(c.getString().startsWith(s.toLowerCase())){
                return c;
            }
        }
        return BLANK;
    }
    
    public String getString(){
        return this.tile;
    }
}