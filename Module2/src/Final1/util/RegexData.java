package Final1.util;

import Case_study.util.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);
    public static String regexStr(String temp, String regex, String err) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(err);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexYear(String temp, String regex){
        boolean check = true;
        while (check){
            try{
                if (Pattern.matches(regex, temp)){
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current<2){
                        check = false;
                    } else {
                        throw new AgeException("Lỗi.Không vượt quá 2 năm");
                    }
                } else {
                    throw new AgeException("Lỗi.Không vượt quá 2 năm");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
