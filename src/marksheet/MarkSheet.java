package marksheet;

import java.util.Scanner;

public class MarkSheet {
    /*Write a java program to input student Name, roll No, and three subjects Math, Science and English
        marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
        should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
    public static class pg5 {
        public static void MS() {
           double MathMark, ScienceMark, EnglishMark;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Student Name : ");//Declare name
            while (s.hasNextInt()){
                System.out.println("Invalid entry : ");
                System.out.println("Enter Student Name again : ");
               s.next();}
            String name = s.next();

          System.out.println("rollno :");//Declare Rollno.
            while (!s.hasNextInt()){
                System.out.println("Invalid entry : ");
                System.out.println("Enter roll number again : ");
                 s.next();}
            int rollno = s.nextInt();

            System.out.println("Enter marks of Math : ");//Declare MathMarks
            while (!s.hasNextInt()){
                System.out.println("Invalid entry : ");
                System.out.println("Enter marks of Math again : ");
                s.next();}
            MathMark = s.nextInt();
          while ( MathMark > 100){
              System.out.println("Invalid entry Enter number between 0 to 100 : ");
              System.out.println("Enter marks of Math again : ");
              MathMark = s.nextInt();
          }
              System.out.println("Enter marks of Science :");//Declare Science Marks
            while (!s.hasNextInt()){
                System.out.println("Invalid entry : ");
                System.out.println("Enter marks of Science again : ");
                s.next();}
            ScienceMark = s.nextInt();
            while ( ScienceMark > 100){
                System.out.println("Invalid entry Enter number between 0 to 100 : ");
                System.out.println("Enter marks of Science again : ");
                ScienceMark = s.nextInt();}

                System.out.println("Enter marks of English :");//Declare English Marks
            while (!s.hasNextInt()){
                System.out.println("Invalid entry : ");
                System.out.println("Enter marks of English again : ");
                s.next();}
                EnglishMark = s.nextInt();
            while ( EnglishMark > 100){
                System.out.println("Invalid entry Enter number between 0 to 100 : ");
                System.out.println("Enter marks of English again : ");
                EnglishMark = s.nextInt();}

            double Total = MathMark+ScienceMark+EnglishMark;  //Declare Total marks
            double Percentage = (Total/300)*100;              //Declare percentage
            System.out.println("Total Marks :"+Total);
            System.out.println("Percentage :"+Percentage);
            //Declare Marksheet.
            System.out.println("________________________________________");
            System.out.println("|                                      |");
            System.out.println("|          M A R K   S H E E T         |");
            System.out.println("|                                      |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Name          :     "+name+"         |");
            System.out.println("|    Rollno.       :      "+rollno+"            |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Subject       :     Marks         |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Math          :     "+MathMark+"          |");
            System.out.println("|    Science       :     "+ScienceMark+"          |");
            System.out.println("|    English       :     "+EnglishMark+"          |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Total         :     "+Total+"         |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Percentage    :     "+Percentage+"%         |");
            if (Percentage>=35){  //Declare Result
                System.out.println("|      Result      :     Pass          |");}
            else {
                System.out.println("|      Result      :     Fail          |");}
            if (Percentage >=80) {  //Declare Grade
                System.out.println("|      Grade       :     A+            |");
            } else if (Percentage <=79 && Percentage>=60) {
                System.out.println("|      Grade       :      A             |");
            } else if (Percentage<=59  && Percentage >=50) {
                System.out.println("|     Grade        :      B             |");
            }else if (Percentage<=49  && Percentage >=35) {
                System.out.println("|       Grade       :     C             |");}
            else {
                System.out.println("|     Grade         :    Fail           |");};
            System.out.println("|--------------------------------------|");
        }

        public static void main(String[] args) {
            MS();
        }
    }
}
