package ss7_asbtract_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Circle;
import ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Rectangle;
import ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Shape;
import ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            if (shape instanceof Square) ((Square) shape).howToColor();
        }
    }
}
