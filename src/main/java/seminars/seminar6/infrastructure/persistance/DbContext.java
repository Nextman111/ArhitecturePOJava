package seminars.seminar6.infrastructure.persistance;

import seminars.seminar6.domain.Note;

import java.util.Collection;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    //TODO: Сохранение изменений в базе данных

    public abstract boolean saveChanges(Collection<Note> notes);
}
