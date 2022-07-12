package E08;

 class Epivatiko extends Oxima{
    private static int thyres;

    public Epivatiko(String arK, String m, int etK, int t) {
        super(arK, m, etK);
        thyres = t;
    }

    public int getThyres(){
        return thyres;
    }

    @Override
    public String toString(){
        return super.toString() + " Θύρες: " + thyres;
    }
}