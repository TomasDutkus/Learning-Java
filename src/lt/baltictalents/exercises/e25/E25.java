package lt.baltictalents.exercises.e25;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class E25 {
    public static void main(String[] args) {
        System.out.println(noYY(Arrays.asList("a", "b", "c"))); // [ay, by, cy]
        System.out.println(noYY(Arrays.asList("a", "b", "cy"))); // [ay, by]
        System.out.println(noYY(Arrays.asList("xx", "ya", "zz"))); // [xxy, yay, zzy]

    }
    static List<String> noYY(List<String> strings) {
        if (strings == null) return null;
        return strings.stream()
                .map(s -> s.concat("y"))
                .filter(s-> !s.contains("yy"))
                .collect(toList());
    }
}
