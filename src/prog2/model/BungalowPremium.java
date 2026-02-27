package prog2.model;

public class BungalowPremium extends Bungalow{
    private boolean serveisExtra;
    private String codiWIfi;
    //cal posar els atributs aquí?
    //això s'ha fet automàtic, estâ bé??? què volia dir super
    public BungalowPremium(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
    }
}
