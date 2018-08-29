package lt.baltictalents.exercises.e27;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Given a list of integers, return a list of those numbers,
 * omitting any that are between 13 and 19 inclusive.
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
class E27 {
    public static void main(String[] args) {
        System.out.println(noTeen(Arrays.asList(12, 13, 19, 20)));
        System.out.println(noTeen(Arrays.asList(1, 14, 1)));
        System.out.println(noTeen(Collections.singletonList(15)));
        System.out.println(noTeen(Collections.emptyList()));
        System.out.println(noTeen(null));
    }

    private static List<Integer> noTeen(List<Integer> ageList) {
        if (ageList == null) return null;
        return ageList.stream()
                .filter(a -> a < 13 || a > 19)
                .collect(toList());
    }
}
