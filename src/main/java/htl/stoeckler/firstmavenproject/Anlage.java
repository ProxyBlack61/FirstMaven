package htl.stoeckler.firstmavenproject;

/**
 * @author Kilian Stoeckler
 */
public class Anlage {

    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
    }

    public double jahresAfa(){
        return anschaffungswert/nutzungsdauer;
    }
    
    public void updateBuchwert(int jahreGenutzt){
        buchwert-= jahresAfa()*jahreGenutzt;
    }

    public double getBuchwert() {
        return buchwert;
    }
    
    
}
