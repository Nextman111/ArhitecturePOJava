package seminars.seminar2.factoryMethod;

import seminars.seminar2.templateMethod.LogReader;

public abstract class BaseLogReaderCreater {
    public LogReader createLogReader(LogType logType, Object data){
        LogReader logReader = createLogReaderInstance(logType);

        // подготовка обьекта
        logReader.setDataSource(data);

        return logReader;
    }

    /**
     * Фабричный метод
     * @param logType тип logReader'a
     * @return конкретный объект logReader'a
     * */
    protected abstract LogReader createLogReaderInstance(LogType logType);
}
