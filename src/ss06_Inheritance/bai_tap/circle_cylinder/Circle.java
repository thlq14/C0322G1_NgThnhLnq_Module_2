package ss06_Inheritance.bai_tap.circle_cylinder;

public class Circle {
    private double radius = 3.0;
    private String color = "black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with Radius "
                + this.getRadius()
                + ", with Color "
                + this.getColor();
    }
}
