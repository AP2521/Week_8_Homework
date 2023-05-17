package java_pg.poolarea;
/*
1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.

In case the width parameter is lessthan 0 it needs to set the width field value to 0.
In case the length parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getWidth without any parameters, it needsto return the value of the width
field.
● Method named getLength without any parameters, it needsto return the value ofthe length
field.
● Method named getArea without any parameters, it needsto return the calculated area
(width * length).
 */
public class Retangle {
    double width,length;  //instance variable
    public Retangle(double width, double length){  //constructor with parameters width and length
        if (width<0){this.width=0;}
        if(length<0){this.length=0;}
        this.width=width;
        this.length=length;
    }

    public double getWidth() { return width;}//getWidth it needsto return the value of the width field.
   public double getLength(){ return length;}//getLength it needsto return the value ofthe length field.
   public double getArea(){//getArea it needsto return the calculated area (width * length)
      double area= (width*length);
        return area;}


}
