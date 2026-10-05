package week4;

public class nusantaraPay {
    public static void main(String[] args) {

        String finalStatus = "";
        String accountStatus = "";
        int transactionAmount = 1000;
        int balance = 250000;
        int hour = 14;
        boolean isOverseas = true;

        if (accountStatus.equalsIgnoreCase("BLACK-LISTED")) {
            finalStatus = "REJECTED_BLACKLIST";
        } else if (transactionAmount > balance) {
            finalStatus = "REJECTED_SALDO";
        } else if (transactionAmount > 10000) {
            finalStatus = "REJECTED_LIMIT";
        } else if (isOverseas && transactionAmount > 2000) {
            finalStatus = "FLAGGED_FRAUD";
        } else if (hour >= 0 && hour < 4 && transactionAmount > 1000) {
            finalStatus = "REQUIRE_OTP_NIGHT";
        } else if (accountStatus.equalsIgnoreCase("SUSPICIOUS") && transactionAmount > 500) {
            finalStatus = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            finalStatus = "APPROVED";
        }

        System.out.println(finalStatus);
    }
}