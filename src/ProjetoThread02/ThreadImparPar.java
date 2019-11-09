package ProjetoThread02;

public class ThreadImparPar extends Thread {
    int start;
    String value;

    public ThreadImparPar(int start, String value) {
        super();
        this.start = start;
        this.value = value;
    }



    public void run() {
        for(int i = this.start; i < 100; i += 2) {
            System.out.println(this.value + " : " + i);
        }

    }
}
