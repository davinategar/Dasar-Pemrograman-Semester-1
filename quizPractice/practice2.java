package quizPractice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int width, lenght, perimeter;

        System.out.print("Input width\t: ");
        width = input.nextInt();
        System.out.print("Input lenght\t: ");
        lenght = input.nextInt();

        perimeter = width * lenght;
        System.out.printf(String.format("Total Perimeter\t: "+ perimeter));
    }
    
}