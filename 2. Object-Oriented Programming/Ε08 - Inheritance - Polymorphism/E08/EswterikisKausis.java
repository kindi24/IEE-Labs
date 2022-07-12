package E08;

public class EswterikisKausis extends Kinitiras{
    private int kyvismos;

    public EswterikisKausis(int i, int k) {
        super(i,"Εσωτερικής καύσης");
        kyvismos = k;
    }

    @Override
    public String toString(){
        return super.toString() + " Κυβισμός: " +kyvismos;
    }
}