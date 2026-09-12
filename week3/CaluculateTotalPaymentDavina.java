import java.util.Scanner;

public class CaluculateTotalPaymentDavina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basicSalary;
        double transportAllownce = 600000, mealAllowance = 400000;
        double bonus, totalSalary;

        System.out.print("Enter the basic salary (Rp): ");
        basicSalary = input.nextInt();

        bonus = 0.05 * basicSalary;

        totalSalary = basicSalary + transportAllownce + mealAllowance + bonus - (0.1 * basicSalary);

        System.out.println("\n-- Salary Details ---");
        System.out.println("Basic Salary        : Rp " + basicSalary);
        System.out.println("Transport Allownce  : Rp " + transportAllownce);
        System.out.println("Meal Allowance      : Rp " + mealAllowance);
        System.out.println("Perfomance Bonus    : Rp " + bonus);
        System.out.println("Total Salary : Rp " + (int) totalSalary);
    }
}