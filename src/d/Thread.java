package d;

public class Thread extends java.lang.Thread {

    int[] numbers;
    int start;
    int finish;
    int number;

    public Thread(int[] numbers, int start, int finish, int number) {
        this.numbers = numbers;
        this.start = start;
        this.finish = finish;
        this.number = number;
    }

    @Override
    public void run() {
        boolean ok = false;
        for(int i=start; i<finish; i++){
            if(numbers[i] == number){
                ok = true;
                System.out.println("Start: " + start + " - Finish " + finish + ": " + numbers[i]);
                i = finish;
            }
        }
        if(!ok){
            System.out.println("Start: " + start + " - Finish " + finish + ": -1");
        }
    }
}
