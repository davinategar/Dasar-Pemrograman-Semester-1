package week5;

import java.util.Scanner;

public class tugas2SeleksiAsisten07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentStatus, subjectSanctions, competencyCerti;
        double programmingGrade, interviewGrades;

        System.out.println("Please honestly complete the following details for the practicum assistant selection process!");

        System.out.print("\n1. Are you a student? (active / inactive): ");
        studentStatus = sc.nextLine();

        System.out.print("2. Are you currently subject to academic sanctions? (yes / no): ");
        subjectSanctions = sc.nextLine();

        if (studentStatus.equalsIgnoreCase("active")
        && subjectSanctions.equalsIgnoreCase("no")) {
            
            System.out.print("3. Programming Fundamentals Grade: ");
            programmingGrade = sc.nextDouble();

            sc.nextLine();

            System.out.print("4. Do you hold a programming competency certificate? (yes / no): ");
            competencyCerti = sc.nextLine();

            if (programmingGrade >= 80
                || competencyCerti.equalsIgnoreCase("yes")) {

                    System.out.println("Passed the 2nd selection.");
                    System.out.println("You are called to attend an interview.");
                

                    System.out.print("\ninput your interview grades: ");
                    interviewGrades = sc.nextDouble();

                    if (interviewGrades >= 75) {
                        System.out.println("\nYou have been accepted as a practicum assistant.");
                    } else {
                        System.out.println("\nYou failed! Don't give up!");
                        System.out.println("You failed because your interview score was less than 75.");
                    }
            } else {
                System.out.println("\nYou failed!");
                System.out.println(
                    "Your Programming Fundamentals score is less than 80,"
                    + "and you do not hold a programming competency certificate."
                );
            }
        } else {
            System.out.println("\nYou failed!");
            
            if (!studentStatus.equalsIgnoreCase("active")
            && subjectSanctions.equalsIgnoreCase("yes")) {
                System.out.println("You are inactive and currently subject to an academic sanction.");
            } else if (!studentStatus.equalsIgnoreCase("active")) {
                System.out.println("Your student status is inactive.");
            } else {
                System.out.println("You are currently subject to academic sanctions.");
            }
        }

        sc.close();

    }
}
