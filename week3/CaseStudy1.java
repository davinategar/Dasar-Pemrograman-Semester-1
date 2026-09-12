import java.util.Scanner;

public class CaseStudy1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int motorPrice, downPayment, instalmentMonths, monthlyPrinciplePayment ;
        double rate = 0.01;
        double interestRate;

        System.out.print("Input your Motor Price: ");
        motorPrice = input.nextInt();
        System.err.print("Input your Down Payment: ");
        downPayment = input.nextInt();
        System.out.print("Inpur your Instalments: ");
        instalmentMonths = input.nextInt();

        monthlyPrinciplePayment = (motorPrice - downPayment) / instalmentMonths;
        System.out.println("\nYour Monthly Principle Payment will be: " + monthlyPrinciplePayment);

        interestRate = monthlyPrinciplePayment * 0.01;
        System.out.println("your interest rate is: " + interestRate);

        System.out.print("\n==== FINAL RESULT ====");
        double monthlyInstalment = monthlyPrinciplePayment + interestRate;
        System.out.println("\nYour total Monthly Instalments is: " + monthlyInstalment);

    }
}
