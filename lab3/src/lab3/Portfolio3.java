/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.HashMap;

/**
 *
 * @author eb431
 */
public class Portfolio3 {
    private HashMap<String, Asset2> assets = new HashMap();
    
    public void add(Asset2 asset){
        assets.put(asset.getName() ,asset);
    }
    
    public Asset2 getHoldingByName(String name){
        return assets.get(name);
    }
    
    public Sterling3 getTotalValue(){
        Sterling3 total = new Sterling3(0);
        for(Asset2 asset: assets.values()){
            total = total.addToValue(asset.getValue());
        }
        return total;
    }
}
