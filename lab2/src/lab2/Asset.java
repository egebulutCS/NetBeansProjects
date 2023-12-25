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
public class Asset {
    private Sterling2 value;
    private String name;

    public Asset(Sterling2 value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public Sterling2 getValue(){
        return this.value;
    }
    
    public String getName(){
        return this.name;
    }
}
