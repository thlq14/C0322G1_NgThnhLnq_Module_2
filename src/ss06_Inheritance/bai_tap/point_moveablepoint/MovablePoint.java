package ss06_Inheritance.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String getSpeed() {
        float[] floats = {this.xSpeed, this.ySpeed};
        return Arrays.toString(floats);
    }

    @Override
    public String toString() {
        return "(" + String.format("%f, %f", this.getX(), this.getY())
                + "), speed = (" + String.format("%f, %f", this.getxSpeed(), this.getySpeed()) + ")";
    }

    public MovablePoint move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }
}
