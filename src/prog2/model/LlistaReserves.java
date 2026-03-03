package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import static prog2.model.Camping.getTemporada;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList<Reserva> llistaReserves;
    private int numReserves;

    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(!isEstadaMinima(allotjament, dataEntrada, dataSortida)){
            throw new ExcepcioReserva("Les dates sol·licitades pel client " + client + " amb DNI: " + client.getDni() +
                    " no compleixen l'estada mínima per l'allotjament amb identificador " + allotjament.getId() + ".");
        }

        Reserva nou = new Reserva(allotjament, client, dataEntrada, dataSortida);
        llistaReserves.add(nou);
    }

    @Override
    public int getNumReserves() {
        return numReserves;
    }


    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        return false;
    }

    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);

        InAllotjament.Temp temp = getTemporada(dataEntrada);

        return estada >= allotjament.getEstadaMinima(temp);
    }

}