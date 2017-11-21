// Created by Brian Yu on 10/8/2017
// def Volume
//   create data fields volumeName, numberOfBooks, and Book[]
//   constructor that takes paramters for all 3 data fields
//   toString method that displays all data fields in String
//   getBookArray to return strings for the properties of all the books in the volume

public class Volume {
    private String volumeName;
    private int numberOfBooks;
    private Book[] Book;

    public Volume(String volumeName, int numberOfBooks, Book[] books){
        this.volumeName = volumeName;
        this.numberOfBooks = numberOfBooks;
        this.Book = books;
    }

    public String toString(){
        String volume = "The name of this volume is " + volumeName + " and it has " + numberOfBooks + " books.  The books in the volume are: " + this.getBookArray();
        return volume;
    }

    public String getBookArray(){
        String booksInVolume = "";
        for(int i = 0; i<Book.length; i++){
            booksInVolume += Book[i].toString();
        }
        return booksInVolume;
    }



}
