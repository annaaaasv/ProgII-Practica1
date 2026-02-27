package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping{
    private String nom;
    private LlistaReserves llistaReserves;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;

    public Camping(String nom){ //constructor
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return llistaReserves;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return llistaAllotjaments;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return llistaClients;
    }

    @Override
    public int getNumAllotjaments() {
        return llistaAllotjaments.size();
    }

    @Override
    public int getNumReserves() {
        return llistaReserves.getNumReserves();
    }

    @Override
    public int getNumClients() {
        return llistaClients.size();
    }

    //quin puto nom els hi poso als nous objectes
    @Override
    public void afegirClient(String nom_, String dni_) { //està bé? No sé quin nom posar-li
        Client nou = new Client(nom_, dni_);
        llistaClients.add(nou); //això està bé?
    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) { //sha de crear i afegir parcela no?
        Parcela nou = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {

    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {

    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {

    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {
        return null;
    }

    public static InAllotjament.Temp getTemporada(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        //falta
        return null;
    }
}
