/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author eb431
 */
public class ShareHolding4 extends Asset3{
    
    public Money2 price;
    public int quantity;
    public String name;
    
    
    public ShareHolding4(String name, Money2 price, int quantity){
        super(price, name);
        this.quantity = quantity;   
    }
    
    public void changePrice(Money2 newPrice){
        this.price = newPrice;
    }
    
    public void changeQuantity(int newQty){
        this.quantity = newQty;
    }
}
