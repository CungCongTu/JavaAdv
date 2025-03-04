
import java.util.LinkedList;
import java.util.Queue;


class DiningTable {
    private final int CAPACITY = 5;
    private final Queue<String> table = new LinkedList<>();

    public synchronized void cook() throws InterruptedException {
        while (table.size() == CAPACITY) {
            wait();
        }
        table.add("Dish");
        System.out.println("Cooked a dish. Total: " + table.size());
        notifyAll();
    }

    public synchronized void eat() throws InterruptedException {
        while (table.isEmpty()) {
            wait();
        }
        table.poll(); 
        System.out.println("Ate a dish. Remaining: " + table.size());
        notifyAll();
    }
}


class Chef extends Thread {
    private final DiningTable table;
    public Chef(DiningTable table) {
        this.table = table;
    }
    public void run() {
        try {
            while (true) {
                table.cook();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


class Customer extends Thread {
    private final DiningTable table;
    public Customer(DiningTable table) { this.table = table; }
    public void run() {
        try {
            while (true) {
                table.eat();
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class Thread3 {
    public static void main(String[] args) {
        DiningTable table = new DiningTable();
        Thread chef = new Chef(table);
        Thread customer = new Customer(table);
        chef.start();
        customer.start();
    }
}

