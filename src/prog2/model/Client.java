package prog2.model;

public class Client implements InClient{
    private String nom;
    private String dni; //9 caràcters

    public Client(String nom, String dni){ //constructor
        this.nom = nom;
        this.dni = dni;
    }

    @Override //què és això, cal posar-ho?
    public String getNom(){
        return nom;
    }
    @Override
    public String getDni(){
        return dni;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    //falta implementar el mètode toString, per mostrarClient?????
}
