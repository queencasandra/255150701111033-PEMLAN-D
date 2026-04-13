public class MainKue {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 20000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 5000, 10);
        daftarKue[2] = new KuePesanan("Lapis", 15000, 2);
        daftarKue[3] = new KueJadi("Kue Cubit", 3000, 15);
        daftarKue[4] = new KuePesanan("Bolu", 18000, 1.2);
        daftarKue[5] = new KueJadi("Klepon", 4000, 12);
        daftarKue[6] = new KuePesanan("Cheesecake", 25000, 1);
        daftarKue[7] = new KueJadi("Onde-onde", 3500, 20);
        daftarKue[8] = new KuePesanan("Tiramisu", 30000, 0.8);
        daftarKue[9] = new KueJadi("Risoles", 6000, 8);
        daftarKue[10] = new KuePesanan("Red Velvet", 28000, 1.1);
        daftarKue[11] = new KueJadi("Pastel", 5000, 9);
        daftarKue[12] = new KuePesanan("Blackforest", 27000, 1.3);
        daftarKue[13] = new KueJadi("Lemper", 4500, 11);
        daftarKue[14] = new KuePesanan("Chiffon", 22000, 1.4);
        daftarKue[15] = new KueJadi("Martabak Mini", 7000, 7);
        daftarKue[16] = new KuePesanan("Opera Cake", 35000, 0.9);
        daftarKue[17] = new KueJadi("Pukis", 4000, 13);
        daftarKue[18] = new KuePesanan("Pandan Cake", 20000, 1.6);
        daftarKue[19] = new KueJadi("Serabi", 3000, 14);

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = daftarKue[0];

        System.out.println("======================================================================");
        System.out.printf("%-20s %-15s %-15s %-15s\n", "Nama Kue", "Jenis", "Atribut", "Harga Akhir");
        System.out.println("======================================================================");

        for (Kue k : daftarKue) {
            double hargaAkhir = k.hitungHarga();
            totalHargaSemua += hargaAkhir;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += hargaAkhir;
                totalBerat += kp.getBerat();

                System.out.printf("%-20s %-15s %-15.2f Rp%,.2f\n",
                        kp.nama, "Pesanan", kp.getBerat(), hargaAkhir);

            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += hargaAkhir;
                totalJumlah += kj.getJumlah();

                System.out.printf("%-20s %-15s %-15.2f Rp%,.2f\n",
                        kj.nama, "Jadi", kj.getJumlah(), hargaAkhir);
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("======================================================================");
        System.out.printf("Total Harga Semua Kue   : Rp%,.2f\n", totalHargaSemua);

        System.out.println("\n-- KuePesanan --");
        System.out.printf("Total Harga  : Rp%,.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat  : %.2f\n", totalBerat);

        System.out.println("\n-- KueJadi --");
        System.out.printf("Total Harga  : Rp%,.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah : %.2f\n", totalJumlah);

        System.out.println("\n-- Kue Termahal --");
        System.out.printf("Nama  : %s\n", kueTermahal.nama);
        System.out.printf("Harga : Rp%,.2f\n", kueTermahal.hitungHarga());
    }
}