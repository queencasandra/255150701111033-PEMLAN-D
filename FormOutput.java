import javax.swing.*;

public class FormOutput extends JFrame {

    public FormOutput(String nama, String ttl, String noDaftar,
                      String telp, String alamat, String email) {

        setTitle("Data Mahasiswa");
        setSize(350, 300);
        setLayout(null);

        JTextArea hasil = new JTextArea();
        hasil.setBounds(20, 20, 300, 200);
        hasil.setText(
                "Data Mahasiswa\n\n" +
                "Nama            : " + nama + "\n" +
                "Tanggal Lahir   : " + ttl + "\n" +
                "No. Pendaftaran : " + noDaftar + "\n" +
                "No. Telp        : " + telp + "\n" +
                "Alamat          : " + alamat + "\n" +
                "E-mail          : " + email
        );
        add(hasil);
        setVisible(true);
    }
}