package E04;

import java.text.DecimalFormat;
import java.util.Date;

public class Foititis {

    int etos;
    int am;
    Date hmeromGennisis;
    String name, onomatEpwnymo, AM;

    // Άσκηση 1
    public Date hmeromGennisis(){
        return this.hmeromGennisis;
    }

    // Άσκηση 2
    //2.1
    static int AA = 0;

    public Foititis(int e, String n){
        // 2.2
        AA++;
        DecimalFormat mf = new DecimalFormat("0000");
        String tempAA = mf.format(AA);
        // 2.3
        this.AM= (e + tempAA);
        etos = e;
        onomatEpwnymo = n;
    }

    // 4.5
    /*public static Date setHmeromGennisis(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            System.out.println(ex);
        }
        return hmerom;
    }
    */

    public void setHmeromGennisis(Date d){
        this.hmeromGennisis = d;
    }


    public int getAM() {
        return Integer.parseInt(AM);
    }

    public String getOnomatEpwnymo(String onomatEpwnymo) {
        return onomatEpwnymo;
    }

    public int getEtosEisagwgis(int etosEisagwgis){
        return etosEisagwgis;
    }

    public String toString() { return (AM + " " + onomatEpwnymo + " "); }

}
