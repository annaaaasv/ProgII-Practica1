package prog2.model;

public class Parcela extends Allotjament{
    private float metres;
    private boolean connexioElectrica;

    public Parcela(String nom, String idAllotjament, float metres, boolean connexioElectrica){
        super(nom, idAllotjament, 2, 4);
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }

    public float getMida(){
        return metres;
    }
    public void setMida(float metres){
        this.metres = metres;
    }
    public boolean isConnexioElectrica(){
        return connexioElectrica;
    }
    public void setConnexioElectrica(boolean connexioElectrica){
        this.connexioElectrica = connexioElectrica;
    }

    @Override
    public boolean correcteFuncionament(){
        return connexioElectrica;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
