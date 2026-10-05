package week4;

import java.util.Scanner;

public class Assignment1SelectionAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the UKT beed paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        String message = uktPaid
                ? "UKT payment verified\nPlease print your KRS and ask your DPA to sign it"
                : "paid rejected. please pay your UKT ";

        System.out.println(message);
    }
}