interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    int vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(int number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    int charge;

    TwoWheeler(int number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2)
            charge = parkingHours * 20;
        else
            charge = 40 + (parkingHours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + charge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    int charge;

    FourWheeler(int number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2)
            charge = parkingHours * 50;
        else
            charge = 100 + (parkingHours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + charge);
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingCharge p;

        p = new TwoWheeler(101, 4);
        p.calculateCharge();
        p.displayParkingDetails();

        System.out.println();

        p = new FourWheeler(202, 3);
        p.calculateCharge();
        p.displayParkingDetails();
    }
}
