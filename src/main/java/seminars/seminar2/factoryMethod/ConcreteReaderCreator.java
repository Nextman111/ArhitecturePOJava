package seminars.seminar2.factoryMethod;

import seminars.seminar2.templateMethod.LogReader;
import seminars.seminar2.templateMethod.PoemReader;

public class ConcreteReaderCreator extends BaseLogReaderCreater{

    @Override
    protected LogReader createLogReaderInstance(LogType logType) {
        return switch (logType){
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case Database -> new DatabaseReader();
            case System -> new OperationSystemLogEventReader();
        };
    }
}
