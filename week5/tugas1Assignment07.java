package week5;

import java.util.Scanner;

public class tugas1Assignment07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPayment;
        double dictionary = 250000, novel = 150000, other = 75000;

        System.out.print("input the day: ");
        String dayInput = sc.nextLine();

        System.out.print("what do you want to buy (dictionary/novel/other): ");
        String bookSelection = sc.nextLine();

        System.out.print("how much you want to buy: ");
        int bookNumber = sc.nextInt();

        if (dayInput.equalsIgnoreCase("wednesday")) {
            if (bookSelection.equalsIgnoreCase("dictionary")) {
                if (bookNumber > 2) {
                    totalPayment = dictionary * bookNumber * 0.88;
                } else {
                    totalPayment = dictionary * bookNumber * 0.90;
                }
            } else if (bookSelection.equalsIgnoreCase("novel")) {
                if (bookNumber > 3) {
                    totalPayment = novel * bookNumber * 0.91;
                } else {
                    totalPayment = novel * bookNumber * 0.92;
                }
            } else {
                if (bookNumber > 3) {
                    totalPayment = other * bookNumber * 0.95;
                } else {
                    totalPayment = other * bookNumber;
                }
            }
        } else {
            if (bookSelection.equalsIgnoreCase("dictionary")) {
                totalPayment = dictionary * bookNumber;
            } else if (bookSelection.equalsIgnoreCase("novel")) {
                totalPayment = novel * bookNumber;
            } else {
                totalPayment = other * bookNumber;
            }
        } 

        System.out.println("Total Payment: " + totalPayment);
    }
}