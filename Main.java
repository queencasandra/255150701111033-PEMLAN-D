import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ TESTCASE MANUSIA =============");
        Manusia priaMenikah = new Manusia("Budi", true, "3501", true);
        System.out.println(priaMenikah);
        System.out.println();
        
        Manusia wanitaMenikah = new Manusia("Siti", false, "3502", true);
        System.out.println(wanitaMenikah);
        System.out.println();
        
        Manusia belumMenikah = new Manusia("Candra", true, "3503", false);
        System.out.println(belumMenikah);
        System.out.println("\n");

        System.out.println("======== TESTCASE MAHASISWA FILKOM =========");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("225150200111001", 2.8, "Caca", "3504", true, false);
        System.out.println(mhs1);
        System.out.println();
        
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("215150400111002", 3.4, "Cici", "3505", false, false);
        System.out.println(mhs2);
        System.out.println();
        
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("255150200111038", 4.0, "Coco", "6767", true, false);
        System.out.println(mhs3);
        System.out.println("\n");

        System.out.println("============= TESTCASE PEKERJA =============");
        int tahunSekarang = LocalDate.now().getYear();
        
        Pekerja pkj1 = new Pekerja(1000, tahunSekarang - 2, 1, 1, 2, "sasa", "3507", true, true);
        System.out.println(pkj1);
        System.out.println();
        
        Pekerja pkj2 = new Pekerja(1500, tahunSekarang - 9, 3, 15, 0, "sisi", "3508", false, false);
        System.out.println(pkj2);
        System.out.println();
        
        Pekerja pkj3 = new Pekerja(2000, tahunSekarang - 20, 5, 20, 10, "sasi", "3509", true, true);
        System.out.println(pkj3);
        System.out.println("\n");

        System.out.println("============= TESTCASE MANAGER =============");
        Manager mgr1 = new Manager("IT", 7500, tahunSekarang - 15, 8, 10, 67, "Queen", "3510", true, true);
        System.out.println(mgr1);
    }
}
