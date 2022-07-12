package E01;

public class Main {
    public static void main(String[] args) {
            // Άσκηση 4
            Foititis f1 = new Foititis("20177", 2020, "Πολυκάρπου Κλέων");


            // Άσκηση 5
            System.out.println(f1.getAM() + " " + f1.getOnomatEpwnymo());

            // Άσκηση 6
            Foititis[] pinFoitites = new Foititis[10];
            pinFoitites[0] = new Foititis("20001", "Πολυκάρπου Κλέων", hmeromGennisis("10/10/1999"));
            pinFoitites[1] = new Foititis("20002", "Γεωργίου Αριστέα", hmeromGennisis("2/5/1998"));
            pinFoitites[2] = new Foititis("20005", "Πετρίδου Δανάη", hmeromGennisis(""));

            for (int i = 0; i < 3; i++){
                System.out.println(pinFoitites[i].getAM() +" "+ pinFoitites[i].getOnomatEpwnymo()+" "+pinFoitites[i].getDate());
            }
    }

    private static String hmeromGennisis(String s) {
        return s;
    }
}
