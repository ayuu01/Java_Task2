package com.company;
import java.util.HashMap;
import java.util.List;
public class EmployeeDatabase {


    static EmployeeEntity employee1 = new EmployeeEntity(1001, "Raman", 10000);
    static EmployeeEntity employee2 = new EmployeeEntity(1002, "Rohit", 20000);
    static EmployeeEntity employee3 = new EmployeeEntity(1003, "Manoj", 12000);
    static EmployeeEntity employee4 = new EmployeeEntity(1004, "Amit", 12000);
    static EmployeeEntity employee5 = new EmployeeEntity(1005, "Kabit", 11500);
    static EmployeeEntity employee6 = new EmployeeEntity(1006, "Laxman", 11500);
    static EmployeeEntity employee7 = new EmployeeEntity(1007, "Dipesh", 10000);
    static EmployeeEntity employee8 = new EmployeeEntity(1008, "Amit", 10000);
    static EmployeeEntity employee9 = new EmployeeEntity(1009, "Manoj", 17500);
    static EmployeeEntity employee10 = new EmployeeEntity(1010, "Rohit", 21000);
    static EmployeeEntity employee11 = new EmployeeEntity(1003, "Manoj", 15000);
    static EmployeeEntity employee12 = new EmployeeEntity(1002, "Rohit", 20000);


    public static void storeEmployeeDetail(List<EmployeeEntity> employeeList) {

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);
        employeeList.add(employee11);
        employeeList.add(employee12);


    }


    public static void employeeDetailInMap(HashMap<Integer, EmployeeEntity> map) {

        map.put(employee1.getEmployeeId(), employee1);
        map.put(employee2.getEmployeeId(), employee2);
        map.put(employee3.getEmployeeId(), employee3);
        map.put(employee4.getEmployeeId(), employee4);
        map.put(employee5.getEmployeeId(), employee5);
        map.put(employee6.getEmployeeId(), employee6);
        map.put(employee7.getEmployeeId(), employee7);
        map.put(employee8.getEmployeeId(), employee8);
        map.put(employee9.getEmployeeId(), employee9);
        map.put(employee10.getEmployeeId(), employee10);
        map.put(employee11.getEmployeeId(), employee11);
        map.put(employee12.getEmployeeId(), employee12);

    }

}