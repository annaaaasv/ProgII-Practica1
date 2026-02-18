package prog2.model;

public class Camping implements InCamping{
    private String nom;

    public Camping(String nom){ //constructor
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

}
