
class BusReservation {
    boolean seatAvailable = true;

    void bookSeatWithoutSync(String customerName) {
        if (seatAvailable) {
            System.out.println(customerName + " is checking seat availability...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            seatAvailable = false;
            System.out.println(customerName + " successfully booked the seat.");
        } else {
            System.out.println(customerName + " failed to book. Seat is unavailable.");
        }
    }

    synchronized void bookSeatWithSync(String customerName) {
        if (seatAvailable) {
            System.out.println(customerName + " is checking seat availability...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            seatAvailable = false;
            System.out.println(customerName + " successfully booked the seat.");
        } else {
            System.out.println(customerName + " failed to book. Seat is unavailable.");
        }
    }
}

public class BusReservationSystem {
    public static void main(String[] args) {

        System.out.println("=== WITHOUT SYNCHRONIZATION ===");

        BusReservation bus1 = new BusReservation();

        Thread t1 = new Thread(() ->
            bus1.bookSeatWithoutSync("Customer 1"));

        Thread t2 = new Thread(() ->
            bus1.bookSeatWithoutSync("Customer 2"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\n=== WITH SYNCHRONIZATION ===");

        BusReservation bus2 = new BusReservation();

        Thread t3 = new Thread(() ->
            bus2.bookSeatWithSync("Customer 1"));

        Thread t4 = new Thread(() ->
            bus2.bookSeatWithSync("Customer 2"));

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
