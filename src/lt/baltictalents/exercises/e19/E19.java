package lt.baltictalents.exercises.e19;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class E19 {
    public static void main(String[] args) {
        System.out.println(copies3(Arrays.asList("a", "bb", "ccc")));//[aaa, bbbbbb, ccccccccc]
        System.out.println(copies3(Arrays.asList("24", "a", "")));//[242424, aaa, ]
        System.out.println(copies3(Arrays.asList("hello", "there")));//[hellohellohello, theretherethere]
    }

    private static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(toList());
    }
}
