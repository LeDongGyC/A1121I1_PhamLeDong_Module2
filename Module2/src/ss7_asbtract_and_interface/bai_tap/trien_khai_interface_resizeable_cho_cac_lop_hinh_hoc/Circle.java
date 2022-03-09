package ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape implements Resizeable {
    private double radius = 1;

    public  Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "The circle with radius " + this.getRadius() + " which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*percent/100);
    }
}
