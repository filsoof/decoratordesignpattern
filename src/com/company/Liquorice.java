package com.company;

public class Liquorice extends ToppingDecorator{


    public Liquorice(icecream newIcecream) {
        super(newIcecream);

        System.out.println("Adding Liquorice topping");


    }

    public String getDescription()
    {

        return tempIceream.getDescription() + ", Liquorice topping";

    }



    public double getCost()
    {

        return tempIceream.getCost() + 12;

    }

}