
package oyun;

import java.util.Random;
import java.util.ArrayList;

public abstract class Oyuncu 
{
 
    private long oyuncuID=new Random().nextLong(99999999)+10000000;
    private String oyuncuAdi;
    private double skor;
  
    
    public Oyuncu()
    {
        
    }
    
    public Oyuncu(long oyuncuID,String oyuncuAdi,double skor)
    {
        this.oyuncuID=oyuncuID;
        this.oyuncuAdi=oyuncuAdi;
        this.skor=skor;
    }
    
    public void SkorGoster()
    {
        
    }
    
    
    public int nesneSec(ArrayList nesneListesi1,Object e)
    {
         
        return 0;
         
    }

    /**
     * @return the oyuncuID
     */
    public long getOyuncuID() {
        return oyuncuID;
    }

    /**
     * @param oyuncuID the oyuncuID to set
     */
    public void setOyuncuID(long oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    /**
     * @return the oyuncuAdi
     */
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    /**
     * @param oyuncuAdi the oyuncuAdi to set
     */
    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    /**
     * @return the skor
     */
    public double getSkor() {
        return skor;
    }

    /**
     * @param skor the skor to set
     */
    public void setSkor(double skor) {
        this.skor = skor;
    }
    
    
    
}
