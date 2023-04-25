
package oyun;


public abstract class Nesne_sinifi 
{
    private double dayaniklilik=20;
    private int seviyePuani=0;
    private char cins;
    
    
    public Nesne_sinifi()
    {
        
    }
    
    public Nesne_sinifi(char cins)
    {
        this.dayaniklilik=dayaniklilik;
        this.seviyePuani=seviyePuani;
        this.cins=cins;
    }
    
    public int nesnePuaniGoster()
    {
        return getSeviyePuani();
    }
    
    public double etkiHesapla(double deger,char cins1,double deger2,char cins2)
    {
        
        
        return 1;
    }
    
    public double durumGuncelle(double dayaniklilik,double etki)
    {     
        return 0;
    }
    
    public double ozellik1()
    {
        
         return 1;
    }
    
    public double ozellik2()
    {
        
         return 1;
    }

    /**
     * @return the dayaniklilik
     */
    public double getDayaniklilik() {
        return dayaniklilik;
    }

    /**
     * @param dayaniklilik the dayaniklilik to set
     */
    public void setDayaniklilik(double dayaniklilik1) {
        this.dayaniklilik = dayaniklilik1;
    }

    /**
     * @return the seviyePuani
     */
    public int getSeviyePuani() {
        return seviyePuani;
    }

    /**
     * @param seviyePuani the seviyePuani to set
     */
    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani += seviyePuani;
    }

    /**
     * @return the k
     */
    public char getCins() {
        return cins;
    }
    
    
    
}
