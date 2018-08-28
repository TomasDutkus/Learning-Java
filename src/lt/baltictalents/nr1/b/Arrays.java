package lt.baltictalents.nr1.b;

import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int sum = IntStream.of(a).sum();
        int sum2 = IntStream.of(b).sum();

        System.out.println(sum - sum2);

    }
}
