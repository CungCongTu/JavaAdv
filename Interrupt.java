class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Worker is running...");
                    Thread.sleep(500); // sleep 0,5s
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted!");
                    Thread.currentThread().interrupt(); // set lai flag isInterrupted
                }
            }
            System.out.println("Worker stopped.");
        });

        worker.start();
        Thread.sleep(3000); // Cho 3 giay
        worker.interrupt(); // Gui yeu cau dung luong
    }
}
