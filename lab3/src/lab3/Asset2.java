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
public class Asset2 {
    private Money value;
    private String name;

    public Asset2(Money value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public Sterling3 getValue(){
        return Sterling3.getValue();
    }
    
    public String getName(){
        return this.name;
    }
}
