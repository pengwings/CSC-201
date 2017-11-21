/**
 * Created by byu on 11/19/2017.
 */
public class PayCalculatorTest {
    public static void main(String[] args){
        double hours = 10;
        double payRate = 7.5;

        RegularPay testPay = new RegularPay(payRate);
        System.out.println(testPay.computePay(hours));

        HazardPay testHazard = new HazardPay(payRate);
        System.out.println(testHazard.computePay(hours));
    }
}