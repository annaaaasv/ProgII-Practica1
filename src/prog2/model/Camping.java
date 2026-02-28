package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

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
    public void afegirClient(String nom_, String dni_) {
        Client nou = new Client(nom_, dni_);
        llistaClients.add(nou);
    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela nou = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow nou = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium nou = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping nou = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome nou = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones,terrassaBarbacoa);
        llistaAllotjaments.add(nou);
    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        //falta
    }

    @Override
    public int calculAllotjamentsOperatius() {
        int comptador = 0;

        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        while(it.hasNext()) {
            Allotjament a = it.next();
            if(a.correcteFuncionament()) {
                comptador++;
            }
        }
        return comptador;
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
