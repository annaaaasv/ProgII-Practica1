package prog2.model;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class BungalowPremium extends Bungalow{
    private boolean serveisExtra;
    private String codiWIfi;

    public BungalowPremium(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWIfi) {

        super(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);

        this.serveisExtra = serveisExtra;
        this.codiWIfi = codiWIfi;
    }
}
