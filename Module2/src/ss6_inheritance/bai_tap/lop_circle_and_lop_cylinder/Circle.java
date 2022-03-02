package ss6_inheritance.bai_tap.lop_circle_and_lop_cylinder;

public class Circle {
    private double radius = 1;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "The Circle with radius = " + this.getRadius() + ", color:" + this.getColor();
    }
}
