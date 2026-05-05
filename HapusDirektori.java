import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File folder = new File("folderTest");

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            for (File f : files) {
                f.delete();
            }

            if (folder.delete()) {
                System.out.println("Direktori berhasil dihapus");
            } else {
                System.out.println("Gagal menghapus direktori");
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}