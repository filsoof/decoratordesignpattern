package com.company;

public class Chocolatesauce extends ToppingDecorator{


    public Chocolatesauce(icecream newIcecream) {
        super(newIcecream);

        System.out.println("Adding chocolate sauce");


    }

    public String getDescription()
    {

        return tempIceream.getDescription() + ", Chocolate sauce";

    }



    public double getCost()
    {

        return tempIceream.getCost() + 10;

    }

}