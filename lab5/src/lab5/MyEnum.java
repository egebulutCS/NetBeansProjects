/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author USER
 */
public enum MyEnum {
    UK("uk", "United Kingdom"),
    FR("fr", "French"),
    ESP("esp", "Spain"),
    ITA("ita", "Italy"),
    SWE("swe", "Sweden"),
    TR("tr", "Turkey"),
    USA("usa", "United States of America"),
    GER("ger", "Germany");
    
    private String nameCode;
    
    private String displayName;
    
    private MyEnum(String code, String displayName){
        this.nameCode = code;
        this.displayName = displayName;
    }
    
    public String getNameCode(){
        return this.nameCode;
    }
    
    public String getDisplayName(){
        return this.displayName;
    }
    
    @Override
    public String toString(){
        return this.displayName;
    }
}
