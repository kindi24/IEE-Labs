package E10;

public class Main {

    public static void main (String[] args){

        Oxima[] pinOximata = new Oxima[4];
        pinOximata[0] = new Epivatiko("CAC1755", "Toyota Yaris", 2014, 3);
        pinOximata[1] = new GewrgikosElkystiras("DAD1209", "Belarus", 2017);
        pinOximata[2] = new SUV("FAF2341", "Seat PURPA", 2020, 5, "4X4");
        pinOximata[3] = new Epivatiko("RAR1372", "Fiat Panda", 2015, 5);

        // Άσκηση 2
        // Άσκηση 3
        for (int i = 0; i < pinOximata.length; i++){
            if (pinOximata[i].getClass().getName().equals("SUV")){
                SUV.seDrastiriotita();
            }
            else if (pinOximata[i].getClass().getName().equals("GewrgikosElkystiras")){
                GewrgikosElkystiras.seDrastiriotita();
            }
        }

        // Άσκηση 4
        // 4α
        Rymoulkomeno[] pinRymoulk = new Rymoulkomeno[2];
        pinRymoulk[0] = new Arotro(2100);
        pinRymoulk[1] = new Karotsa(3500, 1400);

        for (int i = 0; i < pinOximata.length; i++){
            // 4β
            if (!pinOximata[i].getClass().getName().equals("Epivatiko")) System.out.println(pinOximata[i]);

            if (pinOximata[i].getClass().getName().equals("SUV")){
                SUV.rymoulkei(pinRymoulk[0]);
            }
            else if (pinOximata[i].getClass().getName().equals("GewrgikosElkystiras")){
                GewrgikosElkystiras.rymoulkei(pinRymoulk[1]);
            }
        }

    }
}
