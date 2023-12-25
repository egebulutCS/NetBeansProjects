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
public class Asset3 {
    private Money2 value;
    private String name;

    public Asset3(Money2 value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public Sterling4 getValue(){
        return Sterling4.getValue();
    }
    
    public String getName(){
        return this.name;
    }
}
