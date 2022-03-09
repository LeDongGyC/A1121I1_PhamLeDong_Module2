package ss7_asbtract_and_interface.thuc_hanh.trien_khai_interface_comparator_so_sanh_cac_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("red", true, 2);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
