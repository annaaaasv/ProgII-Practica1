package prog2.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate dataEntrada;
    private LocalDate dataSortida;

    public Reserva(){ //constructor, paràmetres igual que afegirReserva

    }

    public LocalDate getDataEntrada(){
        return dataEntrada;
    }

    public LocalDate getDataSortida(){
        return dataSortida;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSortida(LocalDate dataSortida) {
        this.dataSortida = dataSortida;
    }
}

