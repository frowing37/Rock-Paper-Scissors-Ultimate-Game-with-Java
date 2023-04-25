
package oyun;

public class Tas_sinifi extends Nesne_sinifi
{
    private double katilik;
    
    public Tas_sinifi()
    {
        
    }
            
    public Tas_sinifi(double katilik,char cins)
    {
        super(cins);
        this.katilik=katilik;
    }
    
    @Override
    public int nesnePuaniGoster()
    {
        
        return super.getSeviyePuani();
    }
    
    @Override
    public double etkiHesapla(double deger,char cins1,double deger2,char cins2)
    {
        
        return deger;
    }
    
    public double durumGuncelle(double dayaniklilik,double etki)
    {
        double sonuc=dayaniklilik-=etki;
        return sonuc;
    }
    
    @Override
    public double ozellik1()
    {
        
        return this.katilik;
    }

    /**
     * @return the katilik
     */
    public double getKatilik() {
        return katilik;
    }

    /**
     * @param katilik the katilik to set
     */
    public void setKatilik(double katilik) {
        this.katilik = katilik;
    }
    
    
    
}
