package E07;

import java.text.DecimalFormat;
import java.util.Date;

public class Foititis {

        private int etos, am;
        private String onomatEpwnymo, AM, number, stath,email;
        private float vathmos;
        private Date hmeromGennisis;

        static int AA = 0;

        public Foititis(int e, String n, String num, String s, float v) {
            AA++;
            DecimalFormat mf = new DecimalFormat("0000");
            String tempAA = mf.format(AA);
            this.AM = (e + tempAA);
            etos = e;
            onomatEpwnymo = n;
            number = num;
            stath = s;
            v /= Math.pow(10, (int) Math.log10(v));
            v = ((int) (v * 10)) / 10.0f;
            vathmos = v;
        }

        public void setKinito(String k){
            this.number = k;
        }

        public void setStathero(String s){
            this.stath = s;
        }

        public void setHmeromGennisis(Date d){
        this.hmeromGennisis = d;
    }

        public void setEmail(String e){this.email = e;}

        public String toString() { return (AM + " " + onomatEpwnymo + " " +number+ " " +stath+ " "+vathmos); }
}
