package ss13_search_algorithms.bai_tap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Moi ban nhat 1 chuoi bat ki: ");
        String string = scanner.nextLine();
        int length = string.length();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 0; j < length; j++) {
                if (string.charAt(j)>list.getLast()){

                }
            }
        }
    }
}
