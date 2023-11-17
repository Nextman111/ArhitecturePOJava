package seminars.seminar8.Models;

import seminars.seminar8.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public boolean removeRezervation(int oldReservation) {
        for (Table table : tables){
            if(!table.getReservations().isEmpty()){
                for(var rezerv : table.getReservations()){
                    if(rezerv.getId() == oldReservation){
                        table.getReservations().remove(rezerv);
                        return true;
                    }
                }
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeRservationTable(int oldReservation, Date reservtionDate, int tableNo, String name) {
        removeRezervation(oldReservation);
        return reservationTable(reservtionDate, tableNo, name);
    }

}
