// Created by Brian Yu on 10/8/2017
// def CharacterArray
//   call on stringbuilder with address string
//   create for loop to check every character of the string to see if its a digit or letter, spaces are skipped
//   depending on whether its a letter or a digit, it is either changed in case or replaced with *
//   print final results

public class CharacterArray {
    public static void main(String[] args){
        StringBuilder address = new StringBuilder("6901 Sudley Road Manassas VA");
        for(int i = 0; i<address.length(); i++){
            System.out.println(address.charAt(i));
            if(Character.isDigit(address.charAt(i))){
                System.out.println("The character is a digit");
                address.setCharAt(i, '*');
            } else if(Character.isLetter(address.charAt(i))){
                System.out.println("The character is a letter");
                if(Character.isUpperCase(address.charAt(i))){
                    address.setCharAt(i, Character.toLowerCase(address.charAt(i)));
                } else {
                    address.setCharAt(i, Character.toUpperCase(address.charAt(i)));
                }
            }
        }
        System.out.println(address);
    }

}
