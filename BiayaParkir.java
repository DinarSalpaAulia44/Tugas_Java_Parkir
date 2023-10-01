import java.util.Scanner;

public class  BiayaParkir {
    private static final int BiayaParkir = 0;

    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Jam Masuk (0-24): ");
            int JamMasuk = input.nextInt();

            System.out.print("Jam Keluar (0-24): ");
            int JamKeluar = input.nextInt();

            int LamaParkir = JamKeluar - JamMasuk;
            int TotalBiaya = LamaParkir * BiayaParkir;

            System.out.println("Lama Parkir: " + LamaParkir + "Jam");
            System.out.println("Total Biaya: Rp" +TotalBiaya);
        }
    }
}