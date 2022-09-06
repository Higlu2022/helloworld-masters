package Cap17;

public class Exemplo1 {
    public static void main(String[] args) {

        Thread thread = new ExemploThread();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Execução do método Main");
        }

    }
}
