package java_pg;

import java.util.Scanner;

/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class Pg2_MinAndMaxInputChallenge {
    public static void minMax(){
        int i;
        int min=0, max=0;
        Scanner s=new Scanner(System.in);
        while (true) {
             System.out.println("Enter number : ");
             if (s.hasNextInt()){
                 int number =s.nextInt();
                 if(number>max){   //Declare max value
                     max=number;}
                 if (number<max) { min=number;}  //Declare min value
             }
             else {
                 System.out.println("maximun number : "+max);
                 System.out.println("minimum number : "+min);
                 break;
             }
    }
}      public static void main(String[] args) {
        minMax();
    }
}
