/**
 * Created by Brian Yu on 11/5/2017.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CycleThrowTryCatch {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double wheels = 0;
        double weight = 0;
        boolean match1 = false;
        boolean match2 = false;
        System.out.println("Please enter in the amount of wheels for the cycle as a double.");
        while(!match1) {
            try {
                wheels = keyboard.nextDouble();
                match1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a double.");
                keyboard.next();
            }
        }
        if (wheels <= 0) {
            throw new Exception("Please enter a value greater than 0.");
        }
        System.out.println("Please enter in the weight for the cycle as a double.");
        while(!match2) {
            try {
                if (keyboard.hasNextDouble()) {
                    weight = keyboard.nextDouble();
                    match2 = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a double");
                keyboard.next();
            }
        }
        if (weight <= 0) {
            throw new Exception("Please enter a value greater than 0.");
        }
        Cycle test = new Cycle(wheels, weight);
        System.out.println("The cycle has " + test.getNumberOfWheels() + " wheels and weighs " + test.getWeight());
    }
}

class Cycle {
    private double numberOfWheels, weight;

    public Cycle(double numberOfWheels, double weight){
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }

    public Cycle() {
        this(100, 1000);
    }

    public double getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(double numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString () {
        String bike = "This bike has " + numberOfWheels + " wheels and weighs " + weight + " lbs.";
        return bike;
    }
}





