package Case_study.util;

import Case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomerListToCSV {
    public static void writeCustomerListToCSV(String path, List<Customer> customers, boolean append){
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            stringList.add(customers.get(i).toCustomerCSV());
        }
        ReadAndWriteStringListToCSV.writeStringListToCSV(path, stringList, append);
    }

    public static List<Customer> readCustomerListToCSV(String path){
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (String string : stringList){
            arr = string.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }
}
