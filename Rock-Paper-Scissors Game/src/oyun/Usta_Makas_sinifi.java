
package oyun;


public class Usta_Makas_sinifi extends Makas_sinifi
{
  private double hiz;
  
  public Usta_Makas_sinifi()
  {
      
  }
  
  public Usta_Makas_sinifi(double keskinlik,double hiz,char cins)
  {
      super(keskinlik,cins);
      this.hiz=hiz;
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
        
        
        /*if(cins1=='t' && cins2=='m')
        {
            tas_o=deger1;
            makas_o=deger2;
            kagit_o=0;
            sonuc1 =(float) ((0.8*kagit_o)+(0.2*makas_o));
            sonuc= tas_o/sonuc1;
            //sonuc=(float) 1.25;
        }
        
        if(cins1=='m' && cins2=='t')
        {
            tas_o=deger2;
            makas_o=deger1;
            kagit_o=0;
            sonuc1= (float) ((0.8*tas_o)+(0.2*kagit_o));
            sonuc= makas_o/sonuc1;
            //sonuc=(float) 1.25;
        }
        
        if(cins1=='k' && cins2=='m')
        {
            kagit_o=deger1;
            makas_o=deger2;
            tas_o=0;
            sonuc1= (float) ((0.2*tas_o)+(0.8*makas_o));
            sonuc= kagit_o/sonuc1;
            //sonuc= (float) 1.25;
        }
        
        if(cins1=='m' && cins2=='k')
        {
            kagit_o=deger2;
            makas_o=deger1;
            tas_o=0;
            sonuc1= (float) ((0.8*tas_o)+(0.2*kagit_o));
            sonuc=makas_o/sonuc1;
            //sonuc= (float) 5;
        }
        
        if(cins1=='t' && cins2=='k')
        {
            tas_o=deger1;
            kagit_o=deger2;
            makas_o=0;
            sonuc1=(float) ((0.2*makas_o)+(0.8*kagit_o));
            sonuc=tas_o/sonuc1;
            //sonuc= (float) 1.25;
        }
        
        if(cins1=='k' && cins2=='t')
        {
            tas_o=deger2;
            kagit_o=deger1;
            makas_o=0;
            sonuc1= (float) ((0.8*makas_o)+(0.2*tas_o));
            sonuc=kagit_o/sonuc1;
        }
        
        System.out.println("etki"+sonuc);*/
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
        double keskinlik1= Usta_Makas_sinifi.super.getKeskinlik();
        
        return keskinlik1*this.hiz;
    }
    
    /**
     * @return the hiz
     */
    public double getHiz() {
        return hiz;
    }

    /**
     * @param hiz the hiz to set
     */
    public void setHiz(double hiz) {
        this.hiz = hiz;
    }
  
}
