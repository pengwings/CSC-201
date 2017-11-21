// Created by Brian Yu on 10/8/2017
// def Book
//   create data fields Title, Author, and numberOfPages
//   constructor that takes paramters for all 3 data fields
//   toString method that displays all data fields in String

public class Book {
    private String Title, Author;
    private int numberOfPages;

    public Book(String Title, String Author, int numberOfPages){
        this.Title = Title;
        this.Author = Author;
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        String book = "The title of this book is " + Title + " and the author is " +  Author + " and it has " + numberOfPages + " pages. ";
        return book;
    }
}
