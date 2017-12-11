public class Budget {
    private String month;
    private int year;
    private double totalAmount;
    private double currentAmount;

    public Budget() {

    }

    public Budget(String month, int year, double totalAmount){
        this.month = month;
        this.year = year;
        this.totalAmount = totalAmount;
        this.currentAmount = totalAmount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void calculateCurrentAmount(double transactionAmount){
        this.currentAmount = this.currentAmount - transactionAmount;
    }
}
