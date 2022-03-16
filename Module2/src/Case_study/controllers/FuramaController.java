package Case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    public void disPlayMenu() {
        while (true) {
            try {
                int choice;
                while (true) {
                    System.out.println("-------------Menu------------");
                    System.out.println("1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n"
                    );
                    System.out.println("Moi chon chuc nang: ");
                     choice = Integer.parseInt(scanner.nextLine());
                     switch (choice){
                         case 1:
                             manageEmployee();
                             break;
                         case 2:
                             manageCustomer();
                             break;
                         case 3:
                             manageFacility();
                             break;
                         case 4:
                             manageBooking();
                             break;
                         case 5:
                             managePromotion();
                             break;
                         case 6:
                             System.exit(6);
                             System.out.println("Chuong trinh dang thoat...");
                         default:
                             System.out.println("Loi.Vui long nhap lai !");


                     }
                }
            } catch (NumberFormatException e){
                System.out.println("Loi.Vui long nhap lai !");
            }
        }
    }

    private void managePromotion() {
        System.out.println("Promotion Management\n" +
                "1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        System.out.println("Moi ban chon chuc nang: ");
        int choicePro = Integer.parseInt(scanner.nextLine());
        switch (choicePro){

        }
    }

    private void manageBooking() {
        System.out.println("Booking Managerment\n" +
                "1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        System.out.println("Moi ban chon chuc nang: ");
        int choiceBooking = Integer.parseInt(scanner.nextLine());
        switch (choiceBooking){

        }
    }

    private void manageFacility() {
        System.out.println("Facility Management\n" +
                "1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        System.out.println("Moi ban chon chuc nang: ");
        int choiceFac = Integer.parseInt(scanner.nextLine());
        switch (choiceFac){

        }
    }

    private void manageCustomer() {
        System.out.println("Customer Management\n" +
                "1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        System.out.println("Moi ban chon chuc nang: ");
        int choiceCus = Integer.parseInt(scanner.nextLine());
        switch (choiceCus) {

        }
    }
    private void manageEmployee() {
        System.out.println("Employee Management\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        int choiceEmp = Integer.parseInt(scanner.nextLine());
        switch (choiceEmp){
            case 1:
        }
    }

}
