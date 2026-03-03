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

    @Override
    public Allotjament getAllotjament_() {
        return allotjament;
    }
    @Override
    public Client getClient() {
        return client;
    }
    @Override
    public LocalDate getDataEntrada(){
        return dataEntrada;
    }
    @Override
    public LocalDate getDataSortida(){
        return dataSortida;
    }

    @Override
    public void setAllotjament_(Allotjament allotjament_) {
        allotjament = allotjament_;
    }
    @Override
    public void setClient(Client client_) {
        client = client_;
    }

    @Override
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    @Override
    public void setDataSortida(LocalDate dataSortida) {
        this.dataSortida = dataSortida;
    }
}

