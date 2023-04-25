
package oyun;

public class Makas_sinifi extends Nesne_sinifi 
{
  private double keskinlik;
  
  public Makas_sinifi()
  {
      
  }
  
  public Makas_sinifi(double keskinlik,char cins)
  {
      super(cins);
      this.keskinlik=keskinlik;
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
     * @return the keskinlik
     */
    public double getKeskinlik() {
        return keskinlik;
    }

    /**
     * @param keskinlik the keskinlik to set
     */
    public void setKeskinlik(double keskinlik) {
        this.keskinlik = keskinlik;
    }
  
}
