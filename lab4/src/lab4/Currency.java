/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author USER
 */
public enum Currency {
    Sterling,
    Euro,
    USDollar;
    
    private Currency currency;
    
    public void getSymbol(){
        switch (currency){
            case Sterling:
                System.out.println("£");
                break;
            case Euro:
                System.out.println("€");
                break;
            case USDollar:
                System.out.println("$");
                break;
        }
    }
}

str += "UK";
        str += "\n";
        str += "FR";
        str += "\n";
        str += "ESP";
        str += "\n";
        str += "ITA";
        str += "\n";
        str += "SWE";
        str += "\n";
        str += "TR";
        str += "\n";
        str += "USA";
        str += "\n";
        str += "GER";