package Cap17;

public class Exemplo5 {
    public static void main(String[] args) throws InterruptedException {

        ExemploSyncronized exemploSyncronized = new ExemploSyncronized();

        exemploSyncronized.start();

        synchronized (exemploSyncronized){
            System.out.println("Agurdando");
            exemploSyncronized.wait();
        }
        System.out.println("O valor total é: " + exemploSyncronized.getTotal());


    }
}
