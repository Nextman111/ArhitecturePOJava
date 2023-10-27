package adapter;

public class Program {
    public static void main(String[] args) {
        IActions actions = new Adapter1(123);
        System.out.println(actions.getAction());
    }
}
