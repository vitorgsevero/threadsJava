package b;

public class Main {
    public static void main(String[] args) {
        new Thread(true).start();
        new Thread(false).start();
    }
}
