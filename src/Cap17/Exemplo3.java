package Cap17;

public class Exemplo3 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thead interface funcional"));

        thread.start();
        outraExecucao();

        ExemploRunnable runnable = new ExemploRunnable();
        Thread thread1 = new Thread(runnable);

        thread1.start();
    }

    public static void outraExecucao() {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Executa o metodo");

            }

        });
        thread.start();
        Thread.yield();
    }



}
