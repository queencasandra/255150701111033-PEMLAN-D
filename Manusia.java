public class Manusia {

    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia() {
    }

    public Manusia (String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public boolean getMenikah() {
        return menikah;
    }
    //Manusia
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        }
        return 15.0; 
    }
    public double getPendapatan() {
        return getTunjangan(); 
    }
    @Override
    public String toString() {
        return String.format (
            "Nama      : " + nama + "\n" +
            "NIK       : " + nik + "\n" +
            "Jenis Kelamin : " + jenisKelamin + "\n" +
            "Pendapatan : $" + getPendapatan(),
            nama, nik, 
            jenisKelamin ? "Laki-laki" : "Perempuan"
        );
    }
}