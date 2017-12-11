import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class BudgetDriver {
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the month for your budget.");
        String month = keyboard.next();
        System.out.println("Please enter the year for your budget");
        int year = keyboard.nextInt();
        System.out.println("Please enter in the total amount for your budget.");
        double budgetAmount = keyboard.nextDouble();

        Budget budget = new Budget(month, year, budgetAmount);
        boolean amountVerification = false;
        BudgetCategory category1, category2, category3;

        do {
            category1 = createBudgetCategory();
            category2 = createBudgetCategory();
            category3 = createBudgetCategory();
            if(budget.getTotalAmount() != category1.getTotalAmount() + category2.getTotalAmount() +  category3.getTotalAmount()){
                System.out.println("Your category budgets do not add up, please re-enter.");
            } else {
                amountVerification = true;
            }
        } while(!amountVerification);

        printBudget(budget, category1, category2, category3);

        Transaction transaction1 = enterTransaction();
        calculateCategoryBudget(transaction1.getAmount(), transaction1.getCategory(), category1, category2, category3);
        budget.calculateCurrentAmount(transaction1.getAmount());
        Transaction transaction2 = enterTransaction();
        calculateCategoryBudget(transaction2.getAmount(), transaction2.getCategory(), category1, category2, category3);
        budget.calculateCurrentAmount(transaction2.getAmount());
        Transaction transaction3 = enterTransaction();
        calculateCategoryBudget(transaction3.getAmount(), transaction3.getCategory(), category1, category2, category3);
        budget.calculateCurrentAmount(transaction3.getAmount());
        Transaction transaction4 = enterTransaction();
        calculateCategoryBudget(transaction4.getAmount(), transaction4.getCategory(), category1, category2, category3);
        budget.calculateCurrentAmount(transaction4.getAmount());
        Transaction transaction5 = enterTransaction();
        calculateCategoryBudget(transaction5.getAmount(), transaction5.getCategory(), category1, category2, category3);
        budget.calculateCurrentAmount(transaction5.getAmount());

        printBudget(budget, category1, category2, category3);


    }

    public static BudgetCategory createBudgetCategory(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a name for your category in your budget.");
        String categoryName = keyboard.next();
        System.out.println("Please enter an amount for the category.");
        double categoryAmount = keyboard.nextDouble();
        BudgetCategory category = new BudgetCategory(categoryAmount, categoryName);
        return category;
    }

    public static Transaction enterTransaction() throws Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a transaction amount.");
        double transactionAmount = keyboard.nextDouble();
        System.out.println("Please enter the reason for the transaction.");
        String transactionName = keyboard.next();
        System.out.println("Please enter the category for the transaction.");
        String transactionCategory = keyboard.next();
        System.out.println("Please enter the date of the transaction in mm/dd/yyyy format.");
        String date = keyboard.next();
        SimpleDateFormat formatdate = new SimpleDateFormat(date);
        Date transactionDate = formatdate.parse(date);
        Transaction transaction = new Transaction(transactionName, transactionAmount, transactionDate, transactionCategory);
        return transaction;
    }

    public static void calculateCategoryBudget(double transactionAmount, String category, BudgetCategory category1, BudgetCategory category2, BudgetCategory category3) {
        if(category.equals(category1.getCategoryName())){
            category1.calculateCurrentAmount(transactionAmount);
        } else if(category.equals(category2.getCategoryName())){
            category2.calculateCurrentAmount(transactionAmount);
        } else {
            category3.calculateCurrentAmount(transactionAmount);
        }
    }


    public static void printBudget(Budget budget, BudgetCategory category1, BudgetCategory category2, BudgetCategory category3){
        System.out.println("The budget for " + budget.getMonth() + " " + budget.getYear() + " is $" + budget.getCurrentAmount() + ".");
        System.out.println(category1.getCategoryName() + ": $" + category1.getCurrentAmount());
        System.out.println(category2.getCategoryName() + ": $" + category2.getCurrentAmount());
        System.out.println(category3.getCategoryName() + ": $" + category3.getCurrentAmount());

}
}
