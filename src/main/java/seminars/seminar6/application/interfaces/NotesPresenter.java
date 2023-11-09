package seminars.seminar6.application.interfaces;

import seminars.seminar6.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
