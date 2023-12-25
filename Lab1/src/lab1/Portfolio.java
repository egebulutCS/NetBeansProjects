/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.HashMap;

/**
 *
 * @author eb431
 */
public class Portfolio {
    
    private HashMap<String, ShareHolding> shareHoldings = new HashMap();

    public void add(ShareHolding sh){
        if(shareHoldings.containsKey(sh.getName())){
            sh.setQuantity(sh.getQuantity()+shareHoldings.get(sh.getName()).getQuantity());
            shareHoldings.put(sh.getName(), sh);
        } else {
            shareHoldings.put(sh.getName(), sh);
        }
    }
    
    public ShareHolding getHoldingByName(String name){
        return shareHoldings.get(name);
    }
    
    public Sterling getTotalValue(){
        Sterling total = new Sterling(0);
        for(ShareHolding sh: shareHoldings.values()){
            total = total.addToValue(sh.getCurrentValue());
        }
        return total;
    }
}
