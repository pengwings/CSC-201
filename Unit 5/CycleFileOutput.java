/**
 * Created by Brian Yu on 11/5/2017.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CycleFileOutput {
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

        File cycleOutput = new File("CycleOut.txt");
        if(cycleOutput.exists()) {
            throw new IOException("File already exists");
        }

        PrintWriter cycleWriter = new PrintWriter(cycleOutput);
        cycleWriter.println("Number of Wheels: " + test.getNumberOfWheels());
        cycleWriter.println("Weight: " + test.getWeight());
        cycleWriter.close();

        if(cycleOutput.exists()){
            System.out.println("Output file has been created.");
        } else {
            System.out.println("Output file has not been created.");
        }
    }
}

