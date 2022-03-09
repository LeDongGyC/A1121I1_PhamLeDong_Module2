package ss7_asbtract_and_interface.thuc_hanh.trien_khai_interface_comparator_so_sanh_cac_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius())
            return 1;
        else if (c1.getRadius() > c2.getRadius())
            return -1;
        else
            return 0;
    }


}
