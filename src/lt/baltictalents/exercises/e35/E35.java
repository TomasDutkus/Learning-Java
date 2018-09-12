package lt.baltictalents.exercises.e35;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Given an array of non-empty strings, return a Map<String, String>
 * with a key for every different first character seen,
 * with the value of all the strings starting with that character
 * appended together in the order they appear in the array.
 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) → {}
 */
class E35 {
    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{null, "bb", null, "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{"AbC", "bb", "BbC", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));
        System.out.println(firstChar(null));
    }

    static Map<String, String> firstChar(String[] strings) {
        if (strings == null) return null;
        List<String> stringsWithoutNulls = Arrays.stream(strings).filter(s -> s != null).collect(toList());

        Map<String, String> result = new HashMap<>();
        stringsWithoutNulls.stream()
                .map(s -> String.valueOf(s.charAt(0)).toLowerCase())
                .collect(toSet())
                .forEach(c -> result.put(c,
                        stringsWithoutNulls.stream()
                                .filter(ss -> ss.toLowerCase().startsWith(c))
                                .collect(Collectors.joining())));
        return result;
    }
}