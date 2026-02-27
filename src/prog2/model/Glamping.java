package prog2.model;

public class Glamping extends Casa{

    private String material;
    private boolean casaMascota;


    public Glamping(String nom, String idAllotjament, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){

        super(nom, idAllotjament, mida, habitacions, placesPersones);

        this.material = material;
        this.casaMascota = casaMascota;

    }
}
