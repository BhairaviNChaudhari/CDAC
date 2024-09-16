package Array.Multi.ragged;

/*9.You need to implement a system to manage airplane seat assignments. 
The airplane has seats arranged in rows and columns. Implement functionalities to:
•	Initialize the seating arrangement with a given number of rows and columns.
•	Book a seat to mark it as occupied.
•	Cancel a booking to mark a seat as available.
•	Check seat availability to determine if a specific seat is available.
•	Display the current seating chart. */

import java.util.Scanner;
public class Program {
    private char[][] seats;
    private int rows;
    private int cols;
    Scanner sc = new Scanner(System.in);

    public Program (int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new char[rows][cols];
        initializeSeats(); 
    }

    private void initializeSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; 
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("Current seating chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void bookSeat(int row, int col) {
        if (isValidSeat(row, col) && seats[row][col] == 'A') {
            seats[row][col] = 'B'; // B for Booked
            System.out.println("Seat at (" + row + "," + col + ") has been successfully booked.");
        } else {
            System.out.println("Seat at (" + row + "," + col + ") is either invalid or already booked.");
        }
    }

    public void cancelBooking(int row, int col) {
        if (isValidSeat(row, col) && seats[row][col] == 'B') {
            seats[row][col] = 'A'; // A for Available
            System.out.println("Booking for seat at (" + row + "," + col + ") has been successfully cancelled.");
        } else {
            System.out.println("Seat at (" + row + "," + col + ") is either invalid or not booked.");
        }
    }

    public void checkAvailability(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'A') {
                System.out.println("Seat at (" + row + "," + col + ") is available.");
            } else {
                System.out.println("Seat at (" + row + "," + col + ") is booked.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        Program  airplane = new Program (rows, cols);

        airplane.displaySeatingChart();
        airplane.bookSeat(1, 2); 
        airplane.displaySeatingChart(); 
        airplane.checkAvailability(1, 2); 
        airplane.cancelBooking(1, 2);  
        airplane.displaySeatingChart(); 

        sc.close();
    }

}
//Enter the number of rows: 
//3
//Enter the number of columns: 
//3
//Current seating chart:
//A A A 
//A A A 
//A A A 
//Seat at (1,2) has been successfully booked.
//Current seating chart:
//A A A 
//A A B 
//A A A 
//Seat at (1,2) is booked.
//Booking for seat at (1,2) has been successfully cancelled.
//Current seating chart:
//A A A 
//A A A 
//A A A 
