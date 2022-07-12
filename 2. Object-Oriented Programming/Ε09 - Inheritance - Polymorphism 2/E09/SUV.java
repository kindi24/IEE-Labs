package E09;

public class SUV extends Epivatiko {
    private static String kinisi;

    public SUV(String arK, String m, int etK, int t, String k) {
        super(arK, m, etK, t);
        kinisi = k;
    }

    // 2.A1
    public static void VazeiMpros(){
        Epivatiko.VazeiMpros();
    }

    public static String getKinisi(){
        return kinisi;
    }

    @Override
    public String toString(){
        return super.toString() + " Κίνηση: " + kinisi;
    }
}
