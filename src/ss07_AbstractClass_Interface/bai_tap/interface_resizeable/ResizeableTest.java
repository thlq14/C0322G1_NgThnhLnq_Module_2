package ss07_AbstractClass_Interface.bai_tap.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5.5, 6.4);
        shapes[2] = new Square(8.1);
        System.out.println("Area of Element Before resize:");
        for (Shape item : shapes) {
            System.out.println(item.getArea());
        }

        shapes[0].resize(Math.random() * 100);
        shapes[1].resize(Math.random() * 100);
        shapes[2].resize(Math.random() * 100);
        System.out.println("Area of Element After resize:");
        for (Shape item : shapes) {
            System.out.println(item.getArea());
        }
    }
}
