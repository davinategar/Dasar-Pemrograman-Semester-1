package week5;

import java.util.Scanner;

public class LogicalOperatotWifiAttendance07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    boolean isStudent;
    boolean isLecture;
    boolean isblocked;

    System.out.print("si the user a student? (true/false): ");
    isStudent = sc.nextBoolean();

    System.out.print("is the user a lecture? (true/false): ");
    isLecture = sc.nextBoolean();

    System.out.print("is the account curently blocked? (true/false): ");
    isblocked = sc.nextBoolean();

    if ((isStudent || isLecture) && !isblocked) {
        System.out.println("wifi access granted");
    } else {
        System.out.println("wifi access denied");
    }
    }
    
}
