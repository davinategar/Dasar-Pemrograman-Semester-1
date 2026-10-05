package week5;

import java.util.Scanner;

public class NestedThesisExamAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.print("has the student cleared all penallties? (yes/no): ");
        String noPenalty = sc.nextLine() .trim();

        System.out.print("enter the number of guidance session with supervisor 1:");
        int guidanceCount1 = sc.nextInt();

        System.out.print("enter the number of guidance session with supervisor 2: ");
        int guidanceCount2 = sc.nextInt();

        if (noPenalty .equalsIgnoreCase("yes")) {
            if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {
                message = "All requirements met. The student may register for the thesis exam";
            } else if (guidanceCount1 < 8 && guidanceCount2 < 4) {
                message = "failed! guidance sessions with supervisor 1 are below 8 and supervisor 2 are below 4";
            } else if (guidanceCount1 < 8 ) {
                message = "failed! guidance sessions with supervisor 1 have not reached 8";
            } else {
                message = "failed! guidance sessions with supervisor 2 have not reached 4";
            }
        } else {
            message = "failed! the student still has an outstanding penalty";
        }
        System.out.println(message);
    }
    
}