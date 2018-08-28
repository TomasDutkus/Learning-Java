package lt.baltictalents.nr3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterReader {
    private static final String filename = "resources/Text.txt";
    public static void main(String[] args) throws IOException {

        printToFile(filename);

    }

    private static void printToFile(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.printf("vienas,du,  trys , nulis%n");
        writer.println("|vienas|");
        writer.println("|du|");
        writer.println("|trys|");
        writer.println("|nulis|");
        writer.close();
    }
}
