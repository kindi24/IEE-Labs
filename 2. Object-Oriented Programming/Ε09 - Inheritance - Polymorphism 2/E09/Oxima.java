package E09;

public abstract class Oxima {
    private static String arKykloforias, montelo;
    private static int etosKykloforias;
    private static int sxesiTaxytitas;

    public Oxima(String arK, String m, int etK){
        arKykloforias = arK;
        montelo = m;
        etosKykloforias = etK;
    }

    public static void VazeiMpros(){
        // 2.A2
        sxesiTaxytitas = 0;

        // 2.A3
        System.out.print("\nΤο όχημα με αριθμό κυκλοφορίας " + arKykloforias);

        // 2.A4
        Kinitiras.seLeitourgia();

    }


    public static void seKinisi(int ap){
        double sumSA = 0;
        double sumK = 0;
        int plSA = 0;
        int plK = 0;
        // 2.Γ2
        System.out.println("\nΤο όχημα με αριθμό κυκλοφορίας " + arKykloforias + " κινείται σε διαδρομή " +ap+ " χλμ");

        // 4.2
        sxesiTaxytitas = 1;
        do{
            if (sxesiTaxytitas > 0 || sxesiTaxytitas < 6) {
                // 2.Γ4
                int choice = (int) Math.ceil(Math.random() * 3 - 1);
                int apostasi = (sxesiTaxytitas * sxesiTaxytitas) * 10;
                sumSA += apostasi;
                plSA++;

                // 4.3
                ap -= apostasi;

                // 2.Γ5 & 4.4
                float katanalwsi = Kinitiras.katanalwnei(sxesiTaxytitas, apostasi);
                sumK += katanalwsi;
                plK++;

                System.out.println("\nΣχέση ταχύτητας: " + sxesiTaxytitas + " Απόσταση σχέσης: " + apostasi +
                        " Υπολόποιπο διαδρομής: " + ap + " Καταναλώνει(ls/kWh): " + katanalwsi);

                if (choice == 1) sxesiTaxytitas++;
                else sxesiTaxytitas--;
            }

        }while (sxesiTaxytitas > 0 && sxesiTaxytitas < 6);

        // Άσκηση 5
        // 5.1
        double MOSa = sumSA / plSA;
        System.out.println("\nΜέσος όρος σχέσης ταχύτητας κίνησης: " +MOSa);

        // 5.2
        double MOK = sumK / plK;
        System.out.println("\nΜέσος όρος κατανάλωσης: " +MOK);

    }

    public static void setArKykloforias(String ar){
        arKykloforias = ar;
    }

    public String toString(){
        return "Αριθμός κυκλοφορίας: " + arKykloforias + " Μοντέλο: " + montelo + " Έτος κυκλοφορίας: " + etosKykloforias;
    }
}
