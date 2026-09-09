import java.util.Scanner;

public class StudyCase2pt2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       byte diameter = 2;
       byte squareSide = 2;
       int width = 50;
       int lenght = 100;
       double phi = 3.14;

       double totalAreaGardenGrass = (width * lenght) - ((phi * diameter / 2) + (squareSide * squareSide));

       System.out.println(String.format("Total land area that planted with garden grass is %s m² ", totalAreaGardenGrass));


    }
}
