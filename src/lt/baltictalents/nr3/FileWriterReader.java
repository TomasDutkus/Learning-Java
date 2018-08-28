package lt.baltictalents.nr3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterReader {
    private static final String filename = "resources/Text.txt";
    public static final String DELIMITER = "[\\s]*,[\\s]*";
    public static void main(String[] args) throws IOException {

        printToFile(filename);
        Path path = Paths.get("resources/Text.txt");
        Files.lines(path).map(line -> line.trim().split(DELIMITER))
                .forEach(arr -> {
                    for (String a : arr) {
                        System.out.println(a);
                    }
                });
        System.out.println("--------------------------------");

    }

    private static void printToFile(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.printf("vienas,du,  trys , nulis%n");
/*        writer.println("vienas");
        writer.println("du");
        writer.println("trys");
        writer.println("nulis"); */
        writer.close();
    }
}
