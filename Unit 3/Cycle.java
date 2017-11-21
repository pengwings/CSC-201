// Created by Brian Yu on 10/8/2017
// def Cycle
//    create data fields for numberOfWheels and weight
//    create constructor for Cycle that accepts 2 parameters for wheels and weight
//    create constructor that calls on previous constructor to construct default with 100 wheels and 1000 weight
//    toString method to convert data fields into String

public class Cycle {
    private int numberOfWheels, weight;

    public Cycle(int numberOfWheels, int weight){
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }

    public Cycle(){
        this(100,1000);
    }

    public String toString(){
        String bike = "This bike has " + numberOfWheels + " wheels and weighs " + weight + " lbs.";
        return bike;
    }
}
