package E08;

public abstract class Kinitiras{
    private static int ippodynami;
    private static String eidos;

    public Kinitiras(int i, String e){
        ippodynami = i;
        eidos = e;
    }

    public static String getName(){return eidos;}

    public static int getIppodynami(){return ippodynami;}

    @Override
    public String toString(){
        return " Είδος κινητήρα: " + this.getClass().getName() + " Ιπποδύναμη: " + ippodynami;
    }
}
