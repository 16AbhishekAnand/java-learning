public class Bus extends Vehicle {

 int numWheels = 8;
    int numSeats =40;
    String engineType = "2500CC";

    public void Bus() {
        System.out.println("Basic Bus funcitons");
        System.out.println("Number of wheels"+" "+numWheels);
        System.out.println("Number of seats"+" "+numSeats);
        System.out.println("Engine efficiency"+" "+engineType);
        System.out.println("*Window \n*Fan\n*Child safety lock\n*Airbag Detection\n*Seat Adjustment");
    }
    
    public void startEngine() {
        System.out.println("Manual");
    }

    public int mileage(int dis, int fuel) {
        return dis/fuel;
    }
}
