package Bai5_2;

public class Cylinder
{
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return base.getArea()*height;
    }

    public double getArea() {
        return 2*Math.PI*base.getRadius()*height + 2* base.getArea();
    }
}
