import java.util.Scanner;

/**
 * Created by Brian Yu on 9/1/2017.
 * def studentidproblem
 *  prompt user to input studentid
 *  studentid = integer input by user
 *  chapternumber = (studentid%4)+2
 *  switch(chapternumber)
 *      case 2: problemnumber = (studentid%23)+1
 *      case 3: problemnumber = (studentid%34)+1
 *      case 4: chapternumber = 6
 *              problemnumber = (studentid%38)+1
 *      case 5: problemnumber = (studentid%46)+1
 *      case 6: problemnumber = (studentid%38)+1
 *  print problemnumber and chapternumber
 *  prompt user to input pagenumber
 *  pagenumber = integer input by user
 *  print "Please solve programming exercise " + problemnumber + " from chapter " + chapternumber + ", from page " + pagenumber + "."
 */
public class U1_Problem1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your student id.");
        int studentId = keyboard.nextInt();
        int chapterNumber = (studentId % 4) + 2;
        int problemNumber = 0;
        switch (chapterNumber) {
            case 2:
                problemNumber = (studentId % 23) + 1;
                break;
            case 3:
                problemNumber = (studentId % 34) + 1;
                break;
            case 4: chapterNumber = 6;
                problemNumber = (studentId%38)+1;
                break;
            case 5: problemNumber = (studentId%46)+1;
                break;
            case 6: problemNumber = (studentId%38)+1;
                break;
            default: System.out.println("Please enter a valid student id.");
                System.exit(0);
        }
        System.out.println("You have been assigned problem number " + problemNumber + " in Chapter " + chapterNumber + ". Please enter the page number this problem is located on.");
        int pageNumber = keyboard.nextInt();
        System.out.println("Please solve programming exercise " + problemNumber + " from chapter " + chapterNumber + ", from page " + pageNumber + ".");
    }
}
