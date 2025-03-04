class CountdownThread extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Countdown: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thread countdownThread = new CountdownThread();
        countdownThread.start();
    }
}

