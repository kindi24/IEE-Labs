package E09;

public class Hlektrikos extends Kinitiras {
    private int kWh;

    public Hlektrikos(int i, int kWh) {
        super(i, "Ηλεκτρικός");
        this.kWh = kWh;
    }

    // 2.B1
    public static void seLeitourgia(){
        Kinitiras.seLeitourgia();
    }

    public static float katanalwnei(int sxesi, int ap){
        return 0;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
