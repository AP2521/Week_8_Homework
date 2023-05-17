package java_pg;
/*
18. Sum Calculator
Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods(instance methods):
● Method named getFirstNumber without any parameters, it needsto return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter oftype double, it needsto set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter oftype double, it needsto set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needsto return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needsto return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needsto return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needsto return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
OUTPUT:
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
 */
public class Pg18_SimpleCalculator {
    double firstNumber, secondNumber;
    public double getFirstNumber(){return firstNumber;}
    public double getSecondNumber(){return secondNumber;}
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber; }
        public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;}
        public double getAdditionResult(){
        double add=this.firstNumber+this.secondNumber;
        return add;}
    public double getSubtractionResult(){
        double sub=this.firstNumber-this.secondNumber;
        return sub;}
    public double getMultiplicationResult(){
        double mult=this.firstNumber*this.secondNumber;
        return mult;}
    public double getDivisionResult(){
        double division=this.firstNumber/this.secondNumber;
    if (this.secondNumber==0){
        division=0;}
    else {division= this.firstNumber/this.secondNumber;}
    return division;}

    public static void main(String[] args) {
        Pg18_SimpleCalculator calculator = new Pg18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    }

