/* Created by Brian Yu on 9/17/2017
def yearlytemp()
    print out results
def inputTempforMonth(month, temps)
    accept input for month and temp
def inputTempforYear()
    accept input for high and low temps for each month for a year
def calculateAverageHigh(temps)
    calculate average high temp
def calculateAverageLow(temps)
    calculate average low temp
def findHighestTemp(temps)
    compare temps against each other to find max
def findLowestTemp(temps)
    compare temps against each other to find min
 */

import java.util.Scanner;
public class U2_Problem3 {

        public static void main(String[] args){
            int[][] temps = inputTempForYear();
            System.out.println("The average low temp is " + calculateAverageLow(temps));
            System.out.println("The average high temp is " + calculateAverageHigh(temps));
            System.out.println("The lowest temp of the year is " + temps[0][findLowestTemp(temps)]);
            System.out.println("The highest temp of the year is " + temps[1][findHighestTemp(temps)]);
        }

        public static void inputTempforMonth(int month, int[][] temperatures){ //input high/low temp for each month
          int mon = month;
          int[][] temp = new int[1][1];
          temp = temperatures;
        }

        public static int[][] inputTempForYear(){ //returns array of temperatures for year
            Scanner keyboard = new Scanner(System.in);
            int[][] temperatures = new int[2][12];
            for(int i=0; i<12; i++) {
                System.out.println("Please enter in the lowest temperature for month " + (i+1));
                int low = keyboard.nextInt();
                temperatures[0][i] = low;
                System.out.println("Please enter in the highest temperature for month " + (i+1));
                int high = keyboard.nextInt();
                temperatures[1][i] = high;
            }
            return temperatures;
        }

        public static float calculateAverageHigh(int[][] temperatures){ //returns average high temperature for year
            float high = 0;
            float highaverage = 0;
            for(int i=0; i<12; i++){
                high = temperatures[1][i] + high;
            }
            highaverage = high/12;
            return highaverage;
        }

        public static float calculateAverageLow(int[][] temperatures){ //returns average low temperature
            float low = 0;
            float lowaverage = 0;
            for(int i=0; i<12; i++){
                low = temperatures[0][i] + low;
            }
            lowaverage = low/12;
            return lowaverage;
        }

        public static int findHighestTemp(int[][] temperatures){
            int high = temperatures[1][0];
            int highIndex = 0;
            for(int i=0; i<12; i++){
                if(temperatures[1][i]>high){
                    high = temperatures[1][i];
                    highIndex = i;
                }
            }
            return highIndex;
        }

        public static int findLowestTemp(int[][] temperatures){
            int low = temperatures[0][0];
            int lowIndex = 0;
            for(int i=0; i<12; i++){
                if(temperatures[0][i]<low){
                    low = temperatures[0][i];
                    lowIndex = i;
                }
            }
            return lowIndex;
        }
    }


