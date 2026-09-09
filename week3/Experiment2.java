import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lenght, width, area;

        System.out.print("Enter the lenght of the rectangle : ");
        lenght = input.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();

        area = lenght * width;

        System.out.println("The area of the rectangle is: " + area);
        
        input.close();

    }
    
}