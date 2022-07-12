package E09;

public abstract class Kinitiras{
    private static int ippodynami;
    private static String eidos;
    protected static float metrisiKatanalwsis;
    private static Kinitiras kinitiras;

    public Kinitiras(int i, String e){
        ippodynami = i;
        eidos = e;
    }

    // 2.B1
    public static void seLeitourgia(){
        // 2.B2
        System.out.print(" με κινητήρα "+kinitiras.toString()+" μπήκε σε λειτουργία");
    }

    // 2.Γ5
    public static float katanalwnei(int sxesi, int ap){
        switch (sxesi){
            case 1: metrisiKatanalwsis = (float) (0.12 * ap * ippodynami);
            break;

            case 2: metrisiKatanalwsis = (float) (0.1 * ap * ippodynami);
            break;

            case 3: metrisiKatanalwsis = (float) (0.08 * ap * ippodynami);
            break;

            case 4: metrisiKatanalwsis = (float) (0.06 * ap * ippodynami);
            break;

            case 5: metrisiKatanalwsis = (float) (0.04 * ap * ippodynami);
            break;

            default: metrisiKatanalwsis = (float) 0.05 * ap * ippodynami;
            break;
        }
        return metrisiKatanalwsis;
    }

    public static void setKinitiras(Kinitiras k){
        kinitiras = k;
    }

    public static String getEidos(){return eidos;}

    public static int getIppodynami(){return ippodynami;}

    @Override
    public String toString(){
        return "" +getEidos();
    }
}
