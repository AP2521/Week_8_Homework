package java_pg;

import java.util.Scanner;

/*
3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class Pg3_Vowel {
    public static void vowel(){
        Scanner s=new Scanner(System.in);
        System.out.println("Input an alphabet : ");
        while (s.hasNextInt()) { //Declare method to not enter number
            System.out.println("Enter alphabet :");
            s.next();}
          String alphabet =s.next();
          if( alphabet.equalsIgnoreCase("a")||  //Declare method to enter alphabet
        alphabet.equalsIgnoreCase("e")||
        alphabet.equalsIgnoreCase("i")||
        alphabet.equalsIgnoreCase("o")||
        alphabet.equalsIgnoreCase("u")){
              System.out.println("Input letter is Vowel");} //Declare vowel alphabet
          else if(alphabet.length()>1){                  //Declare length
              System.out.println("Invalid entry");}
          else {                                     //Declare consonant alphabet
              System.out.println("Input letter is Consonant");
          }
    }

    public static void main(String[] args) {
        vowel();
    }
}
