package prog2.model;

public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String id;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    public Allotjament(){ //constructor

    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setNom(String nom){
        this.nom = nom;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    //falten els mètodes que depenen del tipus d'allotjament que no sé com fer-ho
}

