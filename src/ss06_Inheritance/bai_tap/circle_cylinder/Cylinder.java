package ss06_Inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with Height "
                + this.getHeight()
                + ", with "
                + super.toString();
    }
}
