import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File folder = new File(".");

        String[] daftar = folder.list();

        if (daftar != null) {
            for (String nama : daftar) {
                System.out.println(nama);
            }
        }
    }
}