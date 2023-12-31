package seminars.seminar8.Presenters;

import seminars.seminar8.Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    boolean removeRezervation(int oldReservation);

    int changeRservationTable(int oldReservation, Date reservtionDate, int tableNo, String name);
}
