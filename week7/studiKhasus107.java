package week7;

import java.util.Scanner;

public class studiKhasus107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = 18000;
        int quantity;
        int total;
        int discount = 0;
        int payment;
        int change;

        System.out.print("Enter the quantity of coffee: ");
        quantity = input.nextInt();

        total = price * quantity;

        if (total >= 100000) {
            discount = total * 10 / 100;
        }

        total = total - discount;

        System.out.println("Total payment: Rp" + total);

        System.out.print("Enter the payment amount: Rp");
        payment = input.nextInt();

        change = payment - total;

        System.out.println("Change: Rp" + change);

        input.close();
    }
}
