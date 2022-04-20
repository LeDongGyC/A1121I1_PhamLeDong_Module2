package Case_study.util;

import Case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayBatdau1 = LocalDate.parse(o1.getNgayBatDau(), dateTimeFormatter);
        LocalDate ngayBatdau2 = LocalDate.parse(o1.getNgayBatDau(), dateTimeFormatter);
        LocalDate ngayKetThuc1 = LocalDate.parse(o1.getNgayKetThuc(), dateTimeFormatter);
        LocalDate ngayKetThuc2 = LocalDate.parse(o1.getNgayKetThuc(), dateTimeFormatter);
        if (ngayBatdau1.compareTo(ngayBatdau2) > 0){
            return 1;
        } else if (ngayBatdau1.compareTo(ngayBatdau2)<0){
            return -1;
        } else {
            if (ngayKetThuc1.compareTo(ngayKetThuc2)>0){
                return 1;
            } else if (ngayKetThuc1.compareTo(ngayKetThuc2)<0){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
