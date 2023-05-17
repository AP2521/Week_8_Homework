package java_pg;
/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Pg8_Triangle {
    public static void triangle(){
            for (int i=0;i<5;i++){
                for (int j=0;j<i;j++){
                    System.out.print("@");}
                System.out.println("@");
            }
        }

    public static void main(String[] args) {
        triangle();
    }
    }

