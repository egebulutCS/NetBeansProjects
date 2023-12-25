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
public class CashAccount3 extends Asset3 {
    private String AccNo;

    public CashAccount3(String name, String AccNo, Sterling4 value) {
        super(value, name);
        this.AccNo = AccNo;
    }
    
    public void makeTransaction(Sterling4 change){
        
    }
}
