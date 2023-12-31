package seminars.seminar6.presentation.queries.controllers;

import seminars.seminar6.application.interfaces.NoteEditor;
import seminars.seminar6.presentation.queries.controllers.Controller;

public class NotesController extends Controller {
    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    //TODO: \notes\all
    @Override
    public void routeGetAll(){
        noteEditor.printAll();
    }

    @Override
    public void del(Integer id) {
        noteEditor.remove(noteEditor.getById(id).get());
    }
}
