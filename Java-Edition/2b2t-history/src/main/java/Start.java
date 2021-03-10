public class Start {
    public static void main(String[] args) {
        generateNew.start();
    }
    static Thread generateNew = new Thread(() -> {
        while (true) {
            try {
                System.out.println(Generator.Gen());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    });
}
