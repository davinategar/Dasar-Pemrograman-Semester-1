package week4;

import java.util.Scanner;

public class AssignmentParking07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vehicleType;
        int parkingHours;
        int parkingFee;

        System.out.println("--- Parking System ---");

        System.out.print("Enter vehicle type (motorcycle/car): ");
        vehicleType = sc.next();

        System.out.print("Enter parking duration (hours): ");
        parkingHours = sc.nextInt();

        if (vehicleType.equalsIgnoreCase("motorcycle")) {
            parkingFee = parkingHours * 2000;
        } else if (vehicleType.equalsIgnoreCase("car")) {
            parkingFee = parkingHours * 5000;
        } else {
            parkingFee = 0;
            System.out.println("Invalid vehicle type.");
        }

        if (parkingFee > 0) {
            System.out.println("Parking duration: " + parkingHours + " hour(s)");
            System.out.println("Parking fee: Rp" + parkingFee);
        }
        if (vehicleType.equalsIgnoreCase("motorcycle")) {
            parkingFee = parkingHours * 2000;
        } else if (vehicleType.equalsIgnoreCase("car")) {
            parkingFee = parkingHours * 5000;
        } else {
            parkingFee = 0;
            System.out.println("Invalid vehicle type.");
        }if (parkingFee > 0) {
            System.out.println("Parking duration: " + parkingHours + " hour(s)");
            System.out.println("Parking fee: Rp" + parkingFee);
        }
    }
}
