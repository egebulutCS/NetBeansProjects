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
public class CashAccount extends Asset {
    private String AccNo;

    public CashAccount(String name, String AccNo, Sterling2 value) {
        super(value, name);
        this.AccNo = AccNo;
    }
    
    public void makeTransaction(Sterling2 change){
        
    }
}
