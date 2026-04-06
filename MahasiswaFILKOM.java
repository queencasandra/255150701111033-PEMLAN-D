public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }
    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char digitProdi = nim.charAt(6);
        String prodi = "";

        switch (digitProdi) {
            case '2' : prodi = "Teknik Informatika";
            break;
            case '3' : prodi = "Teknik Komputer";
            break;
            case '4' : prodi = "Sistem Informasi";
            break;
            case '5' : prodi = "Teknologi Informasi";
            break;
            case '6' : prodi = "Pendidikan Teknologi Informasi";
            break;
            default : prodi = "Program Studi Tidak Diketahui";
        }
        return prodi + ", " + angkatan;
    }
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) {
            return 50.0;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            return 75.0;
        }
        return 0.0;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "NIM       : %s\n" +
                "IPK       : %.2f\n" +
                "Status    : %s\n"+
                "Beasiswa : $%.2f",
                nim, ipk, getStatus(), getBeasiswa()
            );
    }
}