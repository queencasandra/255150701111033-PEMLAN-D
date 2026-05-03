class Probstat extends MataKuliah { 
    public Probstat(double t, double k, double u1, double u2) 
    { 
        super(t, k, u1, u2); 
    } 
    double hitungNilai() { 
        return (tugas * 0.25) + (kuis * 0.25) + (uts * 0.25) + (uas * 0.25); 
    } 
} 