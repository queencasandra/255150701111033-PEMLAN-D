import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {

    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    TextArea area;
    CheckboxGroup cbg;
    Checkbox pemlan, asd, matkom, probstat;
    Button btnHitung, btnTampil;

    double nPemlan, nASD, nMatkom, nProbstat;

    public Main() {
        setLayout(null);

        Label judul = new Label("Hitung Nilai Akhir");
        add(judul);
        judul.setBounds(150, 30, 200, 20);

        cbg = new CheckboxGroup();

        asd = new Checkbox("ASD", cbg, false);
        pemlan = new Checkbox("Pemlan", cbg, false);
        matkom = new Checkbox("Matkomlan", cbg, false);
        probstat = new Checkbox("Probstat", cbg, false);

        add(asd);
        asd.setBounds(50, 60, 70, 20);

        add(pemlan);
        pemlan.setBounds(120, 60, 80, 20);

        add(matkom);
        matkom.setBounds(200, 60, 90, 20);

        add(probstat);
        probstat.setBounds(300, 60, 80, 20);

        Label l1 = new Label("Tugas");
        add(l1);
        l1.setBounds(100, 100, 80, 20);

        Label l2 = new Label("Kuis");
        add(l2);
        l2.setBounds(100, 130, 80, 20);

        Label l3 = new Label("UTS");
        add(l3);
        l3.setBounds(100, 160, 80, 20);

        Label l4 = new Label("UAS");
        add(l4);
        l4.setBounds(100, 190, 80, 20);

        txtTugas = new TextField();
        add(txtTugas);
        txtTugas.setBounds(180, 100, 80, 20);

        txtKuis = new TextField();
        add(txtKuis);
        txtKuis.setBounds(180, 130, 80, 20);

        txtUTS = new TextField();
        add(txtUTS);
        txtUTS.setBounds(180, 160, 80, 20);

        txtUAS = new TextField();
        add(txtUAS);
        txtUAS.setBounds(180, 190, 80, 20);

        Label l5 = new Label("Hasil");
        add(l5);
        l5.setBounds(100, 220, 80, 20);

        txtHasil = new TextField();
        add(txtHasil);
        txtHasil.setBounds(180, 220, 80, 20);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(150, 250, 80, 25);
        btnHitung.addActionListener(this);

        area = new TextArea();
        add(area);
        area.setBounds(100, 290, 250, 120);

        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(100, 420, 250, 30);
        btnTampil.addActionListener(this);

        ItemListener reset = e -> {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            txtHasil.setText("");
        };

        pemlan.addItemListener(reset);
        asd.addItemListener(reset);
        matkom.addItemListener(reset);
        probstat.addItemListener(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnHitung) {
            double t = Double.parseDouble(txtTugas.getText());
            double k = Double.parseDouble(txtKuis.getText());
            double u1 = Double.parseDouble(txtUTS.getText());
            double u2 = Double.parseDouble(txtUAS.getText());

            double hasil = 0;

            if (pemlan.getState()) {
                hasil = (t * 0.2) + (k * 0.2) + (u1 * 0.25) + (u2 * 0.35);
                nPemlan = hasil;
            } else if (asd.getState()) {
                hasil = (t * 0.3) + (u1 * 0.3) + (u2 * 0.4);
                nASD = hasil;
            } else if (matkom.getState()) {
                hasil = (k * 0.3) + (u1 * 0.3) + (u2 * 0.4);
                nMatkom = hasil;
            } else if (probstat.getState()) {
                hasil = (t + k + u1 + u2) / 4;
                nProbstat = hasil;
            }

            txtHasil.setText(String.valueOf(hasil));
        }

        if (e.getSource() == btnTampil) {
            area.setText("HASIL NILAI SEMUA MATA KULIAH\n\n");
            area.append("Pemlan     : " + nPemlan + "\n");
            area.append("ASD        : " + nASD + "\n");
            area.append("Matkomlan  : " + nMatkom + "\n");
            area.append("Probstat   : " + nProbstat + "\n");
        }
    }

    public static void main(String[] args) {
        Main g = new Main();
        g.setSize(450, 500);
        g.setTitle("Hitung Nilai Akhir dengan GUI");
        g.setVisible(true);
    }
}