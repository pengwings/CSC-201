import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FractionLoop {

    public static void main(String[] args){

        Fraction[] fractions = new Fraction[3];
        for(int i = 0; i<3; i++){
            int x = 1;
            fractions[i] = new Fraction(1,x);
            x++;
        }

        try {
            FileOutputStream output = new FileOutputStream("SerialF.dat");
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);
            for(int i = 0; i<3; i++) {
                objectOutput.writeObject(fractions[i]);
            }
            objectOutput.close();
            output.close();
        } catch(FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch(IOException e){
            System.out.println("An error with the file occurred.");
        }
    }
}
