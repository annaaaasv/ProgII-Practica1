package prog2.model;

public class Bungalow extends Casa {
    private String nom;
    private String idAllotjament;
    private String mida;
    private int habitacions;
    private int placesPersones;
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow(String nom, String idAllotjament, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesParquing = placesParquing;
        this.placesPersones = placesPersones;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }



}
