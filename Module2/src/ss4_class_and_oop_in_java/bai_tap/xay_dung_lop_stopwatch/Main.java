package ss4_class_and_oop_in_java.bai_tap.xay_dung_lop_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());
//        long count = 0;
//        for (int i = 0; i < 10000; i++) {
//            count+=i;
//        }
        System.out.println("Thoi gian ket thuc: " + stopWatch.getEndTime());
        System.out.println("Thoi gian troi qua: " + stopWatch.getElapsedTime());
    }
}
