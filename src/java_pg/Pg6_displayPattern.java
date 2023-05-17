package java_pg;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Pg6_displayPattern {
    public static void pattern(){
        Scanner s=new Scanner(System.in);
        System.out.println("Input number of rows : ");
         int num =s.nextInt();
         for(int j=0;j<=num;j++){
             for (int i=1;i<=j;i++){
             System.out.print(i);}
             System.out.println();}
    }

    public static void main(String[] args) {
        pattern();
    }
}
