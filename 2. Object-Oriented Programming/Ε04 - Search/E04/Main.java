package E04;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Main {
    public static void main (String[] args){
        int epilogi;
        Scanner scan = new Scanner(System.in);
        // Ασκηση 3
        // 3.1
        Foititis[] pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(18, "Πολυκάρπου Κλέων");
        pinFoitites[1] = new Foititis(18, "Γεωργίου Αριστέα");
        pinFoitites[2] = new Foititis(18, "Πετρίδου Δανάη");
        pinFoitites[3] = new Foititis(18, "Χατζημιχάλης Βασίλειος");
        pinFoitites[4] = new Foititis(18, "Πασχαλίδου Πελαγία");
        pinFoitites[5] = new Foititis(18, "Παπαδόπουλος Νικόλαος");
        pinFoitites[6] = new Foititis(18, "Γεωργιάδης Σταύρος");
        pinFoitites[7] = new Foititis(18, "Αλεξανδρίδης Ιωάννης");
        pinFoitites[8] = new Foititis(18, "Χρηστίδης Χρήστος");
        pinFoitites[9] = new Foititis(18, "Παπαντωνίου Αναξίμανδρος");

        // 3.2
        emfanisiFoititwn(pinFoitites);

        // Άσκηση 4
        // 4.1
        System.out.println("\n=== Εισαγωγή ημερ/νιών γέννησης φοιτητών ===");

        // 4.2
        for (int i=0; i< pinFoitites.length; i++ ){
            // 4.3
            if (i == 5 || i == 6 || i == 7)  inHmeromGennisis();
            else {
                // 4.5
                pinFoitites[i].setHmeromGennisis(inHmeromGennisis());
            }
        }

        // Άσκηση 5
        do{
            System.out.println("\nΕΠΙΛΟΓΕΣ (---------------------)");
            System.out.println("1) Αναζήτηση με Επώνυμο ");
            System.out.println("2) Αναζήτηση με Ημερ/νία γέννησης ");

            // Άσκηση 6
            System.out.println("3)  Αναζήτηση με ΑΜ (δυαδική) ");

            System.out.println("0) Εξοδος ");

            System.out.print("\nΔώσε την επιλογή σου: ");
            epilogi = Integer.parseInt(scan.nextLine());

            // 5.2
            switch(epilogi) {
                case 1: {
                    anazitisiMeEpwnymo(pinFoitites);
                    break;  }
                case 2:
                    anazitisiMeEtosGen(pinFoitites);
                    break;
                // Άσκηση 6
                case 3: {
                    anazitisiMeAM(pinFoitites);
                    break;
                }
                case 4:{
                    System.out.println("Dwse am gia anadromikh diadikh anazhthsh :");
                    Scanner ab = new Scanner(System.in);
                    int scannedAM = ab.nextInt();
                    recusriveAnazitishMeAM(pinFoitites, 0, pinFoitites.length, scannedAM);
                }
                case 0:{
                    System.out.println("\nΤέλος προγράμματος");
                    break;
                }
                default:{
                    System.out.println("\nΛάθος επιλογή");
                }
            }
        }while (epilogi != 0);

    }

    // 3.2
    public static void emfanisiFoititwn(Foititis[] pinFoitites) {
        for (Foititis i : pinFoitites) {
            System.out.println(i);
        }
    }

    // 4.4
    public static Date  inHmeromGennisis(){
        System.out.print("Δώσε το έτος γέννησης του φοιτητή (ΗΗ/ΜΜ/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        Date date = convertStrToDate(d);
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

    // 5.3
    public static void anazitisiMeEpwnymo(Foititis[] pinFoitites) {
        System.out.print("Δώσε το ονοματεπώνυμο: ");
        Scanner sc = new Scanner(System.in, "utf8");
        String keyName = sc.nextLine();

        int thesi = -1;

        for (int i = 0; i< pinFoitites.length; i++ ){
            if (keyName.equals(pinFoitites[i].getOnomatEpwnymo(keyName))){
                thesi = i;
                break;
            }
        }

        if (thesi == -1) System.out.println("Δεν βρέθηκε φοιτητής με αυτό το ονοματεπώνυμο");
        else System.out.println(pinFoitites[thesi]);

    }

    public static void anazitisiMeEtosGen(Foititis[] pinFoitites) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Δώσε το έτος γέννησης του φοιτητή: ");
        int keyEtosGen = Integer.parseInt(scan.nextLine());
        int thesi = -1;
        for (int i=0; i< pinFoitites.length; i++ ){

        }

        if (thesi == -1) System.out.println("Ο φοιτητής με αυτήν την ημερομ. γέννησης δεν βρέθηκε");
        else System.out.println(pinFoitites[thesi]);
    }

    // Άσκηση 6
    public static void anazitisiMeAM(Foititis[] pinFoitites) {
        System.out.print("Δώσε το ΑΜ του φοιτητή: ");
        Scanner scan1 = new Scanner(System.in);
        int scan = scan1.nextInt();

        int start = 18001;
        int thesiS = 0;
        int end = 18010;
        int thesiE = 9;
        int mid = (start + end)/2;
        int thesiM = (thesiS + thesiE)/2;
        int thesi = -1;

        do{

            if (scan < mid){
                end = mid - 1;
                thesiE = thesiM - 1;
                mid = (start + end)/2;
                thesiM = (thesiS + thesiE)/2;
            }
            else if (scan > mid){
                start = mid + 1;
                thesiS = thesiM + 1;
                mid = (start + end)/2;
                thesiM = (thesiS + thesiE)/2;
            }
            else{
                thesi = thesiM;
                break;
            }

        } while (start <= end);

        if (thesi == -1) System.out.println("Ο φοιτητής με αυτό το ΑΜ δεν βρέθηκε");
        else System.out.println(pinFoitites[thesi]);

    }

    //askhsh 7
    public static int recusriveAnazitishMeAM(Foititis[] f, int l, int r, int x){
        if (r >= l && l < f.length - 1){

            int mid = l + (r - l) / 2;

            if (f[mid].getAM() == x) return mid;
            if (f[mid].getAM() > x) return recusriveAnazitishMeAM(f, l, mid - 1, x);

            return recusriveAnazitishMeAM(f, mid + 1, r, x);
        }

        return -1;
    }

}

