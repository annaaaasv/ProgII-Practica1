package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva implements InReserva {
    private Client client;
    private Allotjament allotjament;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;


    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva{
        if(dataSortida.isBefore(dataEntrada)){
            throw new ExcepcioReserva("La data de sortida no pot ser abans de la data d'entrada");
        }

        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;

    }

    //Obté la informació de l'allotjament
    @Override
    public Allotjament getAllotjament_() {
        return allotjament;
    }

    //Obté la informació del client
    @Override
    public Client getClient() {
        return client;
    }

    //Obté la data d'entrada
    @Override
    public LocalDate getDataEntrada(){
        return dataEntrada;
    }

    //Obté la data de sortida
    @Override
    public LocalDate getDataSortida(){
        return dataSortida;
    }

    //Estableix l'allotjament
    @Override
    public void setAllotjament_(Allotjament allotjament_) {
        allotjament = allotjament_;
    }

    //Estableix el client
    @Override
    public void setClient(Client client_) {
        client = client_;
    }

    //Estableix la data d'entrada
    @Override
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    //Estableix la data de sortida
    @Override
    public void setDataSortida(LocalDate dataSortida) {
        this.dataSortida = dataSortida;
    }
}

