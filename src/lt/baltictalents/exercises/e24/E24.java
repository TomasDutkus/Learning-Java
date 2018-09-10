package lt.baltictalents.exercises.e24;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 24.	Given a list of integers, return a list of the integers,
 * omitting any that are less than 0.
 * noNeg([1, -2]) → [1]
 * noNeg([-3, -3, 3, 3]) → [3, 3]
 * noNeg([-1, -1, -1]) → []
 */
class E24 {
    public static void main(String[] args) {
        System.out.println(noNeg(Arrays.asList(1, -2)));
        System.out.println(noNeg(Arrays.asList(-3, -3, 3, 3)));
        System.out.println(noNeg(Arrays.asList(-1, -1, -1)));
    }

    static List<Integer> noNeg(List<Integer> strings) {
        if (strings == null) {
            return null;
        }
        return strings.stream().filter(i -> i >= 0).collect(toList());
    }
}