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
public class Money2 {
    private int value;
    private Currency currency;
    
    public Money2(int value, Currency currency){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public Money2 addToValue(Money2 v2){
        return new Money2(this.value + v2.getValue());
    }
    
    public Money2 changeByPercentage(double p){
        return new Money2((int) (this.value * p/100));
    }
    
    public Money2 multiplyBy(int v){
        return new Money2(this.value*v);
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Money2 other = (Money2) obj;
        if ((this.value != other.value) && (this.currency != other.currency)){
            return false;
        }
        return true;
    }
}
