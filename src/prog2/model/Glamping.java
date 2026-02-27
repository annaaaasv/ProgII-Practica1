package prog2.model;

public class Glamping extends Casa{

    private String material;
    private boolean casaMascota;


    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.material = material;
        this.casaMascota = casaMascota;

    }
}
