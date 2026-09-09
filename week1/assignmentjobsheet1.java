public class assignmentjobsheet1 {
    public static void main(String[] args){
        String A = "star ball";
        String B = "moon ball";
        String C = "empty";

        //step one: star ball from A move to C
       C = A;
       A = "empty";

       System.out.println("Correct Statement:");
        System.out.println("After Step 1: Tray A = " + A
            + ", Tray B = " + B
            + ", Tray C = " + C
        );

        //step two: moon ball from B move to A
        A = B;
        B = "empty";

        System.out.println("After Step 2: Tray A = " + A
            + ", Tray B = " + B
            + ", Tray C = " + C
        );

        //step three: star ball from C move to B
        B = C;
        C = "empty";

        System.out.println("After Step 3: Tray A = " + A
            + ", Tray B = " + B
            + ", Tray C = " + C
        );


        //(a) The two balls have swapped place
        if (A.equals("moon ball") && B.equals("star ball")) {
        } else{}

        //(b) There are two balls in tray A
        if (A.equals("star ball") && A.equals("moon ball")) {    
        }else {}

        //(c) There are two balls in tray B
        if (B.equals("star ball") && B.equals("moon balls")) {           
        }else {}

        //(d) Tray A is empty
        if (A.equals("empty")) {
        }else {}

        //(e) Tray C is empty
        if (C.equals("empty")) {
        }else {}

        //(f) nothing has changed,each ball has returned to its original place
        if (A.equals("star ball") && B.equals("moon ball") && C.equals("empty")) {
        }else {}
    }
    
}