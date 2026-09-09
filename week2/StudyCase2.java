import java.util.Scanner;

public class StudyCase2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int width, lenght, totalLandArea, diameter, squareSide;
      double phi, circularPondArea, gardenGrass ;
      phi = 3.14;

    //hitungan luas tanah:
      System.out.print("input your land width\t: ");
      width = sc.nextInt();
      System.out.print("input your land lenght\t: ");
      lenght = sc.nextInt();

      totalLandArea = width * lenght;
      System.out.println("------------------------------");
      System.out.println(String.format("your total land area is %s m² ", totalLandArea));
      System.out.println("------------------------------");

    //hitungan luas kolam lingkaran:
      System.out.print("input your diameter\t: ");
      diameter = sc.nextInt();

      circularPondArea = phi * diameter / 2;

      System.out.println("------------------------------");
      System.out.println(String.format("your total circular pond area is %s m² ",circularPondArea ));
      System.out.println("------------------------------");

    //hitungan luas kolam persegi:
      System.out.print("input your square side\t: ");
      squareSide = sc.nextInt();
      
      squareSide = squareSide * squareSide;
      System.out.println("------------------------------");
      System.out.println(String.format("your total square pond area is %s m² ", squareSide));
      System.out.println("------------------------------");

    //hitungan total area yang akan ditamani
      gardenGrass = totalLandArea - (circularPondArea + squareSide) ;
      System.out.println(String.format("Total land area that planted with garden grass is %s m² ", gardenGrass));
      System.out.println("------------------------------");    

    }
}
