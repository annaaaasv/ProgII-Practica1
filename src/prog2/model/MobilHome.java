package prog2.model;

public class MobilHome extends Casa{
    /*String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
    boolean terrassaBarbacoa
    */

    private String nom;
    private String idAllotjament;
    //no continuo perque potser si els poso a casa no cal tornarlos a posar aqui
    //els especifics siii que shan de posar I guess
    private boolean terrassaBarbacoa;

    public MobilHome(String nom, String idAllotjament, String mida, int habitacions, int placesPersones,
                     boolean terrassaBarbacoa){
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida; //he afegit aquest atribut a casa però si el posava private em deia error i posat public em surt bé
        //amb els altres tmb sha de fer però ho deixo així de moment pq no se si està bé
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.terrassaBarbacoa = terrassaBarbacoa;

    }





}
