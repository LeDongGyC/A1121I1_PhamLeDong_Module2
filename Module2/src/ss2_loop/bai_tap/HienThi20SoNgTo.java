package ss2_loop.bai_tap;

public class HienThi20SoNgTo {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.print(num + " ");
            }
            num++;
        }
    }
}

