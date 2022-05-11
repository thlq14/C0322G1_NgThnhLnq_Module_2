package ss06_Inheritance.bai_tap.circle_cylinder;

public class CircleCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(7.3);
        circle.setColor("blue");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(13);
        System.out.println(cylinder.toString());
        System.out.println("Area Circle: " + circle.getArea());
        System.out.println("Volume Circle: " + cylinder.getVolume());
    }
}
