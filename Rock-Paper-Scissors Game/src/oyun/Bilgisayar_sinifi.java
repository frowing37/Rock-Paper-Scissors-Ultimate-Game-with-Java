package oyun;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar_sinifi extends Oyuncu {

    int t = 0, m = 0, k = 0;

    public Bilgisayar_sinifi() {

    }

    public Bilgisayar_sinifi(long oyuncuID, String oyuncuAdi, double skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public int nesneSec(ArrayList nesneListesi1, ArrayList nesneListesi2) {

        for (int i = 0; i < 5; i++) {
            int secim = new Random().nextInt(8);
            nesneListesi1.add(nesneListesi2.get(secim));
        }

        for (int i = 0; i < nesneListesi1.size(); i++) {
            for (int j = i + 1; j < nesneListesi1.size(); j++) {
                if (nesneListesi1.get(i) == nesneListesi1.get(j)) {
                    return 2;
                }

            }

        }

        /*for (int i = 0; i < nesneListesi1.size(); i++) {

            if (nesneListesi2.get(i).getClass().toString().contains("Ta")) {
                t++;
            }

            if (nesneListesi2.get(i).getClass().toString().contains("Ka")) {
                k++;
            }

            if (nesneListesi2.get(i).getClass().toString().contains("Ma")) {
                m++;
            }
        }

        if (t == 0 || m == 0 || k == 0) {
            t = 0;
            k = 0;
            m = 0;
            System.out.println(t+" "+k+" "+m);
            return 0;
        } else {
            return 1;
        }
*/   return 1;
    }
}
