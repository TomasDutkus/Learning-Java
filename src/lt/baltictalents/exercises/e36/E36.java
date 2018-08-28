package lt.baltictalents.exercises.e36;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

class E36 {
    public static void main(String[] args) {
        System.out.println(wordAppend("a", "b", "a")); // a
        System.out.println(wordAppend("a", "b", "a", "c", "a", "d", "a")); // aa
        System.out.println(wordAppend("a", "", "a")); // a
    }

    private static String wordAppend(String... strings) {
        long count = Arrays.stream(strings).filter(s -> s.equals("a")).count() / 2;
//        String str = "";
//        for (int i = 0; i < count; i++) {
//            str += "a";
//        }
//        return str;
        return Stream.generate(() -> "a").limit(count).collect(joining());
    }
}
