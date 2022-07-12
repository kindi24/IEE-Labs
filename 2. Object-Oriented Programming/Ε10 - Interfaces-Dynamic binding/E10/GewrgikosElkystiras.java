package E10;

// 1.β2
public class GewrgikosElkystiras extends Oxima implements EktosDromou{

    public GewrgikosElkystiras(String arK, String m, int etK) {
        super(arK, m, etK);
    }

    // 1.δ1
    public static void seDrastiriotita(){
        System.out.println("Το όχημα είναι " + GewrgikosElkystiras.class.getName()+" με κίνηση 2x4 " +orgwnei());
    }

    // Άσκηση 5
    public static void rymoulkei(Rymoulkomeno r) {
        r.rymoulkeitaiApo(this.getClass().getName());
    }

    // 1.δ2
    public static String orgwnei(){
        return "και οργώνει σε αγρό";
    }

    public String toString(){
        return super.toString();
    }

    public String getArKykloforias(){
        return super.getArKykloforias();
    }

}
