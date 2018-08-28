package lt.baltictalents.nr1.a;

public class PointMain {

    public static void main(String[] args) {

        Point point = new Point(1, 2);
        int x = point.getX();
        int y = point.getY();

        point.setX(x - y);
        point.setY(y - x);

        System.out.println(point.getX());
        System.out.println(point.getY());

    }
}
