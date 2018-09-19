package lt.baltictalents.string;

public class StringCreator {
    public static void main(String[] args) {

        System.out.println(create("Jonas", "Petraitis"));
        System.out.println(create("Petraitis", "Jonas", "Petraitis"));

    }

    public static String create(String a, String b) {
        a += b;
        return a;
    }

    public static String create(String a, String b, String c) {
        a += b + c;
        return a;
    }


}
