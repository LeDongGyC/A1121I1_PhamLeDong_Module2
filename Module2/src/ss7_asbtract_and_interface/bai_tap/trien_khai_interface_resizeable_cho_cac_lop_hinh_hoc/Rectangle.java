package ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Rectangle extends Shape implements Resizeable{
    private double length = 1;
    private double width = 1;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle with length " + this.getLength() + " and " + " width " + this.getWidth() + " ,which is a subclass of " + super.toString();

    }

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength()*percent/100);
        this.setWidth(this.getWidth()*percent/100);
    }
}
