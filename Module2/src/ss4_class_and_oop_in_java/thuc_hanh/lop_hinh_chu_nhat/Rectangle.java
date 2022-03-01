package ss4_class_and_oop_in_java.thuc_hanh.lop_hinh_chu_nhat;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
