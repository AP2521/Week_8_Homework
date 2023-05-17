package java_pg;

import java.util.Scanner;

/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17... are the prime numbers.)
 */
public class Pg12_PrimeNUM {
    public static void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input : ");
        int num = s.nextInt();
        boolean a = false;
      for (int i=2 ; i<=num/2; i++) {
            if (num % i == 0) {
              a=true;
            }}
            if (!a){
                System.out.println(num + " is a prime number");
            }
            else {System.out.println(num + " is a not prime number");}
        }





    public static void main(String[] args) {
        input();
    }
    }

