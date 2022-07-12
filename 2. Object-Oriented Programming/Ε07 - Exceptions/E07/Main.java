package E07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws LathosHmerominia, LathosArithmos, LathosEmail {

        Scanner scK = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        Scanner scH = new Scanner(System.in);
        Scanner scE = new Scanner(System.in);

        // Άσκηση 1
        Foititis[] pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(18, "Πολυκάρπου Κλέων", "6987459023", "2541034571",(float)(Math.random() * 11));
        pinFoitites[1] = new Foititis(18, "Γεωργίου Αριστέα","6977420681", "2591039687",(float)(Math.random() * 11));
        pinFoitites[2] = new Foititis(18, "Πετρίδου Δανάη"," ", " ",(float)(Math.random() * 11));
        pinFoitites[3] = new Foititis(18, "Χατζημιχάλης Βασίλειος","6933090166", "2551041270",(float)(Math.random() * 11));
        pinFoitites[4] = new Foititis(18, "Πασχαλίδου Πελαγία","6901402995", "2310673092",(float)(Math.random() * 11));
        pinFoitites[5] = new Foititis(18, "Παπαδόπουλος Νικόλαος","6933840992", "2531076190",(float)(Math.random() * 11));
        pinFoitites[6] = new Foititis(18, "Γεωργιάδης Σταύρος","6944092911", "2521089461",(float)(Math.random() * 11));
        pinFoitites[7] = new Foititis(18, "Αλεξανδρίδης Ιωάννης","6933671944", "2310039849",(float)(Math.random() * 11));
        pinFoitites[8] = new Foititis(18, "Χρηστίδης Χρήστος","6901987022", "2541056723",(float)(Math.random() * 11));
        pinFoitites[9] = new Foititis(18, "Παπαντωνίου Αναξίμανδρος","6977239628", "2591043543",(float)(Math.random() * 11));

        System.out.println("Λίστα φοιτητών");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

        // Άσκηση 2
        System.out.print("\nΔώσε τον αριθμό κινητού τηλεφώνου του 3ου φοιτητή: ");
        String kin = scK.nextLine();
        char first = kin.charAt(0);
        if (!onlyDigits(kin, kin.length())) throw new LathosArithmos("Δεν είναι σωστός ο αριθμός που εισάχθηκε");
        if (first == '6' && kin.length() == 10) pinFoitites[2].setKinito(kin);
        else throw new LathosArithmos("Δεν είναι σωστός ο αριθμός που εισάχθηκε");

        System.out.print("\nΔώσε τον αριθμό σταθερού τηλεφώνου του 3ου φοιτητή: ");
        String stath = scS.nextLine();
        first = stath.charAt(0);
        if (!onlyDigits(stath, stath.length())) throw new LathosArithmos("Δεν είναι σωστός ο αριθμός που εισάχθηκε");
        if (first == '2' && stath.length() == 10) pinFoitites[2].setStathero(stath);
        else throw new LathosArithmos("Δεν είναι σωστός ο αριθμός που εισάχθηκε");

        // Άσκηση 3
        System.out.print("\nΔώσε την ημερομηνία γέννησης του 3ου φοιτητή (ΗΗ/ΜΜ/YYYY): ");
        String hmer = scH.nextLine();

        String[] h = new String[5];
        h[0] = hmer.substring(0,1);
        h[1] = hmer.substring(3,4);
        h[2] = hmer.substring(6,9);

        char[] c = new char[2];
        c[0] = hmer.charAt(2);
        c[1] = hmer.charAt(5);

        int ilikia = Integer.parseInt(h[2]);
        ilikia = 2021 - ilikia;

        if ((onlyDigits(h[0], h[0].length()) || onlyDigits(h[1], h[1].length()) || onlyDigits(h[2], h[2].length()))) {
            if (c[0] == '/' || c[1] == '/') {
                if (ilikia >= 18) pinFoitites[2].setHmeromGennisis(inHmeromGennisis(hmer));
                else throw new LathosHmerominia("Η ηλικία είναι κάτω από το 18");
            }
            else throw new LathosHmerominia("Δεν είναι σωστή η ημερομηνία που εισάχθηκε");
        }
        else throw new LathosHmerominia("Δεν είναι σωστή η ημερομηνία που εισάχθηκε");

        // Άσκηση 4
        System.out.print("\nΔώσε το email του 3ου φοιτητή: ");
        String email = scE.nextLine();
        String[] mail = new String[3];
        mail[0] = email.substring(0,2);
        mail[1] = email.substring(3,9);
        mail[2] = email.substring(10,20);

        // Tο if είναι πάντα false
        if (mail[0].equals("iee")){
            if (onlyDigits(mail[1], mail[1].length())){
                if (mail[2].matches("@iee.ihu.gr")) pinFoitites[2].setEmail(email);
                else throw new LathosEmail("Δεν είναι σωστό το email που εισάχθηκε");
            }
            else throw new LathosEmail("Δεν είναι σωστό το email που εισάχθηκε");
        }
        else throw new LathosEmail("Δεν είναι σωστό το email που εισάχθηκε");

    }

    public static void emfanisiFoititwn(Foititis[] pinFoitites) {
        for (Foititis i : pinFoitites) {
            System.out.println(i);
        }
    }

    public static boolean onlyDigits(String str, int n) {

        for (int i = 0; i < n; i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) return false;
        }
        return true;
    }

    public static Date inHmeromGennisis(String H){
        Date date = convertStrToDate(H);
        return date;
    }

    private static Date convertStrToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return hmerom;
    }

}
