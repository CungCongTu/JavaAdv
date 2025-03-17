package Thriost.Bai5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class LogWriterThread extends Thread {
    private String logFile;
    private static final BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public LogWriterThread(String logFile) {
        this.logFile = logFile;
    }

    public static void log(String message) {
        try {
            logQueue.put(dateFormat.format(new Date()) + " - " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            while (true) {
                String logMessage = logQueue.take();
                writer.write(logMessage);
                writer.newLine();
                writer.flush();
                System.out.println("Đã ghi log: " + logMessage);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LoggerApp {
    public static void main(String[] args) {
        String logFilePath = "log.txt"; // Đường dẫn file log
        LogWriterThread logThread = new LogWriterThread(logFilePath);
        logThread.start();

        // Ghi một số log thử nghiệm
        LogWriterThread.log("Ứng dụng khởi động");
        LogWriterThread.log("Đang xử lý dữ liệu");
        LogWriterThread.log("Hoàn thành tác vụ");
    }
}
