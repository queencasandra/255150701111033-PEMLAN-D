import java.util.ArrayList; 
import java.util.Collections; 
 
public class FutsalSorting { 
 
    public static void main(String[] args) { 
 
        // ========================= 
        // DATA TIM A 
        // ========================= 
 
        ArrayList<Integer> tinggiA = new ArrayList<Integer>(); 
        Collections.addAll(tinggiA, 168,170,165,168,172,170,169,165,171,166); 
 
        ArrayList<Integer> beratA = new ArrayList<Integer>(); 
        Collections.addAll(beratA, 50,60,56,55,60,70,66,56,72,56); 
 
        // ========================= 
        // DATA TIM B
          // ========================= 
 
        ArrayList<Integer> tinggiB = new ArrayList<Integer>(); 
        Collections.addAll(tinggiB, 170,167,165,166,168,175,172,171,168,169); 
 
        ArrayList<Integer> beratB = new ArrayList<Integer>(); 
        Collections.addAll(beratB, 66,60,59,58,58,71,68,68,65,60); 
 
        // ========================================= 
        // A. SORTING TINGGI BADAN 
        // ========================================= 
 
        Collections.sort(tinggiA); 
        Collections.sort(tinggiB); 
 
        System.out.println("TINGGI BADAN TIM A ASCENDING : " + tinggiA); 
        System.out.println("TINGGI BADAN TIM B ASCENDING : " + tinggiB); 
 
        Collections.reverse(tinggiA); 
        Collections.reverse(tinggiB); 
 
        System.out.println("\nTINGGI BADAN TIM A DESCENDING : " + tinggiA); 
        System.out.println("TINGGI BADAN TIM B DESCENDING : " + tinggiB); 
 
        // ========================================= 
        // B. SORTING BERAT BADAN 
        // ========================================= 
 
        Collections.sort(beratA); 
        Collections.sort(beratB); 
 
        System.out.println("\nBERAT BADAN TIM A ASCENDING : " + beratA); 
        System.out.println("BERAT BADAN TIM B ASCENDING : " + beratB); 
 
        Collections.reverse(beratA); 
        Collections.reverse(beratB); 
 
        System.out.println("\nBERAT BADAN TIM A DESCENDING : " + beratA); 
        System.out.println("BERAT BADAN TIM B DESCENDING : " + beratB); 
 
        // ========================================= 
        // C. MAX DAN MIN 
        // ========================================= 
 
        System.out.println("\n=== MAX DAN MIN ==="); 
 
        System.out.println("Tinggi Max Tim A : " + Collections.max(tinggiA)); 
          System.out.println("Tinggi Min Tim A : " + Collections.min(tinggiA)); 
 
        System.out.println("Berat Max Tim A : " + Collections.max(beratA)); 
        System.out.println("Berat Min Tim A : " + Collections.min(beratA)); 
 
        System.out.println(); 
 
        System.out.println("Tinggi Max Tim B : " + Collections.max(tinggiB)); 
        System.out.println("Tinggi Min Tim B : " + Collections.min(tinggiB)); 
 
        System.out.println("Berat Max Tim B : " + Collections.max(beratB)); 
        System.out.println("Berat Min Tim B : " + Collections.min(beratB)); 
 
        // ========================================= 
        // D. COPY TIM B KE TIM C 
        // ========================================= 
 
        ArrayList<Integer> timC = new ArrayList<Integer>(); 
 
        timC.addAll(tinggiB); 
 
        System.out.println("\nTIM C (COPY DARI TIM B)"); 
        System.out.println(timC); 
 
    } 
}