import java.util.Scanner;
/**
 * Created by byu on 9/3/2017.
 */
public class U1_Problem2Test {
    public static void main(String args[]){
        U1_Problem2 machine = new U1_Problem2();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many products would you like to buy today?");
        int amount = keyboard.nextInt();
        for(int i = 0; i< amount; i++) {
            System.out.println("Please choice product 1-5");
            int choice = keyboard.nextInt();
            int price = machine.getPrice(choice);
            System.out.println("The price is " + price + " cents.");
            int money = machine.insertMoney();
            String change = machine.calculateChange(money, price);
            System.out.println(change);
        }

    }
}
