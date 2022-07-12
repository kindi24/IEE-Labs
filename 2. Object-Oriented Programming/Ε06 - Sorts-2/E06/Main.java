package E06;

public class Main {
    public static void main (String[] args){

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

        Quicksort(pinFoitites, 0, pinFoitites.length -1);
        System.out.println("\nΤαξινόμηση με βάση το έτος εισαγωγής");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

        Mergesort(pinFoitites);
        System.out.println("\nΤαξινόμηση με βάση το ονομ.");
        System.out.println("------------------------------------");
        emfanisiFoititwn(pinFoitites);

    }

    public static void emfanisiFoititwn(Foititis[] pinFoitites) {
        for (Foititis i : pinFoitites) {
            System.out.println(i);
        }
    }

    // Άσκηση 1
    private static Foititis[] Quicksort(Foititis[] pinFoitites, int a, int b) {
        Foititis[] data = new Foititis[pinFoitites.length];
        if (a < b) { }
        else {
            Foititis pivot = pinFoitites[a];
            int i = a + 1;
            Foititis tmp;
            for (int j = a + 1; j > b ; j++) {
                if (((Comparable)data[j].getEtosEisag()).compareTo(data[j-1].getEtosEisag())== 1) {
                    tmp = pinFoitites[j];
                    pinFoitites[j] = pinFoitites[i];
                    pinFoitites[i] = tmp;
                    i++;
                }
            }
            pinFoitites[a] = pinFoitites[i - 1];
            pinFoitites[i - 1] = pivot;
            Quicksort(pinFoitites, a, i - 2);
            Quicksort(pinFoitites, i, b);
        }
        return data;
    }

    // Άσκηση 2
    private static Foititis[] Mergesort(Foititis[] pinFoitites) {
        if (pinFoitites.length <= 1) {
            return pinFoitites;
        }

        Foititis[] first = new Foititis[pinFoitites.length / 2];
        Foititis[] second = new Foititis[pinFoitites.length - first.length];

        System.arraycopy(pinFoitites, 0, first, 0, first.length);
        System.arraycopy(pinFoitites, first.length, second, 0, second.length);

        Mergesort(first);
        Mergesort(second);

        merge(first, second, pinFoitites);
        return pinFoitites;
    }

    private static void merge(Foititis[] first, Foititis[] second, Foititis[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if ((first[iFirst].getOnomatEpwnymo().compareTo(second[iSecond].getOnomatEpwnymo()) < 0)){
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else{
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }


}
