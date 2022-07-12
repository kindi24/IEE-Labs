package E10;

public abstract class Oxima {
    private static String arKykloforias, montelo;
    private static int etosKykloforias;
    private static int sxesiTaxytitas;

    public Oxima(String arK, String m, int etK){
        arKykloforias = arK;
        montelo = m;
        etosKykloforias = etK;
    }

    public String getArKykloforias(){
        return arKykloforias;
    }

    public String toString(){
        return "Αριθμός κυκλοφορίας: " + arKykloforias + " Μοντέλο: " + montelo + " Έτος κυκλοφορίας: " + etosKykloforias;
    }
}
