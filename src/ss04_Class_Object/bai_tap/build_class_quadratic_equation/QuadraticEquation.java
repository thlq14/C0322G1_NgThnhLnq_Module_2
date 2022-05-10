package ss04_Class_Object.bai_tap.build_class_quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b + Math.pow(this.getDiscriminant(), 0.5) / (2 * this.a));
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b - Math.pow(this.getDiscriminant(), 0.5) / (2 * this.a));
        } else {
            return 0;
        }
    }
}
