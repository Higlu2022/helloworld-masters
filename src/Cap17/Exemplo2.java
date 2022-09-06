package Cap17;

public class Exemplo2 {
    public static void main(String[] args) {

        ExemploRunnable runnable = new ExemploRunnable();
        Thread thread = new Thread(runnable);

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Método Main");

        }


    }
}
