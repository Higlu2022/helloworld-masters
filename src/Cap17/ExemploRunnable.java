package Cap17;

public class ExemploRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Executando Runnable");

        }
    }
}
