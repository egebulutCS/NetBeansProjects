/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.HashMap;

/**
 *
 * @author eb431
 */
public class Portfolio4 {
    private HashMap<String, Asset3> assets = new HashMap();
    
    public void add(Asset3 asset){
        assets.put(asset.getName() ,asset);
    }
    
    public Asset3 getHoldingByName(String name){
        return assets.get(name);
    }
    
    public Sterling4 getTotalValue(){
        Sterling4 total = new Sterling4(0);
        for(Asset3 asset: assets.values()){
            total = total.addToValue(asset.getValue());
        }
        return total;
    }
}
