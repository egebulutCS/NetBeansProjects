/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author eb431
 */
public class ShareHolding2 extends Asset{
    
    public Sterling2 price;
    public int quantity;
    public String name;
    
    
    public ShareHolding2(String name, Sterling2 price, int quantity){
        super(price, name);
        this.quantity = quantity;   
    }
    
    public void changePrice(Sterling2 newPrice){
        this.price = newPrice;
    }
    
    public void changeQuantity(int newQty){
        this.quantity = newQty;
    }
}
