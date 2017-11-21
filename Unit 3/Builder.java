// Created by Brian Yu on 10/8/2017
//def Builder
//  create stringbuilder object that accepts user string input
//  display capacity of stringbuilder object
//  insert user input string into string builder object
//  display final results

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type in \" Java is fun! \"");
        StringBuilder test = new StringBuilder(keyboard.nextLine());
        System.out.println("The capacity for this stringbuilder object is " + test.capacity());
        test.append("I love it!");
        System.out.println("Please type in \"Yes, \"");
        test.insert(12, keyboard.nextLine());
        System.out.println(test);
    }
}
