package lab.wk2;
import lab.wk2.geometry.myPoint.Point;
import lab.wk2.geometry.myTriangle.Triangle;

public class MainClass {
    public static void main(String... args) {

        Point M = new Point(2.0, 2.0);
        Point N = new Point(4.0, 4.0);
        Point P = new Point(6.0, 2.0);

        Triangle myTri = new Triangle(M, N, P);
        myTri.showInfo();
        myTri.testTriangle();

        System.out.println("");

        Point a = new Point(2.0, 21.0);
        Point b = new Point(4.0, 41.0);
        Point c = new Point(6.0, 2.0);

        Triangle secondTri = new Triangle(a, b, c);
        secondTri.showInfo();
        secondTri.testTriangle();
    }
}
