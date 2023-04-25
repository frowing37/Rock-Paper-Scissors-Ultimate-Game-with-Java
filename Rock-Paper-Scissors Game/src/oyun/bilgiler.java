
package oyun;


public class bilgiler {
    private int maxRound;
    private int round=0;
    private double oyuncu1skor=0;
    private double oyuncu2skor=0;

    /**
     * @return the round
     */
    public int getRound() {
        return round;
    }

    /**
     * @param round the round to set
     */
    public void setRound(int round) {
        this.round += round;
    }

    /**
     * @return the oyuncu1
     */
    public double getOyuncu1() {
        return oyuncu1skor;
    }

    /**
     * @param oyuncu1 the oyuncu1 to set
     */
    public void setOyuncu1(double oyuncu1) {
        this.oyuncu1skor += oyuncu1;
    }

    /**
     * @return the oyuncu2
     */
    public double getOyuncu2() {
        return oyuncu2skor;
    }

    /**
     * @param oyuncu2 the oyuncu2 to set
     */
    public void setOyuncu2(double oyuncu2) {
        this.oyuncu2skor += oyuncu2;
    }

    /**
     * @return the maxRound
     */
    public int getMaxRound() {
        return maxRound;
    }

    /**
     * @param maxRound the maxRound to set
     */
    public void setMaxRound(int maxRound) {
        this.maxRound = maxRound;
    }
    
    
}
