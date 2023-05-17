package java_pg;

import java.util.Scanner;

/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class pg10_Armstrong {
    public static void armstrong(){
        int remainder,num1=0,num2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter input : ");
        int num =s.nextInt();
        num2=num;
        while (num2!=0){
           remainder = num2 % 10;
           num1 += Math.pow(remainder,3);
           num2 /= 10;}
        if(num1==num){
            System.out.println(num+" is a armstrong number");
        }
        else {
            System.out.println(num+" is not a armstrong number");
        }
    }

    public static void main(String[] args) {
        armstrong();
    }
}
