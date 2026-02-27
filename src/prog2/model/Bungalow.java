package prog2.model;

public class Bungalow extends Casa {
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow(String nom, String idAllotjament, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

        super(nom, idAllotjament, mida, habitacions, placesPersones);

        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

}
