package E02;

public class Askisi2 {
    public static void main (String[] args){
        // a)
        int[] numbers = {10, 90, 35, 23, 86};

        // b)
        System.out.println("\n*** Εμφάνιση τιμών του πίνακα ***");
        // 1ος τρόπος
        for( int i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i]);
        }
        System.out.println( "\n");

        // 2ος τρόπος
        for (int element : numbers) {
            System.out.print( element + " ,  ");
        }
        System.out.println( "\n");

        // c)
        System.out.println("\n*** Εμφάνιση άρτιων τιμών του πίνακα ***");
        for( int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) System.out.println(numbers[i]);
        }

        // d)
        System.out.println("\nΜήκος πίνακα: "+numbers.length);

        // e)
        int sum = 0;
        for( int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\nΣυνολικό άθροισμα: "+sum);

        // f)
        int min = numbers[0];
        int max = numbers[0];
        for( int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("\nΜικρότερο στοιχείο: "+min);
        System.out.println("Μεγαλύτερο στοιχείο: "+max);

    }
}
