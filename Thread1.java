//class EvenThread extends Thread {
//    public void run() {
//        for (int i = 2; i <= 10; i += 2) {
//            System.out.println("Even: " + i);
//            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
//        }
//    }
//}
//
//class OddThread extends Thread {
//    public void run() {
//        for (int i = 1; i <= 10; i += 2) {
//            System.out.println("Odd: " + i);
//            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
//        }
//    }
//}
//
//public class Thread1 {
//    public static void main(String[] args) {
//        Thread evenThread = new EvenThread();
//        Thread oddThread = new OddThread();
//
//        evenThread.start();
//        oddThread.start();
//    }
//}


class EvenThread extends Thread{ // Ham goi so chan
    public void run(){ // Phuong thuc duoc ghi de tu thread hoac giao dien Runable
        for(int i = 2; i<=10;i += 2){ // bat dau tu so 2 cho den 10 ket thuc luong
            System.out.println("Even: " + i);
            try{
                Thread.sleep(500); // khoang cach time in ra 0.5s
            }catch (InterruptedException e){
                e.printStackTrace();// in loi
            }
        }
    }
}

class OddThread extends Thread {
    public void run(){
        for (int i = 1; i<=10; i+=2){
            System.out.println("Odd: " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread(); // Khoi tao luong
        Thread oddThread = new OddThread(); // Khoi tao luong

        evenThread.start();
        oddThread.start();
    }
}






















