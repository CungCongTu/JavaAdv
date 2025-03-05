public class StarvationFixed {
    public static void main(String[] args) {
        Thread highPriority = new Thread(() -> {
            while (true) {
                System.out.println("High priority thread running...");
                Thread.yield(); // Nhuong cpu cho nguon khac
            }
        });

        Thread lowPriority = new Thread(() -> {
            while (true) System.out.println("Low priority thread running...");
        });

        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);

        highPriority.start();
        lowPriority.start();
    }
}
