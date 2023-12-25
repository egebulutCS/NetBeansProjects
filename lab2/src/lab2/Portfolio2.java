/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.HashMap;

/**
 *
 * @author eb431
 */
public class Portfolio2 {
    private HashMap<String, Asset> assets = new HashMap();
    
    public void add(Asset asset){
        assets.put(asset.getName() ,asset);
    }
    
    public Asset getHoldingByName(String name){
        return assets.get(name);
    }
    
    public Sterling2 getTotalValue(){
        Sterling2 total = new Sterling2(0);
        for(Asset asset: assets.values()){
            total = total.addToValue(asset.getValue());
        }
        return total;
    }
}
