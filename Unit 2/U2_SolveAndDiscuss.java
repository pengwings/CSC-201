import java.util.Scanner;
public class U2_SolveAndDiscuss {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextInt();
        }
        printDistinctArray(array);
    }

    public static void printDistinctArray(int[] array) {
        int[] copy = new int[array.length];
        int counter = 1;
        copy[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= counter; j++) {
                if (array[i] == copy[j]) {
                    break;
                }
                if (j == counter){
                    copy[counter] = array[i];
                    counter++;
                    break;
                }
            }
        }
        for(int k=0; k<counter; k++){
            System.out.print(copy[k] + " ");
        }
    }
}



