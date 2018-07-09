package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StarbuzzCoffee coffeeShop = new StarbuzzCoffee();
        Beverage testDrink = coffeeShop.makeDoubleMochaSoyLatteWithWhip();
        Beverage testDrink2 = coffeeShop.makeHouseBlendSoyWhipMocha();

        System.out.println(testDrink.getDescription());
        System.out.println(testDrink.getCost());

        System.out.println(testDrink2.getDescription());
        System.out.println(testDrink2.getCost());
    }
}
