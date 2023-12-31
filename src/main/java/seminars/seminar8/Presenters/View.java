package seminars.seminar8.Presenters;

import seminars.seminar8.Models.Table;

import java.util.Collection;

public interface View {

    void registerObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void removeReservationTable(Integer id);
}
