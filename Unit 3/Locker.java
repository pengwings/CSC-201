// Created by Brian Yu on 10/8/2017
import java.util.Scanner;

public class Locker {
    private String studentName;
    private int lockerNumber, books;
    private boolean lockerOpen;
    private CombinationLock lock;

    public Locker() {
        this.studentName = null;
        this.lockerNumber = 0;
        this.books = 0;
        this.lockerOpen = false;
        this.lock = new CombinationLock();
    }

    public Locker(String studentName, int lockerNumber, int books, boolean lockerOpen, CombinationLock lock) {
        this.studentName = studentName;
        this.lockerNumber = lockerNumber;
        this.books = books;
        this.lockerOpen = lockerOpen;
        this.lock = lock;
    }

    public void putBookInLocker(){
        this.books++;
    }

    public void removeBookFromLocker(){
        this.books--;
    }

    public void openLocker() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of ticks to turn the lock to the right.");
        int turn1 = keyboard.nextInt();
        System.out.println("Please enter the number of ticks to turn the lock to the left.");
        int turn2 = keyboard.nextInt();
        System.out.println("Please enter the number of ticks to turn the lock to the right.");
        int turn3 = keyboard.nextInt();
        this.lock.openLock(turn1, turn2, turn3);
        if(!lock.isLockStatus()){
            this.lockerOpen = true;
            System.out.println("The locker door has been opened.");
        } else {
            System.out.println("The locker door failed to open.");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public boolean isLockerOpen() {
        return lockerOpen;
    }

    public void setLockerOpen(boolean lockerOpen) {
        this.lockerOpen = lockerOpen;
    }

    public CombinationLock getLock() {
        return lock;
    }

    public void setLock(CombinationLock lock) {
        this.lock = lock;
    }

    public void printLocker(){
        System.out.println("This locker number " + this.lockerNumber + " belongs to " + this.studentName + " and the door status is " + this.lockerOpen);
        this.lock.printComboLock();
    }
}
