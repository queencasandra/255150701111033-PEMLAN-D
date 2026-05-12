import java.util.ArrayList; 
import java.util.Collections; 
 
public class BinarySearchFutsal { 
 
    public static void main(String[] args) { 
 
        // ======================== 
        // DATA TIM A 
        // ======================== 
 
        ArrayList<Integer> tinggiA = new ArrayList<Integer>(); 
        Collections.addAll(tinggiA, 
                168,170,165,168,172,170,169,165,171,166); 
 
        ArrayList<Integer> beratA = new ArrayList<Integer>(); 
        Collections.addAll(beratA, 
                50,60,56,55,60,70,66,56,72,56); 
 
        // ======================== 
        // DATA TIM B 
        // ======================== 
 
        ArrayList<Integer> tinggiB = new ArrayList<Integer>(); 
        Collections.addAll(tinggiB, 
                170,167,165,166,168,175,172,171,168,169); 
 
        // SORT terlebih dahulu 
        Collections.sort(tinggiB); 
        Collections.sort(beratA); 
 
        // ===================================== 
        // B. JUMLAH TINGGI 168 DAN 160 DI TIM B 
        // ===================================== 
 
        int jumlah168 = Collections.frequency(tinggiB, 168); 
           int jumlah160 = Collections.frequency(tinggiB, 160); 
 
        System.out.println("Jumlah tinggi 168 di Tim B : " + jumlah168); 
        System.out.println("Jumlah tinggi 160 di Tim B : " + jumlah160); 
 
        // ===================================== 
        // C. JUMLAH BERAT 56 DAN 53 DI TIM A 
        // ===================================== 
 
        int jumlah56 = Collections.frequency(beratA, 56); 
        int jumlah53 = Collections.frequency(beratA, 53); 
 
        System.out.println("\nJumlah berat 56 di Tim A : " + jumlah56); 
        System.out.println("Jumlah berat 53 di Tim A : " + jumlah53); 
 
        // ===================================== 
        // D. CEK DATA SAMA 
        // ===================================== 
 
        boolean sama = !Collections.disjoint(tinggiA, tinggiB); 
 
        if (sama) 
            System.out.println("\nAda tinggi badan yang sama antara Tim A dan Tim B"); 
        else 
            System.out.println("\nTidak ada tinggi badan yang sama"); 
 
    } 
} 