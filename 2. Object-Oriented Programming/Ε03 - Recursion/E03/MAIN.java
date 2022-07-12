package E03;
import java.util.Scanner;
public class MAIN {
    public static void main (String[] args){
        // Άσκηση 1
        int number, epilogi, x;
        boolean First;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("\nΕΠΙΛΟΓΕΣ (---------------------)");
            System.out.println("1. Παραγοντικό ");
            System.out.println("2. Ακολουθία Fibonacci ");
            System.out.println("3. Παλίνδρομος ");
            System.out.println("4. Πρώτοι αριθμοί ");
            System.out.println("5. Πύργοι του Ανόϊ ");
            System.out.println("0. Εξοδος \n");


            System.out.print("Δώσε την επιλογή σου: ");
            epilogi = Integer.parseInt(scan.nextLine());

            if (epilogi > 5 || epilogi < 0) {
                System.out.println("Έδωσες λάθος επιλογή");
            }

            else if (epilogi != 0) {
                System.out.print("Δώσε έναν αριθμό: ");
                number = Integer.parseInt(scan.nextLine());

                // Στα σχόλια είναι ο 2ος τρόπος κλήσης των παρακάτω μεθόδων

                if (epilogi == 1) {
                    System.out.println("\nΠαραγοντικό (---------------------)");
                    x = par(number);
                    // x = AnadromiMethods.par(number);

                    System.out.println(number+"! = "+x);

                } else if (epilogi == 2) {
                    System.out.println("\nΑκολουθία Fibonacci (---------------------)");
                    x = fibo(number);
                    // x = AnadromiMethods.fibo(number);

                    System.out.println("Συνολικό άθροισμα: "+x);

                } else if (epilogi == 3) {
                    System.out.println("\nΠαλίνδρομος (---------------------)");
                    x = pal(number, 0);
                    // x = AnadromiMethods.pal(number, 0);

                    if (x == number) System.out.println("Το "+number+" είναι Παλίνδρομος");
                    else System.out.println("Το "+number+" δεν είναι Παλίνδρομος");

                } else if (epilogi == 4) {
                    System.out.println("\nΠρώτοι αριθμοί (---------------------)");
                    First = firstnum(number, 2);
                    // First = AnadromiMethods.firstnum(number);

                    if (First) System.out.println("Το "+number+" είναι πρώτος αριθμός");
                    else System.out.println("Το "+number+" δεν είναι πρώτος αριθμός");

                } else {
                    System.out.println("\nΠύργοι του Ανόϊ (---------------------)");
                    x = Hanoi(number);
                    // x = AnadromiMethods.Hanoi(number);

                    System.out.println("Συνολικός αριθμός κινήσεων: "+x);
                }

            }

            else{
                System.out.println("\nΤέλος προγράμματος");
            }

        }while (epilogi != 0);

    }

    //Άσκηση 2

    public static int par(int n) {
        int sum = 1;
        if(n == 0) return sum;
        else sum = n * par(n - 1);

        return sum;
    }

    public static int fibo(int n) {
        int sum = 1;
        if(n == 0 || n == 1) return sum;
        else sum =  fibo(n - 2) + fibo(n - 1);
        return sum;
    }

    public static int pal(int num, int rev) {
        if(num > 0){
            rev = (rev * 10) + (num % 10);
            rev = pal(num / 10, rev);
        }
        return rev;
    }

    public static boolean firstnum(int n, int i){
        boolean firstNum = true;
        if (i < n){
            if (n % i != 0) firstNum = firstnum(n, i + 1);
            else firstNum = false;
        }
        return firstNum;
    }

    public static int Hanoi(int n){
        int sum = 1;

        if (n == 1) return sum;
        else sum = 2 * Hanoi(n-1) + 1;

        return sum;
    }

}
