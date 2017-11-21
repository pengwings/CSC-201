import java.util.Scanner;
/**
 * Created by Brian Yu on 9/3/2017.
 * def brokengps
 *  int x = 0
 *  int y = 0
 *  double distance = 0
 *  int time in 5 minute intervals = 0
 *  for(every 5 minute interval)
 *      generate random integer from 0 to 3
 *          switch(random integer from 0 to 3)
 *              case 0: add 5 miles east
 *              case 1: add 5 miles west
 *              case 2: add 5 miles north
 *              case 3: add 5 miles south
 *  calculate distance square root of (xfinal - xorigin)^2 + (yfinal - yorigin)^2
 */
public class U1_Problem3 {
    public static void main(String[] args){
        int coordinatex = 0; //initial x coordinate
        int coordinatey = 0; //initial y coordinate
        double distance = 0; //distance from initial point

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the time the car traveled in 5 minute increments.");
        int time = keyboard.nextInt(); //time in 5 minute increments

        for(int i = 0; i<time; i++){
            int random = (int)(Math.random()*4);
                switch(random) {
                    case 0: coordinatex = coordinatex + 5; //go East at intersection
                        break;
                    case 1: coordinatex = coordinatex - 5; //go West at intersection
                        break;
                    case 2: coordinatey = coordinatey + 5; //go North at intersection
                        break;
                    case 3: coordinatey = coordinatey - 5; //go South at intersection
                        break;
                    default: break;
                }
        }
        distance = Math.sqrt((coordinatex*coordinatex)+(coordinatey*coordinatey));
        System.out.println("The distance between the car's final location (" + coordinatex + ", " + coordinatey + ") after " + (double)(time/12.0) + " hour(s) is " + distance + " miles away from the origin.");
    }
}
