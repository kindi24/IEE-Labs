package E02;

public class Askisi1 {
    public static void main (String[] args){
        // a)
        String strName = "Περιφέρεια Κεντρικής Μακεδονίας";

        //b)
        System.out.println("Μήκος συμβολοσειράς: "+strName.length());

        //c)
        System.out.println("\n*** Παράδειγμα με charAt ***");
        for (int i=0; i<strName.length(); i++){
            System.out.print(strName.charAt(i)+ " ");
        }
        System.out.print("\n");

        //d)
        for (int i=0; i<strName.length(); i++){
            System.out.println(strName.charAt(i));
        }

        // e)
        System.out.println("\n*** Παράδειγμα με toCharArray ***");
        char[] chars = strName.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.print("\n");

        // f)
        System.out.println("\n***Διαχωρισμός λέξεων συμβολοσειράς ***");
        String[] arrayOfStr = strName.split(" ");
        for (String lexi: arrayOfStr) {
            System.out.println(lexi);
        }
        System.out.print("\n");

        for (String lexi: arrayOfStr) {
            System.out.print(lexi+ " ");
        }
        System.out.print("\n");

        // g)
        System.out.println("\n***Συμβολοσειρά μετά από συνένωση λέξεων ***");
        String arktikolexo="";
        for (String lexi: arrayOfStr){
            arktikolexo += lexi.substring(0, 2) + ".";
        }
        System.out.println(arktikolexo);

        // h)
        System.out.println("\n***Συμβολοσειρά μετά από ανταλλαγή λέξεων ***");

        // i)
        System.out.println("\n*** Παράδειγμα με την contains ***");
        System.out.println(strName.contains("ικής"));
    }
}
