import java.util.Scanner;
/**
 * Created by Brian Yu on 9/3/2017.
 * def complex
 *  prompt user to enter real component and imaginary component of the first complex number
 *  prompt user to enter real component and imaginary component of the 2nd complex number
 *  print results of add, subtract, multiply, and divide methods
 *
 * def addcomplex(a1, a2, b1, b2)
 *  return (a1+a2) +  i*(b1+b2)
 * def subtractcomplex(a1, a2, b1, b2)
 *  return (a1-a2) +  i*(b1-b2)
 * def multiplycomplex(a1, a2, b1, b2)
 *  return (a1*a2 – b1*b2) + i*(a1*b2 + b1*a2)
 * def dividecomplex(a1, a2, b1, b2)
 *  return (a1*a2 +b1*b2)/(a2^2 + b2^2) + i*(b1*a2 – a1*b2)/(a2^2 + b2^2)
 */
public class U1_Problem4 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the real component of the first complex number.");
        int a1 = keyboard.nextInt();
        System.out.println("Please enter the imaginary component of the first complex number.");
        int b1 = keyboard.nextInt();
        System.out.println("Please enter the real component of the second complex number.");
        int a2 = keyboard.nextInt();
        System.out.println("Please enter the imaginary component of the second complex number.");
        int b2 = keyboard.nextInt();
        System.out.println("The sum of the two complex numbers is " + addComplex(a1, a2, b1, b2));
        System.out.println("The difference of the two complex numbers is " + subtractComplex(a1, a2, b1, b2));
        System.out.println("The product of the two complex numbers is " + multiplyComplex(a1, a2, b1, b2));
        System.out.println("The quotient of the two complex numbers is " + divideComplex(a1, a2, b1, b2));
    }

    public static String addComplex(int a1, int a2, int b1, int b2){
        int asum, bsum;
        asum = a1+a2;
        bsum = b1+b2;
        String sum = asum + " + " + bsum + "i";
        return sum;
    }

    public static String subtractComplex(int a1, int a2, int b1, int b2){
        int adifference, bdifference;
        adifference = a1-a2;
        bdifference = b1-b2;
        String difference = adifference + " + " + bdifference + "i";
        return difference;
    }

    public static String multiplyComplex(int a1, int a2, int b1, int b2){
        int aproduct, bproduct;
        aproduct = (a1*a2) - (b1*b2);
        bproduct = (a1*b2) + (b1*a2);
        String product = aproduct + " + " + bproduct + "i";
        return product;
    }

    public static String divideComplex(int a1, int a2, int b1, int b2){
        double aquotient, bquotient;
        aquotient = (double)((a1*a2)+(b1*b2))/((a2*a2)+(b2*b2));
        bquotient = (double)((b1*a2)-(a1*b2))/((a2*a2)+(b2*b2));
        String quotient = aquotient + " + " + bquotient + "i";
        return quotient;
    }
}
