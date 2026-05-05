import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            long size = file.length();

            if (size < 1024 * 1024) {
                System.out.println("Ukuran: " + (size / 1024.0) + " KB");
            } else {
                System.out.println("Ukuran: " + (size / (1024.0 * 1024)) + " MB");
            }
        } else {
            System.out.println("File tidak ada");
        }
    }
}