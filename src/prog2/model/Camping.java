package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class Camping implements InCamping{
    private String nom;
    private LlistaReserves llistaReserves;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;

    public Camping(String nom){ //constructor
        this.nom = nom;
        this.llistaReserves = new LlistaReserves();
        this.llistaAllotjaments = new ArrayList<>();
        this.llistaClients = new ArrayList<>();
    }

    /** {@inheritDoc} */
    @Override
    public String getNom() {
        return nom;
    }
    /** {@inheritDoc} */
    @Override
    public LlistaReserves getLlistaReserves() {
        return llistaReserves;
    }
    /** {@inheritDoc} */
    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return llistaAllotjaments;
    }
    /** {@inheritDoc} */
    @Override
    public ArrayList<Client> getLlistaClients() {
        return llistaClients;
    }
    /** {@inheritDoc} */
    @Override
    public int getNumAllotjaments() {
        return llistaAllotjaments.size();
    }
    /** {@inheritDoc} */
    @Override
    public int getNumReserves() {
        return llistaReserves.getNumReserves();
    }
    /** {@inheritDoc} */
    @Override
    public int getNumClients() {
        return llistaClients.size();
    }
    /** {@inheritDoc} */
    @Override
    public void afegirClient(String nom_, String dni_) {
        Client nou = new Client(nom_, dni_);
        llistaClients.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela nou = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow nou = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium nou = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping nou = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome nou = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones,terrassaBarbacoa);
        llistaAllotjaments.add(nou);
    }
    /** {@inheritDoc} */
    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Allotjament allotjament = buscarAllotjament(id_);
        Client client = buscarClient(dni_);
        llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
    }
    /** {@inheritDoc} */
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
    /** {@inheritDoc} */
    @Override
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {

        Iterator<Allotjament> it = llistaAllotjaments.iterator();

        Allotjament millor = null;

        while(it.hasNext()){
            Allotjament a = it.next();
            if(millor == null ||
                    a.getEstadaMinima(temp) < millor.getEstadaMinima(temp)){
                millor = a;
            }
        }

        return millor;
    }

    //Obté la temporada en la qual es troba una data
    public static InAllotjament.Temp getTemporada(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        if ((mes > 3 && mes < 9) ||
                (mes == 3 && dia >= 21) ||
                (mes == 9 && dia <= 20)) {
            return InAllotjament.Temp.ALTA;
        }
        return InAllotjament.Temp.BAIXA;
    }

    //Comprova si un allotjament existeix i el retorna o llança una excepció
    public Allotjament buscarAllotjament(String idAllotjament) throws ExcepcioReserva{
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        while(it.hasNext()) {
            Allotjament a = it.next();
            if (Objects.equals(a.getId(), idAllotjament)) {
                return a;
            }
        }
        throw new ExcepcioReserva("L'allotjament amb id " + idAllotjament + " no existeix.");
    }

    //Comprova si un client existeix i el retorna o llança una excepció
    public Client buscarClient(String dni) throws ExcepcioReserva{
        Iterator<Client> it = llistaClients.iterator();
        while(it.hasNext()) {
            Client c = it.next();
            if (Objects.equals(c.getDni(), dni)) {
                return c;
            }
        }
        throw new ExcepcioReserva("El client amb DNI " + dni + " no existeix.");
    }
}
