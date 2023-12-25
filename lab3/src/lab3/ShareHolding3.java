/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author eb431
 */
public class ShareHolding3 extends Asset2{
    
    public Money price;
    public int quantity;
    public String name;
    
    
    public ShareHolding3(String name, Money price, int quantity){
        super(price, name);
        this.quantity = quantity;   
    }
    
    public void changePrice(Money newPrice){
        this.price = newPrice;
    }
    
    public void changeQuantity(int newQty){
        this.quantity = newQty;
    }
}
