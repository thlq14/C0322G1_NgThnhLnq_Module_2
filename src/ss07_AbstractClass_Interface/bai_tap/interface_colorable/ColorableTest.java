package ss07_AbstractClass_Interface.bai_tap.interface_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5.5, 6.4);
        shapes[2] = new Square(8.1);
        for (Shape item : shapes) {
            if (item instanceof Colorable) {
                System.out.println(item + "\n" + "Diện tích: " + item.getArea());
                ((Colorable) item).howToColor();
            } else {
                System.out.println(item + "\n" + "Diện tích: " + item.getArea());
            }
        }
    }
}
