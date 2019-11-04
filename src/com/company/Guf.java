package com.company;

public class Guf extends ToppingDecorator{


   public Guf(icecream newIcecream) {
       super(newIcecream);

       System.out.println("Adding Guf topping");


   }

    public String getDescription()
    {

        return tempIceream.getDescription() + ", Guf";

    }



    public double getCost()
    {

        return tempIceream.getCost() + 10;

    }

    }

