import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a ;
        System.out.println("Enter the vehicle wheel");
         a = inp.nextInt();        
        if(a==2) {
            Bike b = new Bike();
            b.Bike();
            b.startEngine();
            System.out.println("Milleage is"+" "+ b.mileage(200,5));
        }
        else if(a==4) {
            Car c = new Car();
            c.Car();
            c.startEngine();
            System.out.println("Milleage is"+" "+ c.mileage(200,20));
        }
        else if(a==8){
            Bus bs = new Bus();
            bs.Bus();
            bs.startEngine();
            System.out.println("Milleage is"+" "+ bs.mileage(200,15));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    
}
