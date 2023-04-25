
package oyun;

public class Agir_Tas_sinifi extends Tas_sinifi 
{
    private double sicaklik;
    
    public  Agir_Tas_sinifi()
    {           
        
    }
    
    public Agir_Tas_sinifi(double katilik,double sicaklik,char cins)
    {
        super(katilik,cins);
        this.sicaklik=sicaklik;
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
        double sonuc1 = 0;
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
        double katilik1= Agir_Tas_sinifi.super.getKatilik();
             
        return katilik1*this.sicaklik;
    }
    
    
    /**
     * @return the sicaklik
     */
    public double getSicaklik() {
        return sicaklik;
    }

    /**
     * @param sicaklik the sicaklik to set
     */
    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }
    
    
}
