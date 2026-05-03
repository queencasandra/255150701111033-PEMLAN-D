class Matkomlan extends MataKuliah { 
    public Matkomlan(double t, double k, double u1, double u2)
    { 
        super(t, k, u1, u2); 
    } 
    double hitungNilai() { 
        return (kuis * 0.3) + (uts * 0.3) + (uas * 0.4); 
    } 
} 