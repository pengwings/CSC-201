import java.util.Date;

public class Transaction {
    private String transactionName;
    private double amount;
    private Date transactionDate;
    private String category;

    public Transaction(){

    }

    public Transaction(String transactionName, double amount, Date transactionDate, String category){
        this.transactionName = transactionName;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.category = category;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
