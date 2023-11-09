package seminars.seminar6;

import seminars.seminar6.application.ConcreteNoteEditor;
import seminars.seminar6.application.interfaces.NoteEditor;
import seminars.seminar6.application.interfaces.NotesDatabaseContext;
import seminars.seminar6.database.NotesDatabase;
import seminars.seminar6.infrastructure.persistance.Database;
import seminars.seminar6.infrastructure.persistance.DatabaseContext;
import seminars.seminar6.presentation.queries.controllers.NotesController;
import seminars.seminar6.presentation.queries.views.NotesConsolePresenter;

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

        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();
    }

}
