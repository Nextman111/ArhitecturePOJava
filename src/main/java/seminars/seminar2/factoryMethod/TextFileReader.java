package seminars.seminar2.factoryMethod;

import seminars.seminar2.templateMethod.LogEntry;
import seminars.seminar2.templateMethod.LogReader;

public class TextFileReader extends LogReader {
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(int position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
