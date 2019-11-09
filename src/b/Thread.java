package b;

public class Thread extends java.lang.Thread {

    boolean asc = false;

    public Thread(boolean asc) {
        this.asc = asc;
    }

    @Override
    public void run() {
        super.run();
        if(asc){
            for(int i=1; i<501; i++) {
                System.out.println("ASCEDING: " + i);
            }
        }else{
                for(int t=500; t>=0; t--){
                    System.out.println("DESCENDING: " + t);
                }
            }
        }
    }
