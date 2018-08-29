package lt.baltictalents.exercises.e31;

import java.util.Arrays;

/**
 * Given an int array, return a new array with double the length where its last element
 * is the same as the original array, and all the other elements are 0.
 * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 * makeLast([1, 2]) → [0, 0, 0, 2]
 * makeLast([3]) → [0, 3]
 */
class E31 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
        System.out.println(Arrays.toString(makeLast(new int[]{}))); // []
        System.out.println(Arrays.toString(makeLast(null))); // null
    }

    private static int[] makeLast(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int[] result = new int[arr.length * 2];
        result[result.length - 1] = arr[arr.length - 1];
        return result;
    }
}
