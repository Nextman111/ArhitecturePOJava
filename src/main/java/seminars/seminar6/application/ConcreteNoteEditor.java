package seminars.seminar6.application;

import seminars.seminar6.application.interfaces.NoteEditor;
import seminars.seminar6.application.interfaces.NotesDatabaseContext;
import seminars.seminar6.application.interfaces.NotesPresenter;
import seminars.seminar6.domain.Note;

import java.util.Collection;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter presenter;

    public ConcreteNoteEditor(
            NotesPresenter presenter,
            NotesDatabaseContext dbContext) {
        this.dbContext = dbContext;
        this.presenter = presenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }

    @Override
    public boolean remove(Note item) {
//        return dbContext.saveChanges(getAll().remove(item));
        return true;
    }

    @Override
    public Optional<Note> getById(Integer id) {
        for (Note note : getAll()){
            if (note.getId()==id){
                return Optional.of(note);
            }
        }

        return Optional.empty();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        presenter.printAll(getAll());
    }
}
