/**
 * Created by byu on 11/19/2017.
 */
abstract class PayCalculator {
    double payRate;

    public double computePay(double hours) {
        return hours*this.payRate;
    }
}

class RegularPay extends PayCalculator {

    public RegularPay(double payRate){
        this.payRate = payRate;
    }

}

class HazardPay extends PayCalculator {

    public HazardPay(double payRate) {
        this.payRate = payRate;
    }

    public double computePay(double hours) {
        return hours* this.payRate * 1.5;
    }
}
