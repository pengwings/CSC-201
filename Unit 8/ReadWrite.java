import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int id = 0;
        double gpa = 0;

        try {
            RandomAccessFile stuFile = new RandomAccessFile("Stu.dat", "rw");
            for(int i = 0; i<5; i++){
                System.out.println("Please enter a student ID");
                id = keyboard.nextInt();
                System.out.println("Please enter the student's GPA");
                gpa = keyboard.nextDouble();
                stuFile.writeInt(id);
                stuFile.writeDouble(gpa);
            }

            while(id>0) {
                System.out.println("Please enter in the student's ID");
                id = keyboard.nextInt();
                stuFile.seek(0);
                long pointerLocation = 0;
                while(pointerLocation < stuFile.length()){
                    int requestedID = stuFile.readInt();
                    if(requestedID  == id){
                        double requestedGPA = stuFile.readDouble();
                        System.out.println("The student's GPA is " + requestedGPA);
                        break;
                    } else {
                        stuFile.readDouble();
                        pointerLocation = stuFile.getFilePointer();
                    }
                }
            }
            stuFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch (IOException e) {
            System.out.println("An error with the file occurred.");
        }
    }
}
