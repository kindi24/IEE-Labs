package E09;

public class Hybrid extends Kinitiras {

    private EswterikisKausis eswKausis;
    private Hlektrikos hlektrikos;

    public Hybrid(EswterikisKausis eswKin, Hlektrikos hleKin) {
        super(0, "Hybrid");
        this.eswKausis = eswKin;
        this.hlektrikos = hleKin;
    }

    public static float katanalwnei(int sxesi, int ap){
        return 0;
    }

    // 2.B1
    public static void seLeitourgia(){
        Kinitiras.seLeitourgia();
    }
}
