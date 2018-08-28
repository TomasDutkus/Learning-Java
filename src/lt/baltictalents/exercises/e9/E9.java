package lt.baltictalents.exercises.e9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

//Given a list of integers, return a list where each integer is multiplied with itself.

class E9 {
    public static void main(String[] args) {
        System.out.println(square(Arrays.asList(1, 2, 3)));// [1, 4, 9]
        System.out.println(square(Arrays.asList(6, 8, -6, -8, 1)));// [36, 64, 36,64,1]
        System.out.println(square(Collections.emptyList()));// []
    }

    private static List<Integer> square(List<Integer> list) {
        return list.stream().map(i -> i * i).collect(toList());
    }
}
