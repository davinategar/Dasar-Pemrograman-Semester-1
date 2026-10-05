package week4;

import java.util.Scanner;

public class selectionAttendece2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the UKT been paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT payment verified");
            System.out.println("Please print your KRS and ask your DPA to sign it");
        } else {
            System.out.println("Registration rejected. Please pay your UKT first");
        }
    }
}