package Case_study.util;

import Case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployeeListToCSV {
    public static void writeEmployeeListToCSV(String path, List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            stringList.add(employeeList.get(i).toEmployCSV());
        }
        ReadAndWriteStringListToCSV.writeStringListToCSV(path, stringList, append);
    }

    public static List<Employee> readEmployeeListToCSV(String path) {
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }
}
