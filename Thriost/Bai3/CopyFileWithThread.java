package Thriost.Bai3;

import java.io.*;

class FileCopyThread extends Thread {
    private String sourceFile;
    private String destinationFile;

    public FileCopyThread(String sourceFile, String destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Sao chép hoàn tất từ " + sourceFile + " sang " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


public class CopyFileWithThread {
    public static void main(String[] args) {
        String source = "C:\\Users\\Admin\\IdeaProjects\\testing\\testing\\src\\Thriost\\Bai3\\auth.txt"; // Thay bằng đường dẫn file nguồn
        String destination = "C:\\Users\\Admin\\IdeaProjects\\testing\\testing\\src\\Thriost\\Bai3\\copppy.txt"; // Thay bằng đường dẫn file đích

        FileCopyThread copyThread = new FileCopyThread(source, destination);
        copyThread.start();
    }
}
