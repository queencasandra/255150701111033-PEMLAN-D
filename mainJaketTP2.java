package laprak5;

import java.util.Scanner;

public class mainJaketTP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JaketTP2 j = new JaketTP2();

        System.out.printf("Rincian Harga Jaket CV LABKOMDAS%n");
        System.out.printf("%3s Jaket A : Rp. 100.000 /pcs%n", "");
        System.out.printf("%3s Jaket B : Rp. 125.000 /pcs%n", "");
        System.out.printf("%3s Jaket C : Rp. 175.000 /pcs%n", "");
        System.out.printf("nb : Pembelian diatas 100 pcs akan mendapatkan harga diskon per pcs nya%n");
        System.out.println();

        System.out.println("Silahkan Masukkan Jumlah Jaket yang ingin dipesan");
        System.out.print("Jumlah Jaket A: ");
        double a = (int) in.nextDouble();

        System.out.print("Jumlah Jaket B: ");
        double b = (int) in.nextDouble();

        System.out.print("Jumlah Jaket C: ");
        double c = (int) in.nextDouble();

        double totalA = j.hitungA(a);
        double totalB = j.hitungB(b);
        double totalC = j.hitungC(c);

        double total = totalA + totalB + totalC;

        System.out.println();

        System.out.println("=== Struk Pembelian ===");
        System.out.printf("Total harga A: Rp %,.2f%n", totalA);
        System.out.printf("Total harga B: Rp %,.2f%n", totalB);
        System.out.printf("Total harga C: Rp %,.2f%n", totalC);
        System.out.printf("Total bayar  : Rp %,.2f%n", total);
    }
}
