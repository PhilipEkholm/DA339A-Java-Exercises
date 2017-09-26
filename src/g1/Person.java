package g1;
// Symboliserar varje person i vår grupp.
public class Person {
    //Vi initierar alla attribut som vi behöver för att få programmet att fungera. 
    private String namn="", beskrivning="", sysselsattning="", bild="";
    private int alder=0, Xriktning=0, Yriktning=0, Xstart=0, Ystart=0;
    
    //Vår konstruktör som sätter alla attribut. 
    Person(String parNamn, String parBeskrivning, String parSysselsattning, String parBild, int parAlder, 
    		int parXriktning, int parYriktning, int parXstart, int parYstart)
    {
        namn=parNamn;
        beskrivning=parBeskrivning;
        sysselsattning=parSysselsattning;
        bild=parBild;
        alder=parAlder;
        Xriktning=parXriktning; 
        Yriktning=parYriktning;
        Xstart=parXstart; 
        Ystart=parYstart;
    }
    
    //Hämtar attributen
    public String getNamn()
    {
        return namn;
    }
    
    public String getBeskrivning()
    {
        return beskrivning;
    }
    public String getBild()
    {
        return bild;
    }
    public String getSysselsattning()
    {
        return sysselsattning;
    }
    public int getAlder()
    {
        return alder;
    }
    public int getXriktning()
    {
        return Xriktning;
    }
    public int getYriktning()
    {
        return Yriktning;
    }
    public int getXstart()
    {
        return Xstart;
    }
    public int getYstart()
    {
        return Ystart;
    }
    public void setNamn(String parNamn)
    {
        namn=parNamn;
    }
    
    public void setBeskrivning(String parBeskrivning)
    {
        beskrivning=parBeskrivning;
    }
    public void setSysselsattning(String parSysselsattning)
    {
        sysselsattning=parSysselsattning;
    }
    public void setBildPath(String bildPath)
    {
        bild=bildPath;
    }
    
    public void setAlder(int parAlder)
    {
        alder=parAlder;
    }


}



