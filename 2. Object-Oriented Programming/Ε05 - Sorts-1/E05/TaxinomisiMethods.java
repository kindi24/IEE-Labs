package E05;

public class TaxinomisiMethods {

    // Άσκηση 4
    public static void Bubblesort(Foititis[] pinFoitites) {
        Foititis temp;
        for (int i = 1; i < pinFoitites.length; i++) {
            for (int j = 0; j < pinFoitites.length - i; j++) {
                if (pinFoitites[j].getOnomatEpwnymo().compareTo(pinFoitites[j+1].getOnomatEpwnymo()) > 0) {
                    temp = pinFoitites[j];
                    pinFoitites[j] = pinFoitites[j+1];
                    pinFoitites[j+1] = temp;
                }
            }

        }
    }

    // Άσκηση 5
    public static void Insertionsort(Foititis[] pinFoitites) {
        int minIndex;
        for (int i = 1; i < pinFoitites.length; ++i) {
            Foititis nextItem = pinFoitites[i];
            minIndex = i;
            while ((minIndex > 0) && (pinFoitites[minIndex-1].getNumber().compareTo(nextItem.getNumber()) > 0)) {
                pinFoitites[minIndex] = pinFoitites[minIndex-1];
                minIndex--;
            }
            pinFoitites[minIndex] = nextItem;
        }
    }

    // Άσκηση 6
    public static void Selectionsort(Foititis[] pinFoitites) {
        Foititis temp;
        int minIndex;
        for (int i = 0; i < pinFoitites.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < pinFoitites.length; j++) {
                if (((Comparable) pinFoitites[j].getVathmos()).compareTo(pinFoitites[minIndex].getVathmos()) < 0)
                    minIndex = j;
                if (i != minIndex) {
                    temp = pinFoitites[i];
                    pinFoitites[i] = pinFoitites[minIndex];
                    pinFoitites[minIndex] = temp;
                }
            }
        }
    }
}
