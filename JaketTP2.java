package laprak5;

public class JaketTP2 {

    public final double HARGA_A = 100000;
    public final double HARGA_B = 125000;
    public final double HARGA_C = 175000;

    public double hitungA(double jumlah){
        if(jumlah > 100){
            return jumlah * 95000;
        }
        return jumlah * HARGA_A;
    }

    public double hitungB(double jumlah){
        if(jumlah > 100){
            return jumlah * 120000;
        }
        return jumlah * HARGA_B;
    }

    public double hitungC(double jumlah){
        if(jumlah > 100){
            return jumlah * 160000;
        }
        return jumlah * HARGA_C;
    }
}