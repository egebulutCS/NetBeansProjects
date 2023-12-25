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
public class Sterling {

    private int value;
    
    public Sterling(int value){
        this.value = value;
    }
    
    public Sterling addToValue(Sterling v2){
        return new Sterling(this.value + v2.getValue());
    }
    
    public Sterling changeByPercentage(double p){
        return new Sterling((int) (this.value*p/100));
    }
    
    public int getValue(){
        return value;
    }
    
    public Sterling multiplyBy(int v){
        return new Sterling(getValue()*v);
    }
}
