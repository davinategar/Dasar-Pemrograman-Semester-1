package week4;

public class hospital {
    public static void main(String[] args) {

        String finalStatus = "";
        int spO2 = 88;
        int sisaBedICU = 2;
        int systolic = 120;
        boolean sadarPenuh = true;
        boolean memilikiKomorbid = true;
        int age = 70;
        double suhu = 37.5;
        int lajuNapas = 20;

        if (spO2 < 85 && sisaBedICU > 0) {
            finalStatus = "ICU";
        } else if (spO2 < 85 && sisaBedICU == 0) {
            finalStatus = "UGD_VENTILATOR_MOBIL";
        } else if ((spO2 >= 85 && spO2 <= 89)
                || systolic < 90
                || systolic > 180
                || !sadarPenuh) {
            finalStatus = "RESUSITASI_UGD";
        } else if ((spO2 >= 90 && spO2 <= 94 || suhu > 39)
                && memilikiKomorbid
                && age >= 65) {
            finalStatus = "HCU_ISOLASI";
        } else if ((spO2 >= 90 && spO2 <= 94)
                || lajuNapas > 24) {
            finalStatus = "RAWAT_INAP_UMUM";
        } else {
            finalStatus = "RAWAT_JALAN";
        }

        System.out.println(finalStatus);
    }
}