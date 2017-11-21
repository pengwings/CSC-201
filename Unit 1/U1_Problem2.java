import java.util.Scanner;
/**
 * Created by Brian Yu on 9/1/2017.
 * def vendingmachine
 *
 */
public class U1_Problem2 {
    private int product1 = 100;
    private int product2 = 125;
    private int product3 = 150;
    private int product4 = 175;
    private int product5 = 200;
    private Scanner keyboard = new Scanner(System.in);

    public U1_Problem2(){
        product1 = 100;
        product2 = 125;
        product3 = 150;
        product4 = 175;
        product5 = 200;
    }

    public int getPrice(int choice){
        int price = 0;
        switch(choice){
            case 1: price = product1;
                break;
            case 2: price = product2;
                break;
            case 3: price = product3;
                break;
            case 4: price = product4;
                break;
        }
        return price;
    }

    public int insertMoney(){
        int money = 0;
        int cash = 0;
        System.out.println("Insert money, first bills then coins.  Type value of money in cents. Type 0 to stop entering money.");
        do {
            cash = keyboard.nextInt();
                while(!(cash == 100 || cash == 500 || cash == 1 || cash == 5 || cash == 10 || cash == 25)){
                    System.out.println("The machine does not accept that denomination, please try again.");
                    cash = keyboard.nextInt();
                }
            money = money + cash;
        } while(cash !=0);
        return money;
    }

    public static String calculateChange(int money, int price){
        int change = money - price;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
            while(change>=25){
                quarters = quarters + 1;
                change = change - 25;
            }
            while(change>=10){
                dimes = dimes + 1;
                change = change - 10;
            }
            while(change>=5){
                nickels = nickels + 1;
                change = change - 5;
            }
            while(change>=1) {
                pennies = pennies + 1;
                change = change - 1;
            }
        String changeincoins = "Your change is given to you as " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.";
        return changeincoins;
    }
}
