package E09;

public class Epivatiko extends Oxima {
    private static int thyres;

    public Epivatiko(String arK, String m, int etK, int t) {
        super(arK, m, etK);
        thyres = t;
    }

    // 2.A1
    public static void VazeiMpros(){
        Oxima.VazeiMpros();
    }

    public static int getThyres(){
        return thyres;
    }

    @Override
    public String toString(){
        return super.toString() + " Θύρες: " + thyres;
    }
}