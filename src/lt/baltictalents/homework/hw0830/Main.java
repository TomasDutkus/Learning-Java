package lt.baltictalents.homework.hw0830;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Main {
    private static final String WIKI_FILE = "resources/wiki.txt";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(WIKI_FILE);
        List<String> allWords = new ArrayList<>();
        Files.lines(path)
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .map(line -> Arrays.asList(line.split("[\\s,.()\"']")))
                .forEach(list -> {
                    list.stream()
                            .map(String::trim)
                            .filter(word -> !word.isEmpty())
                            .forEach(allWords::add);
                });

        Set<String> wordSet = new HashSet<>(allWords);
        Map<String, Integer> wordMap = wordSet.stream()
                .collect(toMap(w -> w, v -> 0));
        System.out.println(wordMap);
    }
}
