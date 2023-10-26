package seminars.seminar2.templateMethod;

public class Programm {
    public static  String data = """
            У лукоморья дуб зелёный;
            Златая цепь на дубе том:
            И днём и ночью кот ученый
            Всё ходит по цепи кругом;
            Идет направо - песнь заводит,
            Налево - сказку говорит.""";
    public static void main(String[] args) {
        LogReader logReader = new PoemReader(data);
        logReader.setCurrentPosition(3);

        for (LogEntry log: logReader.readLogEntry()){
            System.out.println(log.getText());
        }
    }
}
