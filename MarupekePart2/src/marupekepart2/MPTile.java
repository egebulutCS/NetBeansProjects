/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupekepart2;

/**
 *
 * @author GBulut
 */
public class MPTile {
    
    private Tile tile;
    private boolean editable;
    
    MPTile(String tile){
        this.tile = Tile.getTileValue(tile);
        this.editable = true;
    }
    
    public Tile getTile(){
        return this.tile;
    }
    
    public boolean isEditable(){
        return editable;
    }
    
    public void setEditable(boolean canEdit){
        this.editable = canEdit;
    }
}
