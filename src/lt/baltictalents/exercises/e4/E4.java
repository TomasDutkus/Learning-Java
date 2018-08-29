package lt.baltictalents.exercises.e4;

/**
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 * The string length will be at least 3.
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */
class E4 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy")); //and
        System.out.println(middleThree("and")); //and
        System.out.println(middleThree("solving")); //lvi
        System.out.println(middleThree("andy")); //andy
        System.out.println(middleThree("dy")); //dy
        System.out.println(middleThree("y")); //y
        System.out.println(middleThree(null)); //null
    }

    private static String middleThree(String str) {
        if (str != null && str.length() > 3 && str.length() % 2 != 0) {
            int middle = str.length() / 2;
            return str.substring(middle - 1, middle + 2);
        }
        return str;
    }
}
