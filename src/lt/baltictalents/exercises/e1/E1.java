package lt.baltictalents.exercises.e1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 * doubling([1, 2, 3]) → [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 * doubling([]) → []
 */
class E1 {
    public static void main(String[] args) {
        System.out.println(doubling(Arrays.asList(1, 2, 3)));
        System.out.println(doubling(Arrays.asList(6, 8, 6, 8, -1)));
        System.out.println(doubling(Collections.emptyList()));
    }

    static List<Integer> doubling(List<Integer> list) {
        if (list == null) {
            return null;
        }
        return list.stream().map(i -> i * 2).collect(toList());
    }
}
