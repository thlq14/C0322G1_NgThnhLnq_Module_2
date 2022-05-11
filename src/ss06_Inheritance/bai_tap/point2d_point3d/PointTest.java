package ss06_Inheritance.bai_tap.point2d_point3d;

public class PointTest {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        point2d.setX(5.5f);
        point2d.setY(6.3f);
        System.out.println(point2d.toString());

        point2d.setXY(3.7f, 9.6f);
        System.out.println(point2d.toString());

        Point3d point3d = new Point3d();
        System.out.println(point3d);
        point3d.setX(point2d.getX());
        point3d.setY(point2d.getY());
        point3d.setX(5.6f);
        point3d.setY(9.1f);
        point3d.setZ(9.7f);
        System.out.println(point3d.toString());
    }
}
