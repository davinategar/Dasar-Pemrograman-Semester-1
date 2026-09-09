import java.util.Scanner;

public class StudyCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte child;
        int init_basic_salary, allowance;
        double mendatory_percent;
        double final_salary;

        System.out.print("your child total\t: ");
        child = sc.nextByte();
        System.out.print("input your basic salary\t: ");
        init_basic_salary = sc.nextInt();
        System.out.print("input your allowance\t: ");
        allowance = sc.nextInt();
        System.out.print("input your mendatory (%): ");
        mendatory_percent = sc.nextDouble();

        final_salary = (init_basic_salary + (allowance * child) - (init_basic_salary * mendatory_percent / 100)) ;

        System.out.println("Your final salary\t: " + final_salary);
    }
}
