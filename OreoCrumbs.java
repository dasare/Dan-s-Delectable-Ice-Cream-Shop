/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DansDelectableIceCream;

/**
 *
 * @author dasare
 */
public class OreoCrumbs extends IceCreamDecorator {
    
    
    private final IceCream icecream;
    
    public OreoCrumbs(IceCream icecream){
        this.icecream = icecream;
    }
    
    public String getDescription(){
        return icecream.getDescription() + ", Oreo Crumbs (0.80)";
                
    }
    
    public double getPrice(){
        return icecream.getPrice() + 0.80;
    }
}
