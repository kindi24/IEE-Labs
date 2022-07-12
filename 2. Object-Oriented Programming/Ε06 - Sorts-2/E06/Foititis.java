package E06;

import java.text.DecimalFormat;

public class Foititis {
    private int etos, am;
    private String onomatEpwnymo, AM, number;
    private float vathmos;


    static int AA = 0;
    public Foititis(int e, String n, String num, float v){
        AA++;
        DecimalFormat mf = new DecimalFormat("0000");
        String tempAA = mf.format(AA);
        this.AM= (e + tempAA);
        etos = e;
        onomatEpwnymo = n;
        number = num;
        v /= Math.pow(10, (int) Math.log10(v));
        v = ((int) (v * 10)) / 10.0f;
        vathmos = v;
    }

    public String getOnomatEpwnymo() {
        return this.onomatEpwnymo;
    }

    public int getEtosEisag() {
        return this.etos;
    }

    public String toString() { return (AM + " " + onomatEpwnymo + " " +number+ " "+vathmos); }
}
