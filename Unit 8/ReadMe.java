import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadMe {
    public static void main(String[] args){

        try {
            RandomAccessFile pledge = new RandomAccessFile("pledge.txt", "rw");
            pledge.seek(124);
            System.out.println((char)pledge.read());
            pledge.seek(135);
            System.out.println((char)pledge.read());
            pledge.close();
        } catch(FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch(IOException e) {
            System.out.println("An error with the file occurred.");
        }
    }
}
