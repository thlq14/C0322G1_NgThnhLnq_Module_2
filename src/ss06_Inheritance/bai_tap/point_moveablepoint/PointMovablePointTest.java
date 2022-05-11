package ss06_Inheritance.bai_tap.point_moveablepoint;

public class PointMovablePointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(0);
        point.setY(5);
        System.out.println(point.toString());

        point.setXY(3, 6);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());
        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(4);
        System.out.println(movablePoint.toString());

        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
