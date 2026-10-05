package week4;

import java.util.Scanner;

public class selectionSwitchAttdance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Enter your current semester: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 displayed");
        }
        else if (semester == 2) {
            System.out.println("KRS semester 2 displayed");
        }
        else if (semester == 3) {
            System.out.println("KRS semester 3 dispplayed");
        }
        else if (semester == 4) {
            System.out.println("KRS semester 4 displayed");
        }
        else if (semester == 5) {
            System.out.println("KRS semester 5 displayed");
        }
        else if (semester == 6) {
            System.out.println("KRS semester 6 displayed");
        }
        else if (semester == 7) {
            System.out.println("KRS semester 7 displayed");
        }
        else if (semester == 8) {
            System.out.println("KRS semester 8 displayed");
        }
    }
}
