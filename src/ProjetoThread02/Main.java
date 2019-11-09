package ProjetoThread02;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        (new ThreadImparPar(0, "Par")).start();
        (new ThreadImparPar(1, "Impar")).start();
    }
}