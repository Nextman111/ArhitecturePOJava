package seminars.seminar6.infrastructure.persistance;

import seminars.seminar6.application.interfaces.NotesDatabaseContext;
import seminars.seminar6.database.NotesDatabase;
import seminars.seminar6.database.NotesRecord;
import seminars.seminar6.database.NotesTable;
import seminars.seminar6.domain.Note;
import seminars.seminar6.infrastructure.persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    public Collection<Note> getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()
            ));
        }
        return notes;
    }

    @Override
    public boolean saveChanges() {
        return false;
    }


    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    @Override
    public boolean saveChanges(Collection<Note> notes) {
        ((NotesDatabase)database).setNotesTable((NotesTable) notes);
        return true;
    }
}
