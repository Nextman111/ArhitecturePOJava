package seminars.seminar6.application.interfaces;

import seminars.seminar6.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    boolean saveChanges();

//    boolean saveChanges();


}
