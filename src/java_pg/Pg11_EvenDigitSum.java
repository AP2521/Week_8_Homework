package java_pg;
/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Pg11_EvenDigitSum {
    public static void getEvenDigitSum(int number){
        int sum, a=0;
        int num2=number;
        if(number>0){
           while (number!=0){
               sum=number%10;
               if (sum%2==0)
                   a=a+sum;
                   number=number/10;
               }

               System.out.println("sum of all evendigit number " + num2 + " is :" + a);

        }else {
            System.out.println("sum of all evendigit number " + num2 + " is :" + -1);
        }

    }

    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
}
