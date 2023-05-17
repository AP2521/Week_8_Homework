package java_pg;
/*
7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.

Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which

gives us 0+0 and the sum is 0.

* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which

gives us 5+5 and the sum is 10.

* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needsto be defined as public static
 */
public class Pg7_FirstnLastDigitSum {
    public static void sumFirstAndLastDigit(int number){
        int lastDigit, firstDigit;

        while (true){lastDigit=number%10;//Declare lastDigit of the number
            //Declare loop to get firstDigit of the number
            for (firstDigit=0 ;number!=0;number=number/10){
            firstDigit=number;}
            int sum =lastDigit+firstDigit;//Declare sum of both digit
            System.out.println("FirstDigit is "+firstDigit+" and LastDigit is "+lastDigit+" Sum = "+sum);
            break;
        }
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }
}
