package seminars.seminar8.Views;

import seminars.seminar8.Models.Table;
import seminars.seminar8.Presenters.View;
import seminars.seminar8.Presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            if (table.getReservations().isEmpty())
                System.out.println(table);
            else
                System.out.println(table + " Резерв "+ table.getReservations());
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер резерва #%d\n", reservationNo);
        else
            System.out.println("Невозможно забронировать столик.\nПовторите попытку позже.");
    }

    @Override
    public void removeReservationTable(Integer id) {
        for (ViewObserver observer : observers)
            observer.onRemoveReservationTable(id);
    }

    public void reservationTable(Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onReservationTable(reservtionDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onChangeReservationTable(oldReservation,reservtionDate, tableNo, name);

    }

}
