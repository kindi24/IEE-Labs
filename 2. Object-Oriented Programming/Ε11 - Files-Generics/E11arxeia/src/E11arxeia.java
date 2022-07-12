
import java.io.*;

public class E11arxeia {

    public static void main(String[] args) {

        try {
            Oxima [] pinOximata = new Oxima[4];
            pinOximata[0] = new Epivatiko("ΝΖΤ1755", "Toyota Yaris", 2014, 3, new Kinitiras(105, 0.7f));
            pinOximata[1] = new Epivatiko("ΝKP3563", "FIAT", 2016, 5, new Kinitiras(110, 0.6f));
            pinOximata[2] = new Epivatiko("ΝZO2987", "Nissan Micra", 2012, 4, new Kinitiras(120, 0.8f));
            pinOximata[3] = new Epivatiko("PPE4521", "Honda CH-R", 2017, 5, new Kinitiras(150, 0.9f));

            // write object to file
            FileOutputStream fOut = new FileOutputStream("Oximata.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            for(int i=0; i<pinOximata.length; i++) {
                objOut.writeObject(pinOximata[i]);
                objOut.flush();
            }
            objOut.close();

            // read object from file
            FileInputStream fInput = new FileInputStream("Oximata.ser");
            ObjectInputStream objInput = new ObjectInputStream(fInput);
            Object obj = null;
            while ((obj = objInput.readObject()) != null) {
                Epivatiko epivatiko = (Epivatiko) obj;
                System.out.println(epivatiko);
            }
            objInput.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace(); }
        catch (IOException e) {
            System.out.println("EOF");	
            //e.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}