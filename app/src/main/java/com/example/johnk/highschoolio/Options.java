package com.example.johnk.highschoolio;

public class Options
{
    private double price;
    private String name, description;

    public Options(String aName, String aDescription, double aPrice)
    {
        aName = name;
        aDescription = description;
        aPrice = price;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }
}
