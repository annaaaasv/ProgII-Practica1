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
    /** {@inheritDoc} */
    @Override
    public String getNom() {
        return nom;
    }
    /** {@inheritDoc} */
    @Override
    public String getId() {
        return idAllotjament;
    }
    /** {@inheritDoc} */
    @Override
    public void setNom(String nom){
        this.nom = nom;
    }
    /** {@inheritDoc} */
    @Override
    public void setId(String idAllotjament) {
        this.idAllotjament = idAllotjament;
    }
    /** {@inheritDoc} */
    @Override
    public long getEstadaMinima(Temp temp) {
        if(temp == Temp.BAIXA)
            return estadaMinimaBAIXA;
        else
            return estadaMinimaALTA;
    }
    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public abstract boolean correcteFuncionament();

}

