package Cap17;

public class ExemploThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Executando a threads");

        }
    }

    public void run(String s) {
        System.out.println("Executando a thread" + s);
    }


}
