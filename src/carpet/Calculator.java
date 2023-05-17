package carpet;

public class Calculator {
    ////Declare two instance variables
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        double total= floor.getArea()*carpet.getCost();
        return total;
    }
}
