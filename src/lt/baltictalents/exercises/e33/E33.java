package lt.baltictalents.exercises.e33;

public class E33 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4)); //true
        System.out.println(love6(4, 5)); //false
        System.out.println(love6(1, 5)); //true

    }

    private static boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        if (Math.abs(a + b) == 6) return true;
        if (Math.abs(a - b) == 6) return true;
        return false;
    }
}
