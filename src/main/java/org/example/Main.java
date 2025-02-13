package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Your/File/Path/Name");
        Scanner scanner = null;
        PrintWriter printWriter = null;

        try {
            scanner = new Scanner(file);
            printWriter = new PrintWriter("/Your/File/Path/Name");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuilder newLine = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != '*' && line.charAt(i) != '#') {
                        newLine.append(line.charAt(i));
                    }
                }
                printWriter.println(newLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}