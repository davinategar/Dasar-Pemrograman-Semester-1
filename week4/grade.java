package week4;

public class grade {
    public static void main(String[] args) {
        double n = 75.65;
        String grade = "";
        if (n<=39)
            grade = "E";
        else if (n>39 && n<=50)
            grade = "D";
        else if (n>50 && n<=60)
            grade = "C";
        else if (n>67 && n<=77)
            grade = "B";
        else if (n>77 && n<=85)
            grade = "B+";
        else 
            grade = "A";
    }
}
