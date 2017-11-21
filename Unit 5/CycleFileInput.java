/**
 * Created by Brian Yu on 11/5/2017.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CycleFileInput {
    public static void main(String[] args) throws IOException {
        double wheels = 0;
        double weight = 0;
        File cycleInput = new File("CycleIn.txt");
        if(!cycleInput.exists()) {
            throw new IOException("File does not exist.");
        }
        Scanner cycleScanner = new Scanner(cycleInput);
        wheels = cycleScanner.nextDouble();
        weight = cycleScanner.nextDouble();
        cycleScanner.close();
        Cycle test = new Cycle(wheels, weight);
        System.out.println("The cycle has " + test.getNumberOfWheels() + " wheels and weighs " + test.getWeight());
    }
}
