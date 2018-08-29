package lt.baltictalents.exercises.e37;

/**
 * Given a string, return true if "bad" appears starting at index 0
 * or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */
class E37 {
    private static final String BAD = "bad";

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad(""));
        System.out.println(hasBad(null));
    }

    private static boolean hasBad(String badOrNot) {
        if (badOrNot != null) {
            //return badOrNot.startsWith(BAD) || badOrNot.startsWith("bad", 1);
            return badOrNot.indexOf(BAD) == 0 || badOrNot.indexOf(BAD) == 1;
        }
        return false;
    }
}

