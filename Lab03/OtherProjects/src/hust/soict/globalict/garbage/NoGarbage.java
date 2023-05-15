package Lab03.OtherProjects.src.hust.soict.globalict.garbage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/Hi/OneDrive/Máy tính/CODE/oop_lab/Lab03/OtherProjects/src/hust/soict/globalict/garbage/test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        inputBytes = Files.readAllBytes(Path.of(fileName));
        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime- startTime);
    }
}