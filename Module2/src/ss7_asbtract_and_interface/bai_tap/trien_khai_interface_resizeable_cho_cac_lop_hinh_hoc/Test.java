package ss7_asbtract_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(4);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("After resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                ((Circle) shape).resize(Math.random());
                System.out.println(shape);
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(Math.random());
                System.out.println(shape);
            } else {
                ((Square) shape).resize(Math.random());
                System.out.println(shape);
            }
        }
    }
}
