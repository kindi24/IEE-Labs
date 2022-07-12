package E08;

public class Hybrid extends Kinitiras  {

    private EswterikisKausis eswKausis;
    private Hlektrikos hlektrikos;

    public Hybrid(EswterikisKausis eswKin, Hlektrikos hleKin) {
        super(0, "Hybrid");
        this.eswKausis = eswKin;
        this.hlektrikos = hleKin;
    }
}