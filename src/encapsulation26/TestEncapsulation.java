package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);
        // Displaying values of the variables
        System.out.println("CodeBusters name: " +obj.getName());
        System.out.println("CodeBuster age: " +obj.getAge());
        System.out.println("CodeBuster rollNo: " +obj.getRollNo());
    }
}