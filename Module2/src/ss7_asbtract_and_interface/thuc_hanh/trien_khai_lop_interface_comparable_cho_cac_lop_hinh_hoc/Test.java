package ss7_asbtract_and_interface.thuc_hanh.trien_khai_lop_interface_comparable_cho_cac_lop_hinh_hoc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[2];
        comparableCircles[0] = new ComparableCircle(2);
        comparableCircles[1] = new ComparableCircle(" red", true, 2 );
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }

        Arrays.sort(comparableCircles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
    }
}
