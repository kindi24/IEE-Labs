package E10;

// 1.β1
public class Rymoulkomeno {
    private int varos;

    public Rymoulkomeno(int v){
        varos = v;
    }

    // Άσκηση 5
    public void rymoulkeitaiApo(Oxima o){
        System.out.println("Το ρυμουλκόμενο " +this.getClass().getName()+ " ρυμουλκείται από το όχημα " +o+
                " με αρ. κυκλοφορίας " +o.getArKykloforias());
    }

}
