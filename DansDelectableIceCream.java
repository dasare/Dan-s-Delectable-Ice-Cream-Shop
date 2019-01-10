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
public class DansDelectableIceCream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome To Dan's Delectable Ice Cream Shop! ");

        IceCream icecream = new JustVanilla();
        icecream = new OreoCrumbs(icecream);
        icecream = new Sprinkles(icecream);
        icecream = new ReesesPeanutButter(icecream);

        System.out.println("Description " + icecream.getDescription());
        System.out.println();
        System.out.println("Price: $" + icecream.getPrice());

        System.out.println();

        icecream = new JustChocolate();
        icecream = new OreoCrumbs(icecream);
        icecream = new Sprinkles(icecream);
        //icecream = new ReesesPeanutButter(icecream);

        System.out.println("Description " + icecream.getDescription());
        System.out.println();
        System.out.println("Price: $" + icecream.getPrice());
        
        System.out.println("");
        
        System.out.println("Have a nice day! See you next time!");

    }

}
