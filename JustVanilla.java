/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DansDelectableIceCream;

/**
CONCRETE PIZZA
 */
public class JustVanilla implements IceCream {
    
    public String getDescription(){
        return "Vanilla Ice Cream ";
    }
    
    public double getPrice(){
        return 5.00;
    }
}
