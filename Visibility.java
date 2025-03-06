class Visibility {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {} // Luong se nhan thay flag
            System.out.println("Flag changed!");
        }).start();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        flag = true; // Cập nhật giá trị, các luồng khác sẽ thấy ngay
    }
}
