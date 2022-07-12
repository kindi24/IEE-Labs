package E10;

// 1.β2
public class SUV extends Epivatiko implements EktosDromou{
    private static String kinisi;

    public SUV(String arK, String m, int etK, int t, String k) {
        super(arK, m, etK, t);
        kinisi = k;
    }

    public static String getKinisi(){
        return kinisi;
    }

    // 1.γ
    public static void seDrastiriotita(){
        System.out.println("Το όχημα είναι " +SUV.class.getName()+" με κίνηση " +getKinisi()+ " και κινείται " +
                "σε περιοχή εκτός δρόμου");
    }

    // Άσκηση 5
    public static void rymoulkei(Rymoulkomeno r) {
        r.rymoulkeitaiApo(this.getClass().getName());
    }

    @Override
    public String toString(){
        return super.toString() + " Κίνηση: " + kinisi;
    }

    public String getArKykloforias(){
        return super.getArKykloforias();
    }
}
