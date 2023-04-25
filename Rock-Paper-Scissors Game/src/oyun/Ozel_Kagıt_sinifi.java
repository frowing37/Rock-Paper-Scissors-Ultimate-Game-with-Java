
package oyun;


public class Ozel_Kagıt_sinifi extends Kagit_sinifi
{
   private double kalinlik;
   
   public Ozel_Kagıt_sinifi()
   {
       
   }
   
   public Ozel_Kagıt_sinifi(double nufuz,double kalinlik,char cins)
   {
       super(nufuz,cins);
       this.kalinlik=kalinlik;
   }
   
   
    @Override
    public int nesnePuaniGoster()
    {
        return super.getSeviyePuani();
    }
    
    @Override
    public double etkiHesapla(double deger1,char cins1,double deger2,char cins2)
    {
        double tas_o=0,kagit_o=0,makas_o=0;
        double sonuc1=0;
        double sonuc = 0;
        
        if(cins1=='t')
        {
            tas_o=deger1;
            
            if(cins2=='k')
            {
             kagit_o=deger2;
             sonuc1=((0.2*makas_o)+(0.8*kagit_o));
            //return sonuc=tas_o/sonuc1;
            return 1.25;
            }
            
            if(cins2=='m')
            {
                makas_o=deger2;
                sonuc1 =((0.8*kagit_o)+(0.2*makas_o));
            //return sonuc= tas_o/sonuc1;
            return 5;
            }
        }
        
        
        if(cins1=='k')
        {
            kagit_o=deger1;
            
            if(cins2=='t')
            {
                tas_o=deger2;
                sonuc1=((0.8*makas_o)+(0.2*tas_o));
            //return sonuc=kagit_o/sonuc1;
            return 5;
            }
            
            if(cins2=='m')
            {
                makas_o=deger2;
                sonuc1=((0.2*tas_o)+(0.8*makas_o));
            //return sonuc= kagit_o/sonuc1;
            return 1.25;
            }
        }
        
        if(cins1=='m')
        {
            makas_o=deger1;
            
            if(cins2=='t')
            {
                tas_o=deger2;
                sonuc1=((0.8*tas_o)+(0.2*kagit_o));
            //return sonuc= makas_o/sonuc1;
            return 1.25;
            }
            
            if(cins2=='k')
            {
                kagit_o=deger2;
                 sonuc1=((0.8*tas_o)+(0.2*kagit_o));
            //return sonuc=makas_o/sonuc1;
            return 5;
            }
            
        }
        return 0;
    }
    
    public double durumGuncelle(double dayaniklilik,double etki)
    {
        double sonuc=dayaniklilik-=etki;
        return sonuc;
    }    

    @Override
    public double ozellik2()
    {
        double nufuz1= Ozel_Kagıt_sinifi.super.getNufuz();
        
        return nufuz1*this.kalinlik; 
    }
    
    
    /**
     * @return the kalinlik
     */
    public double getKalinlik() {
        return kalinlik;
    }

    /**
     * @param kalinlik the kalinlik to set
     */
    public void setKalinlik(double kalinlik) {
        this.kalinlik = kalinlik;
    }
    
}
