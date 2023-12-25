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
public class Property extends Asset {
    private String name;
    private String address;

    public Property(String name, Sterling2 value, String address) {
        super(value, name);
        this.address = address;
    }
    public void setPrice(Sterling2 newPRice){
        
    }
}
