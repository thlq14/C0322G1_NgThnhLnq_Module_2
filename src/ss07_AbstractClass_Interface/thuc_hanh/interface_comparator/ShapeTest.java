package ss07_AbstractClass_Interface.thuc_hanh.interface_comparator;

import ss06_Inheritance.thuc_hanh.geometric_objects.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}