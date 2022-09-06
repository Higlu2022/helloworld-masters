package Cap17;

public class Exemplo4 {
    public static void main(String[] args) {

        ExemploSyncronize exemploSyncronize = new ExemploSyncronize();
        Thread thread1 = new Thread(exemploSyncronize, "1: ");
        Thread thread2 = new Thread(exemploSyncronize, "2: ");

        thread1.start();
        thread2.start();

    }
}
