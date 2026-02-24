package prog2.model;

import java.time.LocalDate;

public class Reserva implements InReserva {
    private LocalDate dataEntrada;
    private LocalDate dataSortida;

    public Reserva(){ //constructor, paràmetres igual que afegirReserva

    }

    @Override
    public Allotjament getAllotjament_() {
        return null;
    }

    @Override
    public Client getClient() {
        return null;
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

    }

    @Override
    public void setClient(Client client_) {

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

