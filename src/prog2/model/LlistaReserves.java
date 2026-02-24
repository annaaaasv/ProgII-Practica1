package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class LlistaReserves implements InLlistaReserves{
    private int numReserves;

    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public int getNumReserves() {
        return numReserves;
    }
}
