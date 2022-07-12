
import java.io.Serializable;


public class Kinitiras implements Serializable{
    
    private int ippodynami;
    private float katanalwsi;
    
    public Kinitiras (int ippodynami, float katanalwsi) {
        this.ippodynami = ippodynami;
        this.katanalwsi = 0;
    }
    
    public String toString() {
        return ("hp: " + ippodynami + " Κατανάλωση: " + katanalwsi);
    }
    
}
