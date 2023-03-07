public class Car extends Vehicle {
    int numWheels = 4;
    int numSeats =5;
    String engineType = "1000CC";

    public void Car() {
        System.out.println("Basic Car funcitons");
        System.out.println("Number of wheels"+" "+numWheels);
        System.out.println("Number of seats"+" "+numSeats);
        System.out.println("Engine efficiency"+" "+engineType);
        System.out.println("*Window Lock\n*Parking Sensor\n*Child safety lock\n*Airbag Detection\n*Seat Adjustment");
    }
    
    public void startEngine() {
        System.out.println("Automatic and Manual");
    }

    public int mileage(int dis, int fuel) {
        return dis/fuel;
    }
}
