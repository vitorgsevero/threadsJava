package c;

public class Thread extends java.lang.Thread {

    int number = 0;
    int start = 0;

    public Thread(int number, int start) {
        this.number = number;
        this.start = start;
    }

    @Override
    public void run() {
        for(int i = start; i<101; i= number + i){
            System.out.println("Thread: " + start + ": "+i);
        }
    }
}
