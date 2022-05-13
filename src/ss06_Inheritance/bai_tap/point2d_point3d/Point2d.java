package ss06_Inheritance.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        float[] arr = {this.x, this.y};
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}
