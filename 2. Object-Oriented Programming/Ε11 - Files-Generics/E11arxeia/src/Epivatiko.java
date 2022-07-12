


public class Epivatiko extends Oxima {
    
    private int thyres;
        
    public Epivatiko (String arKykloforias, String montelo, int etosKykloforias, 
            int thyres, Kinitiras kinitiras) {
        super(arKykloforias, montelo, etosKykloforias, kinitiras);
        this.thyres = thyres;
    }
    
    public int getArThyrwn() {
        return thyres;
    }
    
    public String toString() {       
        return (super.toString() + " " + thyres + "Θυρo");
    }
    
}
