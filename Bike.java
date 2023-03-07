public  class Bike extends Vehicle {
    int numWheels= 2;
    int numSeats = 2;
    String engineType = "200CC";
    
    public void Bike() {
        System.out.println("Basic Bike Function");
        System.out.println("Number of wheels"+" "+numWheels);
        System.out.println("Number of seats"+" "+numSeats);
        System.out.println("Engine efficiency"+" "+engineType);
        System.out.println("*Clutch\n*Grear Shifter\n*Horn\n*Headlight\n*Mirror\n*Choke");
    }

        
    public void startEngine() {
        System.out.println("Self or kick");
    }

    @Override
    public int mileage(int dis,int fuel) {
            return dis/fuel;
    }
}