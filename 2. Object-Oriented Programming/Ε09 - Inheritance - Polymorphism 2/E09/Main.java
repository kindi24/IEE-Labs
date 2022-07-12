package E09;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int epilogi;
        Scanner scan = new Scanner(System.in);

        Oxima[] pinOximata = new Oxima[4];
        pinOximata[0] = new Epivatiko("CAC1755", "Toyota Yaris", 2014, 3);
        pinOximata[1] = new GewrgikosElkystiras("DAD1209", "Belarus", 2017);
        pinOximata[2] = new SUV("FAF2341", "Seat PURPA", 2020, 5, "4X4");
        pinOximata[3] = new Epivatiko("RAR1372", "Fiat Panda", 2015, 5);

        Kinitiras[] pinKinitiras = new Kinitiras[4];
        pinKinitiras[0] = new EswterikisKausis(110, 1400);
        pinKinitiras[1] = new EswterikisKausis(350, 2500);
        pinKinitiras[2] = new Hlektrikos(180, 80);
        pinKinitiras[3] = new Hybrid(new EswterikisKausis(50, 600), new Hlektrikos(80, 40));

        // Άσκηση 3
        System.out.println("Οχήματα");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < pinOximata.length; i++) {
            System.out.println(pinOximata[i]);
        }
        System.out.println();

        // Άσκηση 3
        // 3A
        do{
            System.out.print("Δώσε την θέση του πίνακα: ");
            epilogi = scan.nextInt();
        } while (epilogi < 0 || epilogi > 3);
        Kinitiras.setKinitiras(pinKinitiras[epilogi]);

        // 3B
        Oxima.VazeiMpros();

        // Άσκηση 4
        Oxima.seKinisi(1000);
    }
}
