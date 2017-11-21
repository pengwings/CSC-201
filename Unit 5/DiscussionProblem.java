import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DiscussionProblem {
    public static void main(String[] args) throws IOException{
        File salary = new File("Salary.txt");
        if(!salary.exists()) {
            throw new IOException("File does not exist.");
        }
        Scanner fileScanner = new Scanner(salary);
        double assistantTotal = 0;
        double assistantCount = 0;
        double assistantAverage = 0;
        double associateTotal = 0;
        double associateCount = 0;
        double associateAverage = 0;
        double fullTotal = 0;
        double fullCount = 0;
        double fullAverage = 0;

        while(fileScanner.hasNext()) {
            String test = fileScanner.nextLine();
                if(test.matches("(.*)assistant(.*)")){
                    String incomeString[] = test.split(" ");
                    double assistant = Double.parseDouble(incomeString[3]);
                    assistantTotal += assistant;
                    assistantCount++;
                } else if(test.matches("(.*)associate(.*)")) {
                    String incomeString[] = test.split(" ");
                    double associate = Double.parseDouble(incomeString[3]);
                    associateTotal += associate;
                    associateCount++;
                } else if(test.matches("(.*)full(.*)")) {
                    String incomeString[] = test.split(" ");
                    double full = Double.parseDouble(incomeString[3]);
                    fullTotal += full;
                    fullCount++;
                }
        }
        System.out.printf("Total Assistant Salary: $%2f", assistantTotal);
        System.out.printf("\nAverage Assistant Salary: $%2f", (assistantTotal/assistantCount));
        System.out.printf("\nTotal Associate Salary: $%2f", associateTotal);
        System.out.printf("\nAverage Associate Salary: $%2f", (associateTotal/associateCount));
        System.out.printf("\nTotal Full Salary: $%2f", fullTotal);
        System.out.printf("\nAverage Full Salary: $%2f", (fullTotal/fullCount));
        System.out.printf("\nTotal Salary: $%2f", (assistantTotal + associateTotal + fullTotal));
        System.out.printf("\nAverage Salary: $%2f", ((assistantTotal + associateTotal + fullTotal)/(assistantCount + associateCount + fullCount)));
    }
}
