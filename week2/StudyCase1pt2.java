import java.util.Scanner;

public class StudyCase1pt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basicSalary = 3000000;
        int allowance =  150000;
        int child = 3;
        double mendatory = 0.05;

        double finalSalary = (basicSalary + (allowance * child) - (basicSalary * mendatory)) ;

        System.out.println("your final result: " + finalSalary);

    }
}
