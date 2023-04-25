
package oyun;

public class Kagit_sinifi extends Nesne_sinifi
{
    private double nufuz;
    
    public Kagit_sinifi()
    {
        
    }
   
    public Kagit_sinifi(double nufuz,char cins)
    {
        super(cins);
        this.nufuz=nufuz;
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

    /**
     * @return the nufuz
     */
    public double getNufuz() {
        return nufuz;
    }

    /**
     * @param nufuz the nufuz to set
     */
    public void setNufuz(double nufuz) {
        this.nufuz = nufuz;
    }
    
}
