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
public class ReesesPeanutButter extends IceCreamDecorator {

    private final IceCream icecream;

    public ReesesPeanutButter(IceCream icecream) {
        this.icecream = icecream;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Reeses Peanut Butter (1.50)";

    }

    @Override
    public double getPrice() {
        return icecream.getPrice() + 1.50;
    }
}
