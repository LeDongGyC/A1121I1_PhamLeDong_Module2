package Case_study.services.Impl;

import Case_study.models.Booking;
import Case_study.models.Customer;
import Case_study.models.Facility;
import Case_study.models.Villa;
import Case_study.services.BookingService;
import Case_study.services.CustomerService;
import Case_study.util.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

//    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
//        customerList.add(new Customer("Pham le Dong", "17/05/2003", "Nam", "123456789",
//                'dong@gmail', "033713213", "001", "Gold", "DN"));
//        customerList.add(new Customer("Vo Quoc Thai", "02/08/2003", "Nam", "123456789",
//                'thai@gmail', "0337166643", "002", "Silver", "DN"));
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.display();
    }



    @Override
    public void addNew() {
        System.out.println(chooseBooking());
    }


    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    public Customer chooseBooking(){
        CustomerService customerService = new CustomerServiceImpl();
        customerService.display();
        List<Customer> customerList1 = CustomerServiceImpl.customerList;
        Customer customer = null;
        boolean check = true;
        while (check){
            System.out.println("Mời nhập ID cần booking: ");
            String id = scanner.nextLine();
            for (Customer customer1 : customerList1){
//                System.out.println(customer1.toString());
                if (customer1.getMaKH().equals(id)){
                    customer = customer1;
                    check = false;
                }
            }
        }
        return customer;
    }

   public Facility chooseFacility(){
        Facility facility = null;
        boolean flag = true;
        while (flag){
            System.out.println("Mời chọn Facility cần booking:\n " +
                    "1.Villa\n" +
                    "2.House\n" +
                    "3.Room\n");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean flag1 = true;
            switch (choice){
                case 1:
                    VillaService villaService = new VillaService();
                    villaService.display();
                    while (flag1){
                        System.out.println("Chọn tên villa cần booking: ");
                        String chooseVilla = scanner.nextLine();
//                        for (Villa villa : )
                    }
            }
        }
        return facility;
   }
}
