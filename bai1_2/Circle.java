package bai1_2;
//public class Circle {
//    private double radius;
//
//    public bai1_2.Circle(){
//        radius = 1.0;
//
//    }
//
//    public bai1_2.Circle(double r){
//        radius = r;
//    }
//
//    public double getRadius(){
//        return radius;
//    }
//
//    public void setRadius(double newRadius) {
//        radius = newRadius;
//    }
//
//    public double getArea(){
//        return radius*radius*Math.PI;
//    }
//
//    public double Circumference(double r){
//        return 2*Math.PI*r;
//    }
//
//    public double getCircumference() {
//
//    }
//}

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // dien tich
    public double getArea() {
        return Math.PI * radius * radius;
    }

//    chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // ghi de toString
    @Override
    public String toString() {
        return "bai1_2.Circle[radius=" + radius + "]";
    }
}
