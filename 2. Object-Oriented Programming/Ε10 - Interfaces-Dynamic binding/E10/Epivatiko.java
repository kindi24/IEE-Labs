package E10;

public class Epivatiko extends Oxima {
    private static int thyres;

    public Epivatiko(String arK, String m, int etK, int t) {
        super(arK, m, etK);
        thyres = t;
    }

    public static int getThyres(){
        return thyres;
    }

    public String getArKykloforias(){
       return super.getArKykloforias();
    }

    @Override
    public String toString(){
        return super.toString() + " Θύρες: " + thyres;
    }
}
