package prog2.model;


public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String idAllotjament;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    public Allotjament(String nom, String idAllotjament, long estadaMinimaALTA, long estadaMinimaBAIXA){
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getId() {
        return idAllotjament;
    }

    @Override
    public void setNom(String nom){
        this.nom = nom;
    }

    @Override
    public void setId(String idAllotjament) {
        this.idAllotjament = idAllotjament;
    }

    @Override
    public long getEstadaMinima(Temp temp) {
        if(temp == Temp.BAIXA)
            return estadaMinimaBAIXA;
        else
            return estadaMinimaALTA;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        estadaMinimaALTA = estadaMinimaALTA_;
        estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

    @Override
    public String toString(){
        return "Nom=" + nom + ", Id=" + idAllotjament+ ", estada mínima en temp ALTA: " + estadaMinimaALTA +
                ", estada mínima en temp BAIXA: " + estadaMinimaBAIXA + ".";
    }


    //mètode que s'implementa a cada subclasse
    public abstract boolean correcteFuncionament();

}

