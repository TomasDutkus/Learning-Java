package lt.baltictalents.exercises.e23;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class E23 {
    public static void main(String[] args) {
        System.out.println(nox(Arrays.asList("ax", "bb", "cx"))); // [a, bb, c]
        System.out.println(nox(Arrays.asList("xxax", "xbxbx", "xxcx"))); // [a, bb, c]
        System.out.println(nox(Arrays.asList("x"))); // []

    }
    private static List<String> nox(List<String> strings) {
        return strings.stream().map(s -> s.replace("x", "")).collect(toList());

    }
}
