package Thriost.Bai2;

import java.io.*;

class FileWriterThread extends Thread {
    private String filePath;
    private String content;

    public FileWriterThread(String filePath, String content) {
        this.filePath = filePath;
        this.content = content;
    }

    @Override
    public void run() {
        synchronized (FileWriterThread.class) { // Đảm bảo không có xung đột khi ghi file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(content);
                writer.newLine();
                System.out.println("Đã ghi: " + content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WriteFileWithThreads {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\testing\\testing\\src\\Thriost\\Bai2\\out.txt"; // Thay bằng đường dẫn file thực tế

        FileWriterThread thread1 = new FileWriterThread(filePath, "Thread 1: Hello World!");
        FileWriterThread thread2 = new FileWriterThread(filePath, "Thread 2: Java Multithreading");

        thread1.start();
        thread2.start();
    }
}

