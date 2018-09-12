package lt.baltictalents.exercises.e2;

public class E2 {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello")); // HeHeHe
        System.out.println(extraFront("ab")); // ababab
        System.out.println(extraFront("H")); // HHH

    }

    private static String extraFront(String str) {
        if (str.length()>2) {
            str = str.substring(0, 2);
        }
        return str + str + str;

    }
}
