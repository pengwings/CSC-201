public class BudgetCategory extends Budget {
    private String categoryName;

    public BudgetCategory(){

    }

    public BudgetCategory(double budgetAmount, String categoryName) {
        this.setCurrentAmount(budgetAmount);
        this.setTotalAmount(budgetAmount);
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
