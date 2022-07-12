package E05;

public class Main {
    public static void main (String[] args){
        // Άσκηση 2
        // 2.1
        Foititis[] pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(18, "Πολυκάρπου Κλέων", "6987459023",(float)(Math.random() * 11));
        pinFoitites[1] = new Foititis(18, "Γεωργίου Αριστέα","6977420681",(float)(Math.random() * 11));
        pinFoitites[2] = new Foititis(18, "Πετρίδου Δανάη","6943482067",(float)(Math.random() * 11));
        pinFoitites[3] = new Foititis(18, "Χατζημιχάλης Βασίλειος","6933090166",(float)(Math.random() * 11));
        pinFoitites[4] = new Foititis(18, "Πασχαλίδου Πελαγία","6901402995",(float)(Math.random() * 11));
        pinFoitites[5] = new Foititis(18, "Παπαδόπουλος Νικόλαος","6933840992",(float)(Math.random() * 11));
        pinFoitites[6] = new Foititis(18, "Γεωργιάδης Σταύρος","6944092911",(float)(Math.random() * 11));
        pinFoitites[7] = new Foititis(18, "Αλεξανδρίδης Ιωάννης","6933671944",(float)(Math.random() * 11));
        pinFoitites[8] = new Foititis(18, "Χρηστίδης Χρήστος","6901987022",(float)(Math.random() * 11));
        pinFoitites[9] = new Foititis(18, "Παπαντωνίου Αναξίμανδρος","6977239628",(float)(Math.random() * 11));

        System.out.println("Λίστα φοιτητών");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

        TaxinomisiMethods.Bubblesort(pinFoitites);
        System.out.println("\nΤαξινόμηση με βάση το ονομ.");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

        TaxinomisiMethods.Insertionsort(pinFoitites);
        System.out.println("\nΤαξινόμηση με βάση το κινητό");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

        TaxinomisiMethods.Selectionsort(pinFoitites);
        System.out.println("\nΤαξινόμηση με βάση τον ΜΟ");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

    }

    public static void emfanisiFoititwn(Foititis[] pinFoitites) {
        for (Foititis i : pinFoitites) {
            System.out.println(i);
        }
    }

}
