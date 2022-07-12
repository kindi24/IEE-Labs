package E08;

public class Main {
    public static void main (String[] args){

        // Άσκηση 2
        Oxima[] pinOximata = new Oxima[4];
        pinOximata[0] = new Epivatiko("CAC1755", "Toyota Yaris", 2014, 3);
        pinOximata[1] = new GewrgikosElkystiras("DAD1209", "Belarus", 2017);
        pinOximata[2] = new SUV("FAF2341", "Seat PURPA", 2020, 5, "4X4");
        pinOximata[3] = new Epivatiko("RAR1372", "Fiat Panda", 2015, 5);

        // Άσκηση 3
        System.out.println("Οχήματα");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < pinOximata.length; i++) {
            System.out.println(pinOximata[i]);
        }
        System.out.println();

        // Άσκηση 4
        // 4α
        Kinitiras[] pinKinitiras = new Kinitiras[4];
        // 4β
        pinKinitiras[0] = new EswterikisKausis(110, 1400);
        // 4γ
        pinKinitiras[1] = new EswterikisKausis(350, 2500);
        // 4δ
        pinKinitiras[2] = new Hlektrikos(180, 80);
        // 4ε
        pinKinitiras[3] = new Hybrid(new EswterikisKausis(50, 600), new Hlektrikos(80, 40));

        // 5γ
        for (int i = 0; i < pinKinitiras.length; i++){
            Oxima.setKinitiras(pinKinitiras[i]);
        }

        // 5δ
        for (int i = 0; i < pinKinitiras.length; i++){
            pinKinitiras[i] = null;
        }

        // Άσκηση 6
        System.out.println("Οχήματα και κινητήρες");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < pinKinitiras.length; i++){
            if(pinOximata[i] instanceof Epivatiko ){
                System.out.println("Αριθμός κυκλοφορίας: "+pinOximata[i].getArKykloforias() + " Θύρες: " + ((Epivatiko) pinOximata[i]).getThyres() + pinOximata[i].getKinitiras());
            }
            else if(pinOximata[i] instanceof SUV){
                System.out.println("Αριθμός κυκλοφορίας: " + "Κίνηση: " + ((SUV)pinOximata[i]).getKinisi() + pinOximata[i].getKinitiras());
            }
            else{
                System.out.println("Αριθμός κυκλοφορίας: " + pinOximata[i].getArKykloforias() + pinOximata[i].getKinitiras());
            }

        }

    }

}