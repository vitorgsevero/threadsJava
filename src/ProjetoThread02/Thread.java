package ProjetoThread02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread extends java.lang.Thread {
    private String nome;
    private int multiplo;
    private int maximo;

    public Thread() {
        this.nome = nome;
        this.multiplo = multiplo;
        this.maximo = maximo;
    }


    public void run() {
        for(int i = this.multiplo; i <= this.maximo; i += this.multiplo) {
            System.out.println(this.nome + ": " + i);

            try {
                java.lang.Thread.sleep(100L);
            } catch (InterruptedException var3) {
                Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, (String)null, var3);
            }
        }

    }
}

