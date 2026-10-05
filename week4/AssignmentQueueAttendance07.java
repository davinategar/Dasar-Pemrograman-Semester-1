package week4;

import java.util.Scanner;

public class AssignmentQueueAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serviceCode;

        System.out.println("--- Academic Queue Machine ---");
        System.out.print("Enter service code (1-4): ");
        serviceCode = sc.nextInt();

        switch (serviceCode) {
            case 1:
                System.out.println("Academic Consultation");
                break;

            case 2:
                System.out.println("Course Registration");
                break;

            case 3:
                System.out.println("Transcript Request");
                break;

            case 4:
                System.out.println("Academic Administration");
                break;

            default:
                System.out.println("Service code is not available");
                break;
        }
    }
}