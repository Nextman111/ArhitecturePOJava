package seminars.seminar6;

import seminars.seminar5.ui.Editor3D;
import seminars.seminar6.application.ConcreteNoteEditor;
import seminars.seminar6.application.interfaces.NoteEditor;
import seminars.seminar6.application.interfaces.NotesDatabaseContext;
import seminars.seminar6.database.NotesDatabase;
import seminars.seminar6.infrastructure.persistance.Database;
import seminars.seminar6.infrastructure.persistance.DatabaseContext;
import seminars.seminar6.presentation.queries.controllers.Controller;
import seminars.seminar6.presentation.queries.controllers.NotesController;
import seminars.seminar6.presentation.queries.views.NotesConsolePresenter;

import java.util.Scanner;

public class Program {

    /**
     * CQRS
     * @param args
     */
    public static void main(String[] args) {
        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();

        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);

        Controller notesController = new NotesController(noteEditor);

        menu(notesController);
    }

    public static void menu(Controller controller){
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while (f){
            controller.routeGetAll();

            System.out.println("*** МОЙ 3D РЕДАКТОР ***");
            System.out.println("=======================");
            System.out.println("1. Создать запись");
            System.out.println("2. Удалить запись");
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
                            System.out.println("Добавляю запись... ");
//                            controller.add();
                            break;
                        case 2:
                            id = get_id();

                            System.out.println("Удаляю запись... " + id);
                            if (id > 0){
                                controller.del(id);
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
        Integer id = -1;


        if (scanner.hasNextInt()){
            id = scanner.nextInt();
        }
        else {
            System.out.println("Номер указан некорректно.");
        }

        return id;
    }

}
