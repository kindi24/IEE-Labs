package E09;

public class EswterikisKausis extends Kinitiras {
    private int kyvismos;

    public EswterikisKausis(int i, int k) {
        super(i,"Εσωτερικής καύσης");
        kyvismos = k;
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