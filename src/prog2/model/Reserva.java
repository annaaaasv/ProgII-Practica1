package prog2.model;

import java.time.LocalDate;

public class Reserva implements InReserva {
    private Client client;
    private Allotjament allotjament;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;


    public Reserva(String id, String nom, LocalDate dataEntrada, LocalDate dataSortida){
        //no se fer aixo perque el id es d'allotjament i nom de client
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

