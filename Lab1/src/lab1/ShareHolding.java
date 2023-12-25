/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author eb431
 */
public class ShareHolding {
    
    public Sterling price;
    public int quantity;
    public String name;
    
    
    public ShareHolding(String shareHolder){
        price = null;
        quantity = 0;
        name = shareHolder;
    }
    
    public void setPrice(Sterling newPrice){
        price = newPrice;
    }
    
    public void setQuantity(int newQty){
        quantity = newQty;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public Sterling getPrice(){
        return this.price;
    }
    
    public Sterling getCurrentValue(){
        return getPrice().multiplyBy(this.getQuantity());
    }
}

