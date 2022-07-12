package E01;

public class Foititis {
    // Άσκηση 3
    private String AM;
    private String onomatEpwnymo;
    private int etosEisagwgis;
    private String date;

    // Άσκηση 4
    public Foititis(String AM, int etosEisagwgis, String onomatEpwnymo) {
        this.AM = AM;
        this.onomatEpwnymo = onomatEpwnymo;
    }

    // Άσκηση 6
    public Foititis(String AM, String onomatEpwnymo, String date) {
        this.AM = AM;
        this.onomatEpwnymo = onomatEpwnymo;
        this.date = date;
    }


    public String getAM() {
        return AM;
    }

    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    public String getDate() {
        return date;
    }

}
