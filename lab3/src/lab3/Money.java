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
public class Money {
    private int value;
    
    public Money(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public Money addToValue(Money v2){
        return new Money(this.value + v2.getValue());
    }
    
    public Money changeByPercentage(double p){
        return new Money((int) (this.value * p/100));
    }
    
    public Money multiplyBy(int v){
        return new Money(this.value*v);
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
        final Money other = (Money) obj;
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
}
