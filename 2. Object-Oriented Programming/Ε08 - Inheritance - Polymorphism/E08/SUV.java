package E08;

public class SUV extends Epivatiko{
    private static String kinisi;

    public SUV(String arK, String m, int etK, int t, String k) {
        super(arK, m, etK, t);
        kinisi = k;
    }

    public String getKinisi(){
        return kinisi;
    }

    @Override
    public String toString(){
        return super.toString() + " Κίνηση: " + kinisi;
    }
}