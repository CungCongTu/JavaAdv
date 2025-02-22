package Bai3_6;

public class Ball {

    private float x;
    private float y;
    private int  radius;
    private float xDelta;
    private float yDelta;

    public Ball(int x, int y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));  //  speed noi ro hon no la toc do
        // khung hinh nhi , kieu khi m luot thi no gom nhieu khung anh voi toc do do no se gan lai voi nhau
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return (int) this.x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return (int) this.y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }

    public int getSpeed() {
        return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    // -------------------------------------------------------------------------
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // ----------------------------------------------------------
    public void move() {
        x += xDelta;
        y += yDelta;
    }


    // ----------------------------------
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // ---------------------------------------------------------
    public void reflectVertical() {
        yDelta = -yDelta;
    }


    public String toString() {
        return "Ball at ("+ (int) x +", "+ (int) y +") of velocity ("+ getSpeed() +", "+ getDirection() +")";
    }
}
