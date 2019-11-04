package com.company;

abstract class ToppingDecorator implements icecream {

    protected icecream tempIceream;

    public ToppingDecorator(icecream newIcecream) {

        tempIceream = newIcecream;

    }

    public String getDescription()
    {

        return tempIceream.getDescription();

    }

    public double getCost()
    {

        return tempIceream.getCost();

    }


}
