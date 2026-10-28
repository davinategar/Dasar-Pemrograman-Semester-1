package week7;

import java.util.Scanner;

public class studiKhasus207 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String studentName;
        String activityType;
        int documents;
        int competitionRank = 0;
        int pkmFundingStatus = 0;
        int missingDocuments;

        System.out.print("Nama mahasiswa : ");
        studentName = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/OTHER) : ");
        activityType = input.nextLine().toUpperCase();

        if (activityType.equals("BELMAWA")
                || activityType.equals("BAKORMA")
                || activityType.equals("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            documents = input.nextInt();

            System.out.print("Peringkat lomba (1, 2, 3; 0 jika tidak menang) : ");
            competitionRank = input.nextInt();

            if (competitionRank >= 1 && competitionRank <= 3) {
                if (documents == 4) {
                    System.out.println("Status : Lolos verifikasi. Dana penghargaan diberikan.");
                } else {
                    missingDocuments = 4 - documents;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + missingDocuments + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak menang juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (activityType.equals("PKM")) {

            System.out.print("Jumlah dokumen : ");
            documents = input.nextInt();

            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak disetujui) : ");
            pkmFundingStatus = input.nextInt();

            if (pkmFundingStatus == 1) {
                if (documents == 4) {
                    System.out.println("Status : Lolos verifikasi. Dana penghargaan diberikan.");
                } else {
                    missingDocuments = 4 - documents;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + missingDocuments + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Proposal PKM tidak disetujui. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan tidak memenuhi syarat. Dana penghargaan tidak diberikan.");
        }

        input.close();
    }
}
