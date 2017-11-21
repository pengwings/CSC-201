// Created by Brian Yu on 10/8/2017
// def testCycle
// create two Cycle objects using both constructors
// display both objects using toString method

public class Problem2 {
    public static void main(String[] args){
        Cycle test = new Cycle();
        System.out.println(test.toString());
        Cycle test2 = new Cycle(2,20);
        System.out.println(test2.toString());
    }
}
