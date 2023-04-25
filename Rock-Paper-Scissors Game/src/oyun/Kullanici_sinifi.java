package oyun;

import java.util.ArrayList;

public class Kullanici_sinifi extends Oyuncu {

    int t = 0, k = 0, m = 0;

    public Kullanici_sinifi() {

    }

    public Kullanici_sinifi(long oyuncuID, String oyuncuAdi, double skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    /*
    @Override
    public int nesneSec(ArrayList nesneListesi1) {

        for (int i = 0; i < nesneListesi1.size(); i++) {

            String kes = (String) nesneListesi1.get(i);

            if ("Tas1".equals(nesneListesi1.get(i))) {
                t1++;
                if (t1 == 2) {
                    t1=0;
                    return 2;
                }
            }
            if ("Tas2".equals(nesneListesi1.get(i))) {
                t2++;
                if (t2 == 2) {
                    t2=0;
                    return 2;
                }
            }
            if ("Tas3".equals(nesneListesi1.get(i))) {
                t3++;
                if (t3 == 2) {
                    t3=0;
                    return 2;
                }
            }
            if ("Kagit1".equals(nesneListesi1.get(i))) {
                k1++;
                if (k1 == 2) {
                    k1=0;
                    return 2;
                }
            }
            if ("Kagit2".equals(nesneListesi1.get(i))) {
                k2++;
                if (k2 == 2) {
                    k2=0;
                    return 2;
                }
            }
            if ("Kagit3".equals(nesneListesi1.get(i))) {
                k3++;
                if (k3 == 2) {
                    k3=0;
                    return 2;
                }
            }
            if ("Makas1".equals(nesneListesi1.get(i))) {
                m1++;
                if (m1 == 2) {
                    m1=0;
                    return 2;
                }
            }
            if ("Makas2".equals(nesneListesi1.get(i))) {
                m2++;
                if (m2 == 2) {
                    m2=0;
                    return 2;
                }
            }
            if ("Makas3".equals(nesneListesi1.get(i))) {
                m3++;
                if (m3 == 2) {
                    m3=0;
                    return 2;
                }
            }

            if (kes.contains("Tas")) {
                t++;
            }

            if (kes.contains("Kagit")) {
                k++;
            }

            if (kes.contains("Makas")) {
                m++;
            }

        }

        if (t == 0 || k == 0 || m == 0) {
            return 0;
        }

        return 1;
    }
     */
    @Override
    public int nesneSec(ArrayList nesneListesi1, Object e) {
        nesneListesi1.add(e);

        if (nesneListesi1.size() == 5) {
            for (int i = 0; i < nesneListesi1.size(); i++) {

                if (nesneListesi1.get(i).toString().contains("Tas")) {
                    t++;
                }

                if (nesneListesi1.get(i).toString().contains("Kag")) {
                    k++;
                }

                if (nesneListesi1.get(i).toString().contains("Makas")) {
                    m++;
                }

            }

            if (t == 0 || m == 0 || k == 0) {
                t = 0;
                m = 0;
                k = 0;
                return 0;
            } else {
                return 1;
            }

        }
        return 2;
    }

}
