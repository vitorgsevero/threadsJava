package ProjetoThread01;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        (new MeuThread()).start();
        MeuRunnable meuRunnable = new MeuRunnable();
        (new Thread(meuRunnable)).start();

        for(int i = 0; i < 10; ++i) {
            System.out.println("Main: " + i);

            try {
                Thread.sleep(10L);
            } catch (InterruptedException var4) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, (String)null, var4);
            }
        }

    }
}
