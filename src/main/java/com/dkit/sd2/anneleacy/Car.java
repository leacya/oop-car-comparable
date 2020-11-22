package com.dkit.sd2.anneleacy;

public class Car implements Comparable<Car>
{
    private String make;  //e.g. Toyota
    private String model;  // e.g. Corolla
    private double engineSize;   // e.g.  1.6

    public Car(String make, String model, double engineSize)
    {
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
    }

    // The Car class must implement(define) the compareTo() method
    // because it implements the Comparable interface.
    //     "class Car implements Comparable<Car>"
    // Below we have decided to compare based on engineSize.
    // This defines the 'natural ordering' for Car objects.
    @Override
    public int compareTo(Car other)
    {

        if (this.engineSize < other.engineSize)
        {
            return -1;
        }
        else if (this.engineSize > other.engineSize)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }


    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "{" + "make=" + make
                + ", model=" + model + ", engineSize=" + engineSize + '}';
    }
}
