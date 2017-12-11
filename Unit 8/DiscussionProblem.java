import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class DiscussionProblem {
    public static void main (String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter encrypted file");
        String inputFile = keyboard.next();
        System.out.println("Please enter file name for decrypted file");
        String outputFile = keyboard.next();

        try(
            RandomAccessFile encryptedFile = new RandomAccessFile(inputFile, "r");
            RandomAccessFile decryptedFile = new RandomAccessFile(outputFile, "rw");
        ) {
            int key;
            encryptedFile.seek(0);
            while((key = encryptedFile.read())!= -1){
                decryptedFile.write(((byte)key)-5);
            }

        }
    }
}
