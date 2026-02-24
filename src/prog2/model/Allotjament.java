package prog2.model;
import java.time.chrono.*;

public class Allotjament implements InAllotjament{
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

    @Override
    public long getEstadaMinima(Temp temp) {
        return 0;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}

