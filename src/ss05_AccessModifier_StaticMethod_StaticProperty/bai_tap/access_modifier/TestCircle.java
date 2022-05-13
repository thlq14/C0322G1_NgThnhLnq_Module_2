package ss05_AccessModifier_StaticMethod_StaticProperty.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "blue");
        Circle circle2 = new Circle(1.5, "red");
        System.out.println("Hình tròn 1 có Bán kính là: " + circle1.getRadius());
        System.out.println("Hình tròn 1 có Diện tích là: " + circle1.getArea());
        System.out.println("Hình tròn 2 có Bán kính là: " + circle2.getRadius());
        System.out.println("Hình tròn 2 có Diện tích là: " + circle2.getArea());
    }
}
