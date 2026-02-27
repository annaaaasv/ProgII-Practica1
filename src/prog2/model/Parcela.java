package prog2.model;

public class Parcela extends Allotjament{
    private String nom;
    private String idAllotjament;
    private float metres;
    private boolean connexioElectrica;

    public Parcela(String nom, String idAllotjament, float metres, boolean connexioElectrica){
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }




}
