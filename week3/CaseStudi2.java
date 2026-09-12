import java.util.Scanner;

public class CaseStudi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, fuelNeeded, totalCost;
        
        System.out.print("Input your distance (Km): ");
        distance = input.nextInt();

        fuelNeeded = distance / 2;
        totalCost = fuelNeeded * 10000;

        System.out.println(String.format("Your fuel needed %s liters", fuelNeeded));
        System.out.println("\n ==== TOTAL COST ====");
        System.out.println(String.format("Rp. %s", totalCost));
    }
}
