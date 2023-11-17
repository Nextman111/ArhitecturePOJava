package seminars.seminar8;

import seminars.seminar6.presentation.queries.controllers.Controller;
import seminars.seminar8.Models.TableModel;
import seminars.seminar8.Presenters.BookingPresenter;
import seminars.seminar8.Presenters.Model;
import seminars.seminar8.Views.BookingView;

import java.util.Date;
import java.util.Scanner;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {

        menu();

//        view.reservationTable(new Date(), 3, "Станислав");
//        view.changeReservationTable(1001, new Date(), 2, "Станислав");
    }
    public static void menu(){
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        Scanner scanner = new Scanner(System.in);

        boolean f = true;
        while (f){
            presenter.updateTables();


            System.out.println("*** Резерв столика ***");
            System.out.println("=======================");
            System.out.println("1. Зарезервировать");
            System.out.println("2. Поменять резерв");
            System.out.println("3. Удалить резерв");
            System.out.println("0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ");
            System.out.print("Пожалуйста, выберите пункт меню: ");
            if (scanner.hasNextInt()){
                Integer id = -1;
                int no = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (no) {
                        case 0:
                            System.out.println("Завершение работы приложения");
                            f = false;
                            break;
                        case 1:
                            id = get_id();

                            if (id > 0){
                                System.out.println("Резервирую столик..." + id);
                                view.reservationTable(new Date(), id,   get_string());
                            }
                            break;
                        case 2:
                            System.out.println("Номер резерва ");
                            id = get_id();
                            if (id > 0){
                                System.out.println("Смена резерва... " + id);
                                view.changeReservationTable(id, new Date(), get_id(), get_string());
                            }

                            break;
                        case 3:
                            System.out.println("Номер резерва ");
                            id = get_id();
                            if (id > 0){
                                System.out.println("Удаляю резерв... " + id);
                                view.removeReservationTable(id);
                            }

                            break;
                        default:
                            System.out.println("Укажите корректный пункт меню.");
                    }
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else {
                System.out.println("Укажите корректный пункт меню.");
                scanner.nextLine();
            }
        }
    }

    public static Integer get_id(){
        System.out.print("Укажите номер: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            throw new RuntimeException("Номер указан некорректно.");
        }
    }

    public static String get_string(){
        System.out.print("Укажите имя: ");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()){
            return scanner.next();
        }
        else {
            throw new RuntimeException("Пусто");
        }

    }
}
