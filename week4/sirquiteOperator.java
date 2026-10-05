package week4;

public class sirquiteOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a>=5 || ++b>10){
            System.out.println("TRUE");
        }
        System.out.println("a=" +a+", b="+b);
    }
    boolean ukt = false;
    String msg = (ukt) ? "print krs" : "pay the ukt first";
}
//terrnary operator is not recomended for uses for many statements. it's better for simple statement
