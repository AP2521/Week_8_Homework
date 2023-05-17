package java_pg;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Pg9_FibonacciNo {
    static int a=0,b=1,c;
    public static void num(){
        for(int i=0;i<7;++i) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }

    }

    public static void main(String[] args) {
        System.out.print(b+" ");
        num();
    }
}
