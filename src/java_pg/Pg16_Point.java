package java_pg;
/*
You have to represent a point in 2D space. Write a class with the name Point. The class needstwo
fields (instance variables) with name x and y of type int.
The class needsto have two constructors. The first constructor does not have any parameters(no-arg
constructor). The second constructor has parameters x and y of type int and it needsto initialize the
fields.
Write the following methods(instance methods):
* Method named getX without any parameters, it needsto return the value of x field.
* Method named getY without any parameters, it needsto return the value of y field.
* Method named setX with one parameter oftype int, it needs to set the value of the x field.
* Method named setY with one parameter oftype int, it needs to set the value of the y field.
* Method named distance without any parameters, it needsto return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needsto return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
 */
public class Pg16_Point {
    int x,y;
    public Pg16_Point(){}
    public Pg16_Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public void setX(int x){this.x= x;}
    public void setY(int y){this.y= y;}
    public double distance() {
    return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));}
    public double distance(int x, int y){
        return Math.sqrt(((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)));}
        public double distance(Pg16_Point second){
            return Math.sqrt(((second.getX()-this.x)*(second.getX()-this.x)+(second.getY()-this.y)*(second.getY()-this.y)));}

    public static void main(String[] args) {
        Pg16_Point first = new Pg16_Point(6, 5);
        Pg16_Point second = new Pg16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Pg16_Point point = new Pg16_Point();
        System.out.println("distance()= " + point.distance());
    }
        }

