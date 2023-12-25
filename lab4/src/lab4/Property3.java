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
public class Property3 extends Asset3 {
    private String name;
    private String address;

    public Property3(String name, Sterling4 value, String address) {
        super(value, name);
        this.address = address;
    }
    public void setPrice(Sterling4 newPRice){
        
    }
}
