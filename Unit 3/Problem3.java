// Created by Brian Yu on 10/8/2017
// def Problem3
//   create book array to put in volume
//   construct volume using constructor
//   print out properties using toString method in Volume class

public class Problem3 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        for(int i = 0; i<books.length; i++) {
            books[i] = new Book("Test Book " + (i+1), "Test", 50 );
        }
        Volume volume = new Volume("Test Volume", 3, books);
        System.out.println(volume.toString());
    }
}
