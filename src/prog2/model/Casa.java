package prog2.model;

public abstract class Casa extends Allotjament { //casa és abstracta???
    //tots els atributs comuns de tots els tipus de casa????
    private String nom;
    private String idAllotjament;
    private String mida;
    private int habitacions;
    private int placesPersones;

    public Casa(String nom, String idAllotjament, String mida, int habitacions, int placesPersones){
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    //fer super aqui??? esque perque hi ha aquest metode a Allotjament i a Casa?
    @Override
    public long getEstadaMinima(Temp temp) {
        return 0;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    //no va aqui aquest mètode va a Allotjament crec
    @Override
    public boolean correcteFuncionament() {
        //posar un switch segons la casa??? o molts ifs? o ns
        return false;
    }


//toString i correcteFuncionament suposo que son metodes que es defineixen aqui i despres simplementen a cada subclasse o que

    @Override
    public String toString() { //EM DEIA QUE ESTAVA MALAMENT he clicat una cosa i ara em surt bé
        System.out.println("Nom= " + nom + ", Id= " + idAllotjament + ", estada mínima en temp ALTA: " + estadaMinimaALTA +
                "estada mínima en temp BAIXA: " + getEstadaMinima(temp)); //van els getters es estadaminima o els atributs? té més sentit q vagin els getters potser
        //pero que poso dins del getter?
        return null;
    }
}
