package Case_study.controllers;

import Case_study.services.*;
import Case_study.services.Impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    FacilityService facilityService = new FacilityServiceImpl();
    BookingService bookingService = new BookingServiceImpl();
    ContactService contactService = new ContactServiceImpl();

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
                    System.out.println("Mời chọn chức năng:");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
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
                            System.out.println("Chương trình đang thoát...");
                        default:
                            System.out.println("Lỗi!Vui lòng nhập lại");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi!Vui lòng nhập lại");
            }
        }
    }

    private void managePromotion() {
        System.out.println("Promotion Management\n" +
                "1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        System.out.println("Mời bạn chọn chức năng:");
        int choicePro = Integer.parseInt(scanner.nextLine());
        switch (choicePro) {
            case 3:
                disPlayMenu();
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
        System.out.println("Mời bạn chọn chức năng:");
        int choiceBooking = Integer.parseInt(scanner.nextLine());
        switch (choiceBooking) {
            case 1:
                bookingService.addNew();
                break;
        }
    }

    private void manageFacility() {
        boolean flag = true;
        while (flag) {
            System.out.println("Facility Management\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("Mời bạn chọn chức năng:");
            int choiceFac = Integer.parseInt(scanner.nextLine());
            switch (choiceFac) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.addNew();
                    break;
                case 3:
                    facilityService.displayMaintenanceList();
                    break;
                case 4:
                    disPlayMenu();
            }
        }
    }

    private void manageCustomer() {
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Management\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.println("Mời bạn chọn chức năng:");
            int choiceCus = Integer.parseInt(scanner.nextLine());
            switch (choiceCus) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    disPlayMenu();
            }
        }
    }
    private void manageEmployee() {
        boolean flag = true;
        while (flag) {
            System.out.println("Employee Management\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            System.out.println("Mời bạn chọn chức năng:");
            int choiceEmp = Integer.parseInt(scanner.nextLine());
            switch (choiceEmp) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    disPlayMenu();
            }
        }
    }
}

