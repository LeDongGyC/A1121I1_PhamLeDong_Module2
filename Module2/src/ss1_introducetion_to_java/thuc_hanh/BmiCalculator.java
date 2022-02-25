package ss1_introducetion_to_java.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight,height;
        System.out.println("Can nang cua ban(kg): ");
        weight = scanner.nextFloat();
        System.out.println("Chieu cao cua ban(m): ");
        height = scanner.nextFloat();
        double bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("normal");
        }else if (bmi < 30){
            System.out.println("overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
