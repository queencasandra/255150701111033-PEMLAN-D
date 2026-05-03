class ASD extends MataKuliah { 
    public ASD(double t, double k, double u1, double u2) { 
        super(t, k, u1, u2); 
    } 
    double hitungNilai() { 
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4); 
    } 
}