package Thriost.Bai4;

import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FileProcessor {
    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    static class ReaderThread extends Thread {
        private String fileName;

        public ReaderThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    queue.put(line);
                }
                queue.put("END"); // Đánh dấu kết thúc
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ProcessorThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    String line = queue.take();
                    if ("END".equals(line)) break;
                    int wordCount = line.trim().isEmpty() ? 0 : line.trim().split("\\s+").length;
                    System.out.println("Số từ: " + wordCount);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\testing\\testing\\src\\Thriost\\Bai1\\text.txt "; // Đường dẫn file
        ReaderThread reader = new ReaderThread(filePath);
        ProcessorThread processor = new ProcessorThread();
        reader.start();
        processor.start();
    }
}

