package Thriost.Bai1;

import java.io.*;

class FileReaderThread extends Thread {
    private String filePath;

    public FileReaderThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(500); // Giả lập độ trễ để thấy rõ từng dòng được in ra
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ReadFileWithThread {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\testing\\testing\\src\\Thriost\\Bai1\\text.txt"; // Thay bằng đường dẫn file thực tế
        FileReaderThread thread = new FileReaderThread(filePath);
        thread.start();
    }
}
