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
public class Sterling2 {

    private int value;
    
    public Sterling2(int value){
        this.value = value;
    }
    
    public Sterling2 addToValue(Sterling2 v2){
        return new Sterling2(this.value + v2.getValue());
    }
    
    public Sterling2 changeByPercentage(double p){
        return new Sterling2((int) (this.value*p/100));
    }
    
    public int getValue(){
        return value;
    }
    
    public Sterling2 multiplyBy(int v){
        return new Sterling2(getValue()*v);
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
        final Sterling2 other = (Sterling2) obj;
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
}
