package seminars.seminar6.application.interfaces;

import seminars.seminar6.domain.Note;

public interface NoteEditor extends Editor<Note, Integer>{

    void printAll();

}
