package ProjetoThread01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuThread extends Thread {
    public MeuThread() {
    }

    public void run() {
        for(int i = 0; i < 10; ++i) {
            System.out.println("Meu Thread: " + i);

            try {
                Thread.sleep(100L);
            } catch (InterruptedException var3) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, (String)null, var3);
            }
        }

    }
}
