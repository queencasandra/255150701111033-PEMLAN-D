import java.awt.event.*;
import javax.swing.*;

public class FormInput extends JFrame implements ActionListener {

    JTextField nama, ttl, noDaftar, telp, email;
    JTextArea alamat;
    JButton submit;

    public FormInput() {
        setTitle("Form Daftar Ulang Mahasiswa");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lNama = new JLabel("Nama Lengkap");
        lNama.setBounds(20, 20, 120, 20);
        add(lNama);
        nama = new JTextField();
        nama.setBounds(150, 20, 200, 20);
        add(nama);

        JLabel lTTL = new JLabel("Tanggal Lahir");
        lTTL.setBounds(20, 50, 120, 20);
        add(lTTL);
        ttl = new JTextField();
        ttl.setBounds(150, 50, 200, 20);
        add(ttl);

        JLabel lNo = new JLabel("Nomor Pendaftaran");
        lNo.setBounds(20, 80, 150, 20);
        add(lNo);
        noDaftar = new JTextField();
        noDaftar.setBounds(150, 80, 200, 20);
        add(noDaftar);

        JLabel lTelp = new JLabel("No. Telp");
        lTelp.setBounds(20, 110, 120, 20);
        add(lTelp);
        telp = new JTextField();
        telp.setBounds(150, 110, 200, 20);
        add(telp);

        JLabel lAlamat = new JLabel("Alamat");
        lAlamat.setBounds(20, 140, 120, 20);
        add(lAlamat);
        alamat = new JTextArea();
        alamat.setBounds(150, 140, 200, 60);
        add(alamat);

        JLabel lEmail = new JLabel("E-mail");
        lEmail.setBounds(20, 210, 120, 20);
        add(lEmail);
        email = new JTextField();
        email.setBounds(150, 210, 200, 20);
        add(email);

        submit = new JButton("Submit");
        submit.setBounds(150, 250, 100, 30);
        add(submit);
        submit.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (nama.getText().isEmpty() ||
            ttl.getText().isEmpty() ||
            noDaftar.getText().isEmpty() ||
            telp.getText().isEmpty() ||
            alamat.getText().isEmpty() ||
            email.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Apakah data sudah benar?",
                "Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (confirm == JOptionPane.OK_OPTION) {
            new FormOutput(
                    nama.getText(),
                    ttl.getText(),
                    noDaftar.getText(),
                    telp.getText(),
                    alamat.getText(),
                    email.getText()
            );
        }
    }
    public static void main(String[] args) {
        new FormInput();
    }
}