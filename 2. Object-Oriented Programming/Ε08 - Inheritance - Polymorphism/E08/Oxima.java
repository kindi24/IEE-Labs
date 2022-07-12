package E08;

public abstract class Oxima {
    private static String arKykloforias, montelo;
    private static int etosKykloforias;

    public Oxima(String arK, String m, int etK){
        arKykloforias = arK;
        montelo = m;
        etosKykloforias = etK;
    }

    public Oxima(){}

    // Άσκηση 5
    // 5α
    private static Kinitiras kinitiras;
    // 5β
    public static void setKinitiras(Kinitiras k){
        kinitiras = k;
    }

    public Kinitiras getKinitiras(){return kinitiras;}

    public boolean VazeiMpros(){
        return true;
    }

    public String getArKykloforias(){
        return arKykloforias;
    }

    public String toString(){
        return "Αριθμός κυκλοφορίας: " + arKykloforias + " Μοντέλο: " + montelo + " Έτος κυκλοφορίας: " + etosKykloforias;
    }
}