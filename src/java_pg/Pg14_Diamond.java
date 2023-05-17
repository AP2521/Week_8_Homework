package java_pg;
/*
14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
 */
public class Pg14_Diamond {
    public static void diamond(){
        int row=6;
        int i =1;
        while (i<=6){
            int j=1;    //print upper part
            while(j<7-i){
                System.out.print(" ");//print space
                j++;}
            int k=i;
            while(k>=1){
                System.out.print("*");//print number
                k--;}
            int l=2;
            while(l<=i){
                System.out.print("*");//print number
                l++;}

        System.out.println();i++;}
        i=row-1;
        while(i>=1){  //print lower part
            for(int j=0; j<=row-1-i; j++){
                System.out.print(" ");//print space
            }
            int k=i;
            while(k>=1){
                System.out.print("*");
                k--;
            }
            int l=2;
            while(l<=i){
                System.out.print("*");
                l++;
            }
            System.out.println();
            i--;
        }

        }


    public static void main(String[] args) {
        diamond();
    }
}
