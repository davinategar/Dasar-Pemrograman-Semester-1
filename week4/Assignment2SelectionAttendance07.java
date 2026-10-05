package week4;

import java.util.Scanner;

public class Assignment2SelectionAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCredits;

        System.out.print("Enter total credits: ");
        totalCredits = sc.nextInt();

        if (totalCredits > 24) {
            System.out.println("Exceeds the limit");
        } else {
            System.out.println("KRS is valid");
        }
    }
}