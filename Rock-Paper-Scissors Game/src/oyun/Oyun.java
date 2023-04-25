package oyun;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Oyun {

    public static void main(String[] args) {
        //Başlangıç
        bilgiler bilgi = new bilgiler();
        Kullanici_sinifi kullanici1 = new Kullanici_sinifi();
        Bilgisayar_sinifi pc1 = new Bilgisayar_sinifi();
        Bilgisayar_sinifi pc2 = new Bilgisayar_sinifi();
        ArrayList<Nesne_sinifi> pcSecim = new ArrayList();
        ArrayList<Nesne_sinifi> pcSecim2 = new ArrayList();
        ArrayList<Nesne_sinifi> nesneListesi = new ArrayList();
        ArrayList<Nesne_sinifi> nesneListesiPc1 = new ArrayList();
        ArrayList<Nesne_sinifi> nesneListesiPc2 = new ArrayList();
        ArrayList<ImageIcon> IconListesi = new ArrayList();
        ArrayList<ImageIcon> IconListesi2 = new ArrayList();
        ArrayList<JLabel> LabelListesiSecim1 = new ArrayList();
        ArrayList<JLabel> LabelListesiSecim2 = new ArrayList();
        ArrayList<JLabel> LabelListesiSecim3 = new ArrayList();
        ArrayList<JLabel> LabelListesiSecim4 = new ArrayList();

        ImageIcon tas_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\t1.png");
        ImageIcon kagit_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\k1.jpg");
        ImageIcon makas_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\m1.png");
        ImageIcon cerceve_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\cerceve.jpg");
        ImageIcon kullanici_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\kullanici3.png");
        ImageIcon pc_resmi = new ImageIcon("C:\\Users\\Pc\\Desktop\\oyun\\src\\ımage_folder\\pc1.png");

        //Nesneler Oluşturuldu
        Tas_sinifi Tas1 = new Agir_Tas_sinifi(2, 3, 't');
        Tas_sinifi Tas2 = new Agir_Tas_sinifi(2, 3, 't');
        Tas_sinifi Tas3 = new Agir_Tas_sinifi(2, 3, 't');
        Kagit_sinifi Kagit1 = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Kagit_sinifi Kagit2 = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Kagit_sinifi Kagit3 = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Makas_sinifi Makas1 = new Usta_Makas_sinifi(2, 3, 'm');
        Makas_sinifi Makas2 = new Usta_Makas_sinifi(2, 3, 'm');
        Makas_sinifi Makas3 = new Usta_Makas_sinifi(2, 3, 'm');

        Tas_sinifi Tas1pc = new Agir_Tas_sinifi(2, 3, 't');
        Tas_sinifi Tas2pc = new Agir_Tas_sinifi(2, 3, 't');
        Tas_sinifi Tas3pc = new Agir_Tas_sinifi(2, 3, 't');
        Kagit_sinifi Kagit1pc = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Kagit_sinifi Kagit2pc = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Kagit_sinifi Kagit3pc = new Ozel_Kagıt_sinifi(2, 3, 'k');
        Makas_sinifi Makas1pc = new Usta_Makas_sinifi(2, 3, 'm');
        Makas_sinifi Makas2pc = new Usta_Makas_sinifi(2, 3, 'm');
        Makas_sinifi Makas3pc = new Usta_Makas_sinifi(2, 3, 'm');

        pcSecim.add(Tas1pc);
        pcSecim.add(Tas2pc);
        pcSecim.add(Tas3pc);
        pcSecim.add(Kagit1pc);
        pcSecim.add(Kagit2pc);
        pcSecim.add(Kagit3pc);
        pcSecim.add(Makas1pc);
        pcSecim.add(Makas2pc);
        pcSecim.add(Makas3pc);

        pcSecim2.add(Tas1);
        pcSecim2.add(Tas2);
        pcSecim2.add(Tas3);
        pcSecim2.add(Kagit1);
        pcSecim2.add(Kagit2);
        pcSecim2.add(Kagit3);
        pcSecim2.add(Makas1);
        pcSecim2.add(Makas2);
        pcSecim2.add(Makas3);

        //JFRAME KISMI
        JFrame Arayuz = new JFrame("Tas-Kagit-Makas//GİRİS");
        JFrame Arayuz2 = new JFrame("Tas-Kagit-Makas//OYUN");
        JFrame Arayuz3 = new JFrame("Tas-Kagit-Makas//SONUC");
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button10 = new JButton();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JButton nesne0button = new JButton();
        JButton nesne1button = new JButton();
        JButton nesne2button = new JButton();
        JButton nesne3button = new JButton();
        JButton nesne4button = new JButton();
        JButton nesne5button = new JButton();
        JButton nesne6button = new JButton();
        JButton nesne7button = new JButton();
        JButton nesne8button = new JButton();
        JButton secilmis0 = new JButton();
        JButton secilmis1 = new JButton();
        JButton secilmis2 = new JButton();
        JButton secilmis3 = new JButton();
        JButton secilmis4 = new JButton();
        JButton devam = new JButton();
        JButton devam2 = new JButton();
        JLabel pcsecilmis0 = new JLabel();
        JLabel pcsecilmis1 = new JLabel();
        JLabel pcsecilmis2 = new JLabel();
        JLabel pcsecilmis3 = new JLabel();
        JLabel pcsecilmis4 = new JLabel();
        JLabel pc2secilmis0 = new JLabel();
        JLabel pc2secilmis1 = new JLabel();
        JLabel pc2secilmis2 = new JLabel();
        JLabel pc2secilmis3 = new JLabel();
        JLabel pc2secilmis4 = new JLabel();
        JLabel nesne0 = new JLabel();
        JLabel nesne0_1 = new JLabel();
        JLabel nesne1 = new JLabel();
        JLabel nesne1_1 = new JLabel();
        JLabel nesne2 = new JLabel();
        JLabel nesne2_1 = new JLabel();
        JLabel nesne3 = new JLabel();
        JLabel nesne3_1 = new JLabel();
        JLabel nesne4 = new JLabel();
        JLabel nesne4_1 = new JLabel();
        JLabel pcnesne0 = new JLabel();
        JLabel pcnesne0_0 = new JLabel();
        JLabel pcnesne1 = new JLabel();
        JLabel pcnesne1_1 = new JLabel();
        JLabel pcnesne2 = new JLabel();
        JLabel pcnesne2_2 = new JLabel();
        JLabel pcnesne3 = new JLabel();
        JLabel pcnesne3_3 = new JLabel();
        JLabel pcnesne4 = new JLabel();
        JLabel pcnesne4_4 = new JLabel();
        JLabel pc2nesne0 = new JLabel();
        JLabel pc2nesne0_0 = new JLabel();
        JLabel pc2nesne1 = new JLabel();
        JLabel pc2nesne1_1 = new JLabel();
        JLabel pc2nesne2 = new JLabel();
        JLabel pc2nesne2_2 = new JLabel();
        JLabel pc2nesne3 = new JLabel();
        JLabel pc2nesne3_3 = new JLabel();
        JLabel pc2nesne4 = new JLabel();
        JLabel pc2nesne4_4 = new JLabel();
        JLabel kapisma1 = new JLabel();
        JLabel kapisma2 = new JLabel();
        JLabel sonuc = new JLabel();
        JLabel VS = new JLabel();
        JLabel Round = new JLabel();

        LabelListesiSecim1.add(pcnesne0);
        LabelListesiSecim1.add(pcnesne1);
        LabelListesiSecim1.add(pcnesne2);
        LabelListesiSecim1.add(pcnesne3);
        LabelListesiSecim1.add(pcnesne4);
        LabelListesiSecim2.add(pcnesne0_0);
        LabelListesiSecim2.add(pcnesne1_1);
        LabelListesiSecim2.add(pcnesne2_2);
        LabelListesiSecim2.add(pcnesne3_3);
        LabelListesiSecim2.add(pcnesne4_4);
        LabelListesiSecim3.add(pc2nesne0);
        LabelListesiSecim3.add(pc2nesne1);
        LabelListesiSecim3.add(pc2nesne2);
        LabelListesiSecim3.add(pc2nesne3);
        LabelListesiSecim3.add(pc2nesne4);
        LabelListesiSecim4.add(pc2nesne0_0);
        LabelListesiSecim4.add(pc2nesne1_1);
        LabelListesiSecim4.add(pc2nesne2_2);
        LabelListesiSecim4.add(pc2nesne3_3);
        LabelListesiSecim4.add(pc2nesne4_4);

        nesne0button.setIcon(tas_resmi);
        nesne1button.setIcon(tas_resmi);
        nesne2button.setIcon(tas_resmi);
        nesne3button.setIcon(kagit_resmi);
        nesne4button.setIcon(kagit_resmi);
        nesne5button.setIcon(kagit_resmi);
        nesne6button.setIcon(makas_resmi);
        nesne7button.setIcon(makas_resmi);
        nesne8button.setIcon(makas_resmi);

        tf1.setVisible(false);
        tf2.setVisible(false);
        label6.setVisible(false);
        label2.setVisible(false);
        button4.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        nesne0button.setVisible(false);
        nesne1button.setVisible(false);
        nesne2button.setVisible(false);
        nesne3button.setVisible(false);
        nesne4button.setVisible(false);
        nesne5button.setVisible(false);
        nesne6button.setVisible(false);
        nesne7button.setVisible(false);
        nesne8button.setVisible(false);
        devam.setVisible(false);
        devam2.setVisible(false);

        secilmis0.setVisible(false);
        secilmis1.setVisible(false);
        secilmis2.setVisible(false);
        secilmis3.setVisible(false);
        secilmis4.setVisible(false);

        label1.setText("Oyun Modunu Seçiniz");
        label2.setText("Oyuncu adi giriniz");
        label6.setText("Round Sayisi Giriniz");
        label3.setText("Oyuncu ID: " + kullanici1.getOyuncuID());
        label4.setText("! Her nesneden en az bir tane secmelisin !");
        button1.setIcon(kullanici_resmi);
        button1.setBackground(Color.BLACK);
        button2.setIcon(pc_resmi);
        button2.setBackground(Color.BLACK);
        Arayuz.getContentPane().setBackground(Color.GRAY);
        button4.setText("Onayla");
        button10.setText("Kapat");
        VS.setText("VS");
        Round.setText("Round " + bilgi.getRound());
        devam.setText("Devam");
        devam2.setText("Devam");
        kapisma1.setIcon(cerceve_resmi);
        kapisma2.setIcon(cerceve_resmi);
        Arayuz2.getContentPane().setBackground(Color.GRAY);
        Arayuz3.getContentPane().setBackground(Color.GRAY);
        kapisma1.setBackground(Color.WHITE);
        kapisma2.setBackground(Color.WHITE);

        button1.setBounds(150, 150, 200, 100);
        button2.setBounds(550, 150, 200, 100);
        nesne0button.setBounds(50, 50, 100, 100);
        nesne1button.setBounds(50, 200, 100, 100);
        nesne2button.setBounds(50, 350, 100, 100);
        nesne3button.setBounds(200, 50, 100, 100);
        nesne4button.setBounds(200, 200, 100, 100);
        nesne5button.setBounds(200, 350, 100, 100);
        nesne6button.setBounds(350, 50, 100, 100);
        nesne7button.setBounds(350, 200, 100, 100);
        nesne8button.setBounds(350, 350, 100, 100);
        button4.setBounds(600, 290, 200, 20);
        label1.setBounds(400, 70, 200, 100);
        label2.setBounds(646, 150, 100, 20);
        tf1.setBounds(600, 180, 200, 20);
        label6.setBounds(646, 220, 200, 20);
        tf2.setBounds(600, 240, 200, 20);
        label3.setBounds(10, 20, 200, 20);
        label5.setBounds(10, 5, 200, 20);
        label4.setBounds(600, 75, 300, 50);
        button5.setBounds(100, 50, 100, 30);
        button6.setBounds(100, 130, 100, 30);
        button7.setBounds(100, 210, 100, 30);
        button8.setBounds(100, 290, 100, 30);
        button9.setBounds(100, 370, 100, 30);
        button10.setBounds(850, 420, 100, 20);
        secilmis0.setBounds(50, 60, 100, 100);
        secilmis1.setBounds(50, 180, 100, 100);
        secilmis2.setBounds(50, 300, 100, 100);
        secilmis3.setBounds(50, 420, 100, 100);
        secilmis4.setBounds(50, 540, 100, 100);
        nesne0.setBounds(160, 90, 200, 20);
        nesne0_1.setBounds(160, 110, 200, 20);
        nesne1.setBounds(160, 210, 200, 20);
        nesne1_1.setBounds(160, 230, 200, 20);
        nesne2.setBounds(160, 330, 200, 20);
        nesne2_1.setBounds(160, 350, 200, 20);
        nesne3.setBounds(160, 450, 200, 20);
        nesne3_1.setBounds(160, 470, 200, 20);
        nesne4.setBounds(160, 570, 200, 20);
        nesne4_1.setBounds(160, 590, 200, 20);
        pcsecilmis0.setBounds(1200, 60, 100, 100);
        pcsecilmis1.setBounds(1200, 180, 100, 100);
        pcsecilmis2.setBounds(1200, 300, 100, 100);
        pcsecilmis3.setBounds(1200, 420, 100, 100);
        pcsecilmis4.setBounds(1200, 540, 100, 100);
        pc2secilmis0.setBounds(50, 60, 100, 100);
        pc2secilmis1.setBounds(50, 180, 100, 100);
        pc2secilmis2.setBounds(50, 300, 100, 100);
        pc2secilmis3.setBounds(50, 420, 100, 100);
        pc2secilmis4.setBounds(50, 540, 100, 100);
        pcnesne0.setBounds(1050, 90, 200, 20);
        pcnesne0_0.setBounds(1050, 110, 200, 20);
        pcnesne1.setBounds(1050, 210, 200, 20);
        pcnesne1_1.setBounds(1050, 230, 200, 20);
        pcnesne2.setBounds(1050, 330, 200, 20);
        pcnesne2_2.setBounds(1050, 350, 200, 20);
        pcnesne3.setBounds(1050, 450, 200, 20);
        pcnesne3_3.setBounds(1050, 470, 200, 20);
        pcnesne4.setBounds(1050, 570, 200, 20);
        pcnesne4_4.setBounds(1050, 590, 200, 20);
        pc2nesne0.setBounds(160, 90, 200, 20);
        pc2nesne0_0.setBounds(160, 110, 200, 20);
        pc2nesne1.setBounds(160, 210, 200, 20);
        pc2nesne1_1.setBounds(160, 230, 200, 20);
        pc2nesne2.setBounds(160, 330, 200, 20);
        pc2nesne2_2.setBounds(160, 350, 200, 20);
        pc2nesne3.setBounds(160, 450, 200, 20);
        pc2nesne3_3.setBounds(160, 470, 200, 20);
        pc2nesne4.setBounds(160, 570, 200, 20);
        pc2nesne4_4.setBounds(160, 590, 200, 20);
        kapisma1.setBounds(520, 300, 100, 100);
        kapisma2.setBounds(720, 300, 100, 100);
        Round.setBounds(650, 200, 200, 20);
        VS.setBounds(662, 340, 200, 20);
        devam.setBounds(620, 430, 100, 20);
        devam2.setBounds(620, 430, 100, 20);

        //Kullanıcı-Pc butonu seçildiğinde
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                label1.setVisible(false);
                nesne0button.setVisible(true);
                nesne1button.setVisible(true);
                nesne2button.setVisible(true);
                nesne3button.setVisible(true);
                nesne4button.setVisible(true);
                nesne5button.setVisible(true);
                nesne6button.setVisible(true);
                nesne7button.setVisible(true);
                nesne8button.setVisible(true);
            }

        });

        //Pc-Pc butonu seçildiğinde
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Arayuz.setVisible(false);
                Arayuz2.setVisible(true);
                devam2.setVisible(true);
                Arayuz2.add(button10);
                button10.setBounds(1200, 670, 100, 20);

                //Pc1 secim yaptığında
                boolean cık = true;
                while (cık) {
                    int a = pc1.nesneSec(nesneListesiPc1, pcSecim);
                    switch (a) {
                        case 1:
                            cık = false;
                            break;
                        case 2:
                            nesneListesiPc1.removeAll(nesneListesiPc1);
                            break;
                        case 0:
                            nesneListesiPc1.removeAll(nesneListesiPc1);
                            break;
                    }
                }

                //Pc2 secim yaptığında
                boolean cık2 = true;
                while (cık2) {
                    int a = pc2.nesneSec(nesneListesiPc2, pcSecim2);
                    switch (a) {
                        case 1:
                            cık2 = false;
                            break;
                        case 2:
                            nesneListesiPc2.removeAll(nesneListesiPc2);
                            break;
                        case 0:
                            nesneListesiPc2.removeAll(nesneListesiPc2);
                            break;
                    }
                }

                //Pc1 icon
                for (int i = 0; i < nesneListesiPc1.size(); i++) {
                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ta")) {
                        IconListesi2.add(tas_resmi);
                    }

                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ka")) {
                        IconListesi2.add(kagit_resmi);
                    }

                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ma")) {
                        IconListesi2.add(makas_resmi);
                    }
                }

                pcsecilmis0.setIcon(IconListesi2.get(0));
                pcsecilmis1.setIcon(IconListesi2.get(1));
                pcsecilmis2.setIcon(IconListesi2.get(2));
                pcsecilmis3.setIcon(IconListesi2.get(3));
                pcsecilmis4.setIcon(IconListesi2.get(4));

                //Pc2 icon
                for (int i = 0; i < nesneListesiPc2.size(); i++) {
                    if (nesneListesiPc2.get(i).getClass().toString().contains("Ta")) {
                        IconListesi.add(tas_resmi);
                    }

                    if (nesneListesiPc2.get(i).getClass().toString().contains("Ka")) {
                        IconListesi.add(kagit_resmi);
                    }

                    if (nesneListesiPc2.get(i).getClass().toString().contains("Ma")) {
                        IconListesi.add(makas_resmi);
                    }
                }

                pc2secilmis0.setIcon(IconListesi.get(0));
                pc2secilmis1.setIcon(IconListesi.get(1));
                pc2secilmis2.setIcon(IconListesi.get(2));
                pc2secilmis3.setIcon(IconListesi.get(3));
                pc2secilmis4.setIcon(IconListesi.get(4));

                pcnesne0.setText("Seviye Puani:  " + nesneListesiPc1.get(0).getSeviyePuani());
                pcnesne0_0.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(0).getDayaniklilik());
                pcnesne1.setText("Seviye Puani:  " + nesneListesiPc1.get(1).getSeviyePuani());
                pcnesne1_1.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(1).getDayaniklilik());
                pcnesne2.setText("Seviye Puani:  " + nesneListesiPc1.get(2).getSeviyePuani());
                pcnesne2_2.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(2).getDayaniklilik());
                pcnesne3.setText("Seviye Puani:  " + nesneListesiPc1.get(3).getSeviyePuani());
                pcnesne3_3.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(3).getDayaniklilik());
                pcnesne4.setText("Seviye Puani:  " + nesneListesiPc1.get(4).getSeviyePuani());
                pcnesne4_4.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(4).getDayaniklilik());

                pc2nesne0.setText("Seviye Puani:  " + nesneListesiPc1.get(0).getSeviyePuani());
                pc2nesne0_0.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(0).getDayaniklilik());
                pc2nesne1.setText("Seviye Puani:  " + nesneListesiPc1.get(1).getSeviyePuani());
                pc2nesne1_1.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(1).getDayaniklilik());
                pc2nesne2.setText("Seviye Puani:  " + nesneListesiPc1.get(2).getSeviyePuani());
                pc2nesne2_2.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(2).getDayaniklilik());
                pc2nesne3.setText("Seviye Puani:  " + nesneListesiPc1.get(3).getSeviyePuani());
                pc2nesne3_3.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(3).getDayaniklilik());
                pc2nesne4.setText("Seviye Puani:  " + nesneListesiPc1.get(4).getSeviyePuani());
                pc2nesne4_4.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(4).getDayaniklilik());

            }

        });

        //TAS1
        nesne0button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne0button.setEnabled(false);
                IconListesi.add(tas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Tas1)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);

                        break;
                    case 2:
                        break;

                }

            }

        });

        //TAS2
        nesne1button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne1button.setEnabled(false);
                IconListesi.add(tas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Tas2)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //TAS3
        nesne2button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne2button.setEnabled(false);
                IconListesi.add(tas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Tas3)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //KAĞIT1
        nesne3button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne3button.setEnabled(false);
                IconListesi.add(kagit_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Kagit1)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //KAĞIT2
        nesne4button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne4button.setEnabled(false);
                IconListesi.add(kagit_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Kagit2)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //KAĞIT3
        nesne5button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne5button.setEnabled(false);
                IconListesi.add(kagit_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Kagit3)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //MAKAS1
        nesne6button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne6button.setEnabled(false);
                IconListesi.add(makas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Makas1)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //MAKAS2
        nesne7button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne7button.setEnabled(false);
                IconListesi.add(makas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Makas2)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        button4.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //MAKAS3
        nesne8button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nesne8button.setEnabled(false);
                IconListesi.add(makas_resmi);
                switch (kullanici1.nesneSec(nesneListesi, Makas3)) {
                    case 1:
                        nesne0button.setEnabled(false);
                        nesne1button.setEnabled(false);
                        nesne2button.setEnabled(false);
                        nesne3button.setEnabled(false);
                        nesne4button.setEnabled(false);
                        nesne5button.setEnabled(false);
                        nesne6button.setEnabled(false);
                        nesne7button.setEnabled(false);
                        nesne8button.setEnabled(false);
                        label4.setText("Kart Secimleri Tamamlandı");
                        label2.setVisible(true);
                        tf1.setVisible(true);
                        tf2.setVisible(true);
                        label6.setVisible(true);
                        button4.setVisible(true);
                        break;
                    case 0:
                        nesneListesi.removeAll(nesneListesi);
                        IconListesi.removeAll(IconListesi);
                        label4.setVisible(true);
                        nesne0button.setEnabled(true);
                        nesne1button.setEnabled(true);
                        nesne2button.setEnabled(true);
                        nesne3button.setEnabled(true);
                        nesne4button.setEnabled(true);
                        nesne5button.setEnabled(true);
                        nesne6button.setEnabled(true);
                        nesne7button.setEnabled(true);
                        nesne8button.setEnabled(true);
                        break;
                    case 2:
                        break;

                }

            }

        });

        //Onayla
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Arayuz.setVisible(false);
                Arayuz2.setVisible(true);
                Arayuz2.add(button10);
                label5.setText("Oyuncu Adi: " + tf1.getText());
                button10.setBounds(1200, 670, 100, 20);
                label3.setVisible(true);
                label5.setVisible(true);
                bilgi.setMaxRound(Integer.parseInt(tf2.getText()));

                secilmis0.setVisible(true);
                secilmis1.setVisible(true);
                secilmis2.setVisible(true);
                secilmis3.setVisible(true);
                secilmis4.setVisible(true);

                secilmis0.setIcon(IconListesi.get(0));
                secilmis1.setIcon(IconListesi.get(1));
                secilmis2.setIcon(IconListesi.get(2));
                secilmis3.setIcon(IconListesi.get(3));
                secilmis4.setIcon(IconListesi.get(4));

                //Bilgisayarın nesne seçimi
                boolean cık = true;
                while (cık) {
                    int a = pc1.nesneSec(nesneListesiPc1, pcSecim);
                    switch (a) {
                        case 1:
                            cık = false;
                            break;
                        case 2:
                            nesneListesiPc1.removeAll(nesneListesiPc1);
                            break;
                        case 0:
                            nesneListesiPc1.removeAll(nesneListesiPc1);
                            break;
                    }
                }

                for (int i = 0; i < nesneListesiPc1.size(); i++) {
                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ta")) {
                        IconListesi2.add(tas_resmi);
                    }

                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ka")) {
                        IconListesi2.add(kagit_resmi);
                    }

                    if (nesneListesiPc1.get(i).getClass().toString().contains("Ma")) {
                        IconListesi2.add(makas_resmi);
                    }
                }

                pcsecilmis0.setIcon(IconListesi2.get(0));
                pcsecilmis1.setIcon(IconListesi2.get(1));
                pcsecilmis2.setIcon(IconListesi2.get(2));
                pcsecilmis3.setIcon(IconListesi2.get(3));
                pcsecilmis4.setIcon(IconListesi2.get(4));

                nesne0.setText("Seviye Puani:  " + nesneListesi.get(0).getSeviyePuani());
                nesne0_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(0).getDayaniklilik());
                nesne1.setText("Seviye Puani:  " + nesneListesi.get(1).getSeviyePuani());
                nesne1_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(1).getDayaniklilik());
                nesne2.setText("Seviye Puani:  " + nesneListesi.get(2).getSeviyePuani());
                nesne2_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(2).getDayaniklilik());
                nesne3.setText("Seviye Puani:  " + nesneListesi.get(3).getSeviyePuani());
                nesne3_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(3).getDayaniklilik());
                nesne4.setText("Seviye Puani:  " + nesneListesi.get(4).getSeviyePuani());
                nesne4_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(4).getDayaniklilik());

                pcnesne0.setText("Seviye Puani:  " + nesneListesiPc1.get(0).getSeviyePuani());
                pcnesne0_0.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(0).getDayaniklilik());
                pcnesne1.setText("Seviye Puani:  " + nesneListesiPc1.get(1).getSeviyePuani());
                pcnesne1_1.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(1).getDayaniklilik());
                pcnesne2.setText("Seviye Puani:  " + nesneListesiPc1.get(2).getSeviyePuani());
                pcnesne2_2.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(2).getDayaniklilik());
                pcnesne3.setText("Seviye Puani:  " + nesneListesiPc1.get(3).getSeviyePuani());
                pcnesne3_3.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(3).getDayaniklilik());
                pcnesne4.setText("Seviye Puani:  " + nesneListesiPc1.get(4).getSeviyePuani());
                pcnesne4_4.setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(4).getDayaniklilik());

            }
        });

        //Kapat butonu seçildiğinde
        button10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        //K1
        secilmis0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis0.setEnabled(false);
                secilmis1.setEnabled(false);
                secilmis2.setEnabled(false);
                secilmis3.setEnabled(false);
                secilmis4.setEnabled(false);
                devam.setVisible(true);
                kapisma1.setIcon(IconListesi.get(0));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1 = 0, d2 = 0, e1 = 0, e2 = 0;
                //Cisimlerin seviye puanlarına göre if açılacak ona göre o1 ya da o2 çağrılacak
                if (nesneListesi.get(0).getSeviyePuani() < 40 && nesneListesiPc1.get(0).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(0).etkiHesapla(nesneListesi.get(0).ozellik1(), nesneListesi.get(0).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(0).ozellik1(), nesneListesi.get(0).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(0).getSeviyePuani() > 40 && nesneListesiPc1.get(0).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(0).etkiHesapla(nesneListesi.get(0).ozellik2(), nesneListesi.get(0).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(0).ozellik2(), nesneListesi.get(0).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (nesneListesi.get(0).getSeviyePuani() > 40 && nesneListesiPc1.get(0).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(0).etkiHesapla(nesneListesi.get(0).ozellik2(), nesneListesi.get(0).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(0).ozellik1(), nesneListesi.get(0).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (nesneListesi.get(0).getSeviyePuani() < 40 && nesneListesiPc1.get(0).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(0).etkiHesapla(nesneListesi.get(0).ozellik1(), nesneListesi.get(0).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(0).ozellik2(), nesneListesi.get(0).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (e1 > e2) {
                    nesneListesi.get(0).setSeviyePuani(20);

                    nesneListesi.get(0).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                    System.out.println("OK");
                }

                if (e2 > e1) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesi.get(0).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e2 == e1) {

                }

                nesne0.setText("Seviye Puani:  " + nesneListesi.get(0).getSeviyePuani());
                nesne0_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(0).getDayaniklilik());

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }

            }

        });

        //K2
        secilmis1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis0.setEnabled(false);
                secilmis1.setEnabled(false);
                secilmis2.setEnabled(false);
                secilmis3.setEnabled(false);
                secilmis4.setEnabled(false);
                devam.setVisible(true);
                kapisma1.setIcon(IconListesi.get(1));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1 = 0, d2 = 0, e1 = 0, e2 = 0;
                
                if (nesneListesi.get(1).getSeviyePuani() < 40 && nesneListesiPc1.get(1).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(1).etkiHesapla(nesneListesi.get(1).ozellik1(), nesneListesi.get(1).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(1).ozellik1(), nesneListesi.get(1).getCins());

                    d1 = nesneListesi.get(1).durumGuncelle(nesneListesi.get(1).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(1).getSeviyePuani() > 40 && nesneListesiPc1.get(1).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(1).etkiHesapla(nesneListesi.get(1).ozellik2(), nesneListesi.get(1).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(1).ozellik2(), nesneListesi.get(1).getCins());

                    d1 = nesneListesi.get(1).durumGuncelle(nesneListesi.get(1).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (nesneListesi.get(1).getSeviyePuani() > 40 && nesneListesiPc1.get(1).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(1).etkiHesapla(nesneListesi.get(1).ozellik2(), nesneListesi.get(1).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(1).ozellik1(), nesneListesi.get(1).getCins());

                    d1 = nesneListesi.get(1).durumGuncelle(nesneListesi.get(1).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(1).getSeviyePuani() < 40 && nesneListesiPc1.get(1).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(1).etkiHesapla(nesneListesi.get(1).ozellik1(), nesneListesi.get(1).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(1).ozellik2(), nesneListesi.get(1).getCins());

                    d1 = nesneListesi.get(1).durumGuncelle(nesneListesi.get(1).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }
           
                
                if (e1 > e2) {
                    nesneListesi.get(1).setSeviyePuani(20);

                    nesneListesi.get(1).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e2 > e1) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesi.get(1).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e1 == e2) {

                }

                nesne1.setText("Seviye Puani:  " + nesneListesi.get(1).getSeviyePuani());
                nesne1_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(1).getDayaniklilik());

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }
            }

        });

        //K3
        secilmis2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis0.setEnabled(false);
                secilmis1.setEnabled(false);
                secilmis2.setEnabled(false);
                secilmis3.setEnabled(false);
                secilmis4.setEnabled(false);
                devam.setVisible(true);
                kapisma1.setIcon(IconListesi.get(2));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1=0, d2=0, e1 = 0, e2 = 0;
               
                if (nesneListesi.get(2).getSeviyePuani() < 40 && nesneListesiPc1.get(2).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(2).etkiHesapla(nesneListesi.get(2).ozellik1(), nesneListesi.get(2).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(2).ozellik1(), nesneListesi.get(2).getCins());

                    d1 = nesneListesi.get(2).durumGuncelle(nesneListesi.get(2).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(2).getSeviyePuani() > 40 && nesneListesiPc1.get(2).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(2).etkiHesapla(nesneListesi.get(2).ozellik2(), nesneListesi.get(2).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(2).ozellik2(), nesneListesi.get(2).getCins());

                    d1 = nesneListesi.get(2).durumGuncelle(nesneListesi.get(2).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(2).getSeviyePuani() > 40 && nesneListesiPc1.get(2).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(2).etkiHesapla(nesneListesi.get(2).ozellik2(), nesneListesi.get(2).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(2).ozellik1(), nesneListesi.get(2).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (nesneListesi.get(2).getSeviyePuani() < 40 && nesneListesiPc1.get(2).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(2).etkiHesapla(nesneListesi.get(2).ozellik1(), nesneListesi.get(2).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(2).ozellik2(), nesneListesi.get(2).getCins());

                    d1 = nesneListesi.get(2).durumGuncelle(nesneListesi.get(2).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }
                
                if (e1 > e2) {
                    nesneListesi.get(2).setSeviyePuani(20);

                    nesneListesi.get(2).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e2 > e1) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesi.get(2).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e1 == e2) {

                }

                nesne2.setText("Seviye Puani:  " + nesneListesi.get(2).getSeviyePuani());
                nesne2_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(2).getDayaniklilik());

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }
            }

        });

        //K4
        secilmis3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis0.setEnabled(false);
                secilmis1.setEnabled(false);
                secilmis2.setEnabled(false);
                secilmis3.setEnabled(false);
                secilmis4.setEnabled(false);
                devam.setVisible(true);
                kapisma1.setIcon(IconListesi.get(3));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1=0, d2=0, e1 = 0, e2 = 0;
               
                if (nesneListesi.get(3).getSeviyePuani() < 40 && nesneListesiPc1.get(3).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(3).etkiHesapla(nesneListesi.get(3).ozellik1(), nesneListesi.get(3).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(3).ozellik1(), nesneListesi.get(3).getCins());

                    d1 = nesneListesi.get(3).durumGuncelle(nesneListesi.get(3).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(3).getSeviyePuani() > 40 && nesneListesiPc1.get(3).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(3).etkiHesapla(nesneListesi.get(3).ozellik2(), nesneListesi.get(3).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(3).ozellik2(), nesneListesi.get(3).getCins());

                    d1 = nesneListesi.get(3).durumGuncelle(nesneListesi.get(3).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                    System.out.println("OK");
                }

                if (nesneListesi.get(3).getSeviyePuani() > 40 && nesneListesiPc1.get(3).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(3).etkiHesapla(nesneListesi.get(3).ozellik2(), nesneListesi.get(3).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(3).ozellik1(), nesneListesi.get(3).getCins());

                    d1 = nesneListesi.get(3).durumGuncelle(nesneListesi.get(3).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(3).getSeviyePuani() < 40 && nesneListesiPc1.get(3).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(3).etkiHesapla(nesneListesi.get(3).ozellik1(), nesneListesi.get(3).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(3).ozellik2(), nesneListesi.get(3).getCins());

                    d1 = nesneListesi.get(3).durumGuncelle(nesneListesi.get(3).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }
                
                if (e1 > e2) {
                    nesneListesi.get(3).setSeviyePuani(20);

                    nesneListesi.get(3).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }

                if (e2 > e1) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesi.get(3).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                }
                
                if (e1 == e2) {

                }

                nesne3.setText("Seviye Puani:  " + nesneListesi.get(3).getSeviyePuani());
                nesne3_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(3).getDayaniklilik());

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }
            }

        });

        //K5
        secilmis4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis0.setEnabled(false);
                secilmis1.setEnabled(false);
                secilmis2.setEnabled(false);
                secilmis3.setEnabled(false);
                secilmis4.setEnabled(false);
                devam.setVisible(true);
                kapisma1.setIcon(IconListesi.get(4));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1=0, d2=0, e1=0, e2=0;
               
                if (nesneListesi.get(4).getSeviyePuani() < 40 && nesneListesiPc1.get(4).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(4).etkiHesapla(nesneListesi.get(4).ozellik1(), nesneListesi.get(4).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(4).ozellik1(), nesneListesi.get(4).getCins());

                    d1 = nesneListesi.get(0).durumGuncelle(nesneListesi.get(0).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(4).getSeviyePuani() > 40 && nesneListesiPc1.get(4).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(4).etkiHesapla(nesneListesi.get(4).ozellik2(), nesneListesi.get(4).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(4).ozellik2(), nesneListesi.get(4).getCins());

                    d1 = nesneListesi.get(4).durumGuncelle(nesneListesi.get(4).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(4).getSeviyePuani() > 40 && nesneListesiPc1.get(4).getSeviyePuani() < 40) {

                    e1 = nesneListesi.get(4).etkiHesapla(nesneListesi.get(4).ozellik2(), nesneListesi.get(4).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(4).ozellik1(), nesneListesi.get(4).getCins());

                    d1 = nesneListesi.get(4).durumGuncelle(nesneListesi.get(4).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesi.get(4).getSeviyePuani() < 40 && nesneListesiPc1.get(4).getSeviyePuani() > 40) {

                    e1 = nesneListesi.get(4).etkiHesapla(nesneListesi.get(4).ozellik1(), nesneListesi.get(4).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesi.get(4).ozellik2(), nesneListesi.get(4).getCins());

                    d1 = nesneListesi.get(4).durumGuncelle(nesneListesi.get(4).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }
                
                if (e1 > e2) {
                    nesneListesi.get(4).setSeviyePuani(20);

                    nesneListesi.get(4).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);

                }

                if (e2 > e1) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesi.get(4).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);

                }

                if (e1 == e2) {

                }

                nesne4.setText("Seviye Puani:  " + nesneListesi.get(4).getSeviyePuani());
                nesne4_1.setText("Dayaniklilik Puani:  " + nesneListesi.get(4).getDayaniklilik());

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }
            }

        });

        //Devam
        devam.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                secilmis4.setEnabled(true);
                secilmis3.setEnabled(true);
                secilmis2.setEnabled(true);
                secilmis1.setEnabled(true);
                secilmis0.setEnabled(true);

                kapisma1.setIcon(cerceve_resmi);
                kapisma2.setIcon(cerceve_resmi);
                bilgi.setRound(1);
                Round.setText("Round " + bilgi.getRound());

                devam.setVisible(false);

                if (bilgi.getRound() == bilgi.getMaxRound()) {
                    Arayuz2.setVisible(false);
                    Arayuz3.setVisible(true);
                    Arayuz3.add(button10);
                    sonuc.setBounds(100, 80, 500, 30);
                    button10.setBounds(100, 130, 200, 20);

                    for (int i = 0; i < nesneListesi.size(); i++) {
                        bilgi.setOyuncu1(nesneListesi.get(i).getDayaniklilik());
                    }

                    for (int i = 0; i < nesneListesiPc1.size(); i++) {
                        bilgi.setOyuncu2(nesneListesiPc1.get(i).getDayaniklilik());
                    }

                    if (bilgi.getOyuncu1() < bilgi.getOyuncu2()) {
                        //Kullanıcı kazandı
                        sonuc.setText("Oyuncu2 oyunu " + bilgi.getOyuncu2() + " puan ile kazandi");
                    }

                    if (bilgi.getOyuncu1() > bilgi.getOyuncu2()) {
                        //Pc kazandı
                        sonuc.setText("Oyuncu1 oyunu " + bilgi.getOyuncu1() + " puan ile kazandi");
                    }

                    if (bilgi.getOyuncu1() == bilgi.getOyuncu2()) {
                        //Berabere
                        sonuc.setText("Oyun Berabere Sonuclandi");
                    }

                }
            }

        });

        //Pc-Pc oyunu icin devam butonu
        devam2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Kapısmalar
                int b = new Random().nextInt(4);
                kapisma1.setIcon(IconListesi.get(b));
                int a = new Random().nextInt(4);
                kapisma2.setIcon(IconListesi2.get(a));
                double d1 = 0, d2 = 0, e1, e2;
                //Cisimlerin seviye puanlarına göre if açılacak ona göre o1 ya da o2 çağrılacak
                if (nesneListesiPc2.get(b).getSeviyePuani() < 40 && nesneListesiPc1.get(b).getSeviyePuani() < 40) {

                    e1 = nesneListesiPc2.get(b).etkiHesapla(nesneListesiPc2.get(b).ozellik1(), nesneListesiPc2.get(b).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesiPc2.get(b).ozellik1(), nesneListesiPc2.get(b).getCins());

                    d1 = nesneListesiPc2.get(b).durumGuncelle(nesneListesiPc2.get(b).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesiPc2.get(b).getSeviyePuani() > 40 && nesneListesiPc1.get(a).getSeviyePuani() > 40) {

                    e1 = nesneListesiPc2.get(b).etkiHesapla(nesneListesiPc2.get(b).ozellik2(), nesneListesiPc2.get(b).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesiPc2.get(b).ozellik2(), nesneListesiPc2.get(b).getCins());

                    d1 = nesneListesiPc2.get(b).durumGuncelle(nesneListesiPc2.get(b).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesiPc2.get(b).getSeviyePuani() > 40 && nesneListesiPc1.get(a).getSeviyePuani() < 40) {

                    e1 = nesneListesiPc2.get(b).etkiHesapla(nesneListesiPc2.get(b).ozellik2(), nesneListesiPc2.get(b).getCins(), nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins(), nesneListesiPc2.get(b).ozellik1(), nesneListesiPc2.get(b).getCins());

                    d1 = nesneListesiPc2.get(b).durumGuncelle(nesneListesiPc2.get(b).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (nesneListesiPc2.get(b).getSeviyePuani() < 40 && nesneListesiPc1.get(a).getSeviyePuani() > 40) {

                    e1 = nesneListesiPc2.get(b).etkiHesapla(nesneListesiPc2.get(b).ozellik1(), nesneListesiPc2.get(b).getCins(), nesneListesiPc1.get(a).ozellik1(), nesneListesiPc1.get(a).getCins());
                    e2 = nesneListesiPc1.get(a).etkiHesapla(nesneListesiPc1.get(a).ozellik2(), nesneListesiPc1.get(a).getCins(), nesneListesiPc2.get(b).ozellik2(), nesneListesiPc2.get(b).getCins());

                    d1 = nesneListesiPc2.get(b).durumGuncelle(nesneListesiPc2.get(b).getDayaniklilik(), e1);
                    d2 = nesneListesiPc1.get(a).durumGuncelle(nesneListesiPc1.get(a).getDayaniklilik(), e2);
                }

                if (d1 < d2) {
                    nesneListesiPc2.get(b).setSeviyePuani(20);

                    nesneListesiPc2.get(b).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                } else if (d1 > d2) {
                    nesneListesiPc1.get(a).setSeviyePuani(20);

                    nesneListesiPc2.get(b).setDayaniklilik(d2);
                    nesneListesiPc1.get(a).setDayaniklilik(d1);
                } else {
                    System.out.println("cay yok");
                }

                String ara2 = String.valueOf(b);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim3.get(i).toString().contains(ara2)) {
                        LabelListesiSecim3.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim4.get(i).toString().contains(ara2)) {
                        LabelListesiSecim4.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }

                String ara = String.valueOf(a);
                for (int i = 0; i < 5; i++) {
                    if (LabelListesiSecim1.get(i).toString().contains(ara)) {
                        LabelListesiSecim1.get(i).setText("Seviye Puani:  " + nesneListesiPc1.get(i).getSeviyePuani());
                    }

                    if (LabelListesiSecim2.get(i).toString().contains(ara)) {
                        LabelListesiSecim2.get(i).setText("Dayaniklilik Puani:  " + nesneListesiPc1.get(i).getDayaniklilik());
                    }

                }

                //Sonuc
                bilgi.setRound(1);
                Round.setText("Round " + bilgi.getRound());

                if (bilgi.getRound() == 10) {
                    Arayuz2.setVisible(false);
                    Arayuz3.setVisible(true);
                    Arayuz3.add(button10);
                    sonuc.setBounds(100, 80, 500, 30);
                    button10.setBounds(100, 130, 200, 20);

                    for (int i = 0; i < nesneListesiPc2.size(); i++) {
                        bilgi.setOyuncu1(nesneListesiPc2.get(i).getDayaniklilik());
                    }

                    for (int i = 0; i < nesneListesiPc1.size(); i++) {
                        bilgi.setOyuncu2(nesneListesiPc1.get(i).getDayaniklilik());
                    }

                    if (bilgi.getOyuncu1() < bilgi.getOyuncu2()) {
                        //Kullanıcı kazandı
                        sonuc.setText("Oyuncu2 oyunu " + bilgi.getOyuncu2() + " puan ile kazandi");
                    }

                    if (bilgi.getOyuncu1() > bilgi.getOyuncu2()) {
                        //Pc kazandı
                        sonuc.setText("Oyuncu1 oyunu " + bilgi.getOyuncu1() + " puan ile kazandi");
                    }

                    if (bilgi.getOyuncu1() == bilgi.getOyuncu2()) {
                        //Berabere
                        sonuc.setText("Oyun Berabere Sonuclandi");
                    }

                }

            }

        });

        Arayuz.add(button5);
        Arayuz.add(button6);
        Arayuz.add(button7);
        Arayuz.add(button8);
        Arayuz.add(button9);
        Arayuz.add(button10);
        Arayuz.add(nesne0button);
        Arayuz.add(nesne1button);
        Arayuz.add(nesne2button);
        Arayuz.add(nesne3button);
        Arayuz.add(nesne4button);
        Arayuz.add(nesne5button);
        Arayuz.add(nesne6button);
        Arayuz.add(nesne7button);
        Arayuz.add(nesne8button);
        Arayuz2.add(label5);
        Arayuz.add(label4);
        Arayuz2.add(label3);
        Arayuz.add(label2);
        Arayuz.add(label6);
        Arayuz.add(tf1);
        Arayuz.add(tf2);
        Arayuz.add(button4);
        Arayuz.add(label1);
        Arayuz.add(button1);
        Arayuz.add(button2);
        Arayuz.setSize(1000, 500);

        Arayuz2.add(secilmis0);
        Arayuz2.add(secilmis1);
        Arayuz2.add(secilmis2);
        Arayuz2.add(secilmis3);
        Arayuz2.add(secilmis4);
        Arayuz2.add(pcsecilmis0);
        Arayuz2.add(pcsecilmis1);
        Arayuz2.add(pcsecilmis2);
        Arayuz2.add(pcsecilmis3);
        Arayuz2.add(pcsecilmis4);
        Arayuz2.add(nesne0);
        Arayuz2.add(nesne1);
        Arayuz2.add(nesne2);
        Arayuz2.add(nesne3);
        Arayuz2.add(nesne4);
        Arayuz2.add(nesne0_1);
        Arayuz2.add(nesne1_1);
        Arayuz2.add(nesne2_1);
        Arayuz2.add(nesne3_1);
        Arayuz2.add(nesne4_1);
        Arayuz2.add(kapisma1);
        Arayuz2.add(kapisma2);
        Arayuz2.add(VS);
        Arayuz2.add(Round);
        Arayuz2.add(pc2secilmis0);
        Arayuz2.add(pc2secilmis1);
        Arayuz2.add(pc2secilmis2);
        Arayuz2.add(pc2secilmis3);
        Arayuz2.add(pc2secilmis4);

        Arayuz2.add(pcnesne0);
        Arayuz2.add(pcnesne1);
        Arayuz2.add(pcnesne2);
        Arayuz2.add(pcnesne3);
        Arayuz2.add(pcnesne4);
        Arayuz2.add(pcnesne0_0);
        Arayuz2.add(pcnesne1_1);
        Arayuz2.add(pcnesne2_2);
        Arayuz2.add(pcnesne3_3);
        Arayuz2.add(pcnesne4_4);
        Arayuz2.add(pc2nesne0);
        Arayuz2.add(pc2nesne1);
        Arayuz2.add(pc2nesne2);
        Arayuz2.add(pc2nesne3);
        Arayuz2.add(pc2nesne4);
        Arayuz2.add(pc2nesne0_0);
        Arayuz2.add(pc2nesne1_1);
        Arayuz2.add(pc2nesne2_2);
        Arayuz2.add(pc2nesne3_3);
        Arayuz2.add(pc2nesne4_4);
        Arayuz2.add(devam);
        Arayuz2.add(devam2);
        Arayuz3.add(sonuc);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int) tk.getScreenSize().getWidth();
        int ySize = (int) tk.getScreenSize().getWidth();
        Arayuz2.setSize(xSize, ySize);
        Arayuz3.setSize(500, 300);
        Arayuz3.setLayout(null);
        Arayuz2.setLayout(null);
        Arayuz.setLayout(null);
        Arayuz.setVisible(true);

    }

}
