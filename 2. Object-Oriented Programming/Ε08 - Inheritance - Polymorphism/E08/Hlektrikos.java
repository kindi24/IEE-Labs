package E08;

public class Hlektrikos extends Kinitiras{
    private int kWh;

    public Hlektrikos(int i, int kWh) {
        super(i, "Ηλεκτρικός");
        this.kWh = kWh;
    }

    @Override
    public String toString(){
        return super.toString() + " kWh: " +kWh;
    }
}