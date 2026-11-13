
import java.util.Scanner;

// Custom Exception
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

// Reservation Class
class Reservation {
    private boolean[] seats;

    Reservation(int totalSeats) {
        seats = new boolean[totalSeats];
    }

    // Method to reserve a seat
    public void reserveSeat(int seatNumber)
            throws SeatAlreadyBookedException {

        if (seatNumber < 1 || seatNumber > seats.length) {
            throw new IllegalArgumentException(
                "Invalid seat number! Please enter between 1 and "
                + seats.length
            );
        }

        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException(
                "Seat " + seatNumber + " is already booked!"
            );
        }

        seats[seatNumber - 1] = true;
        System.out.println(
            "Seat " + seatNumber + " reserved successfully!"
        );
    }
}

// Main Class
public class RailwayReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation(10);

        System.out.println("RAILWAY RESERVATION SYSTEM");
        System.out.println("Total seats available: 10");

        System.out.print("Enter seat number to reserve: ");

        try {
            int seatNumber = sc.nextInt();

            reservation.reserveSeat(seatNumber);

        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Seat: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println(
                "Input Error: Please enter a valid integer."
            );

        } finally {
            System.out.println("Transaction completed.");
            System.out.println("Thank you for using Railway Reservation System!");
            sc.close();
        }
    }
}
