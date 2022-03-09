package ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss7_asbtract_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()*percent/100);
    }

    public String toString(){
        return "Square with side " + getSide() + " which a subclass of" + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("The Square is filled!");
    }
}
