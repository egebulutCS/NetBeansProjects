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
public class CashAccount2 extends Asset2 {
    private String AccNo;

    public CashAccount2(String name, String AccNo, Sterling3 value) {
        super(value, name);
        this.AccNo = AccNo;
    }
    
    public void makeTransaction(Sterling3 change){
        
    }
}
