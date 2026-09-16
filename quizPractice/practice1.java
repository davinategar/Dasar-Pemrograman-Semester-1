package quizPractice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int courseFee, laboratoryFee, activityFee;
        double discount, totalpayment;

        System.out.print("Input your course fee (Rp)\t: ");
        courseFee = input.nextInt();
        System.out.print("Input your Laboratory fee (Rp)\t: ");
        laboratoryFee = input.nextInt();
        System.out.print("Input your activity fee (Rp)\t: ");
        activityFee = input.nextInt();

        discount = courseFee * 0.10;
        totalpayment = ((courseFee - discount) + laboratoryFee + activityFee);

        System.out.println("\nYour Course Fee + 10% discount\t: Rp. " + (int) discount);
        System.out.println("Your Laboratory fee\t\t: Rp. " + laboratoryFee);
        System.out.println("Your Student Activity Fee\t: Rp. " + activityFee);

        System.out.println("\n ========== TOTAL PAYMENT ========== ");
        System.out.println("TOTAL FEE PAYMENT\t\t: Rp. " + (int) totalpayment);



    }
}
