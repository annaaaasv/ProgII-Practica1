package prog2.model;

public class Parcela extends Allotjament{
    private float metres;
    private boolean connexioElectrica;

    public Parcela(String nom, String idAllotjament, float metres, boolean connexioElectrica){
        super(nom, idAllotjament);
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }

    @Override
    public boolean correcteFuncionament(){
        return connexioElectrica;
    }

    @Override
    public String toString(){
        return super.toString() + ", Parcela{mida= " + metres + ", connexió elèctrica= " + connexioElectrica + "}";
    }

}
