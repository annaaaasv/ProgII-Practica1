package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

import static prog2.model.Camping.getTemporada;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList<Reserva> llistaReserves;
    private int numReserves;

    public LlistaReserves(){
        this.llistaReserves = new ArrayList<>();
    }


    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(!isEstadaMinima(allotjament, dataEntrada, dataSortida)){
            throw new ExcepcioReserva("Les dates sol·licitades pel client " + client + " amb DNI: " + client.getDni() +
                    " no compleixen l'estada mínima per l'allotjament amb identificador " + allotjament.getId() + ".");
        }
        else if(!allotjamentDisponible(allotjament, dataEntrada, dataSortida)){
            throw new ExcepcioReserva("L'allotjament amb identificador " + allotjament.getId() + " no està disponible en la data demanada " +
                    dataEntrada + " pel client " + client + " amb DNI: " + client.getDni() + ".");
        }
        else{
            Reserva nova = new Reserva(allotjament, client, dataEntrada, dataSortida);
            llistaReserves.add(nova);
            numReserves++;
        }
    }

    @Override
    public int getNumReserves() {
        return numReserves;
    }


    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        Iterator<Reserva> it = llistaReserves.iterator();
        while(it.hasNext()) {
            Reserva r = it.next();
            if (r.getAllotjament_().equals(allotjament)) {
                LocalDate dataEntradaExistent = r.getDataEntrada();
                LocalDate dataSortidaExistent = r.getDataSortida();

                if(dataEntrada.isBefore(dataSortidaExistent) && dataSortida.isAfter(dataEntradaExistent)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);

        InAllotjament.Temp temp = getTemporada(dataEntrada);

        return estada >= allotjament.getEstadaMinima(temp);
    }

}