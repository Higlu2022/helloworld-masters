package Cap17;

public class ExemploSyncronized extends Thread {

    private int total;

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            total += i;
        }


    }

    public int getTotal() {

        return total;
    }
}
