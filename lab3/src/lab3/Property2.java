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
public class Property2 extends Asset2 {
    private String name;
    private String address;

    public Property2(String name, Sterling3 value, String address) {
        super(value, name);
        this.address = address;
    }
    public void setPrice(Sterling3 newPRice){
        
    }
}
