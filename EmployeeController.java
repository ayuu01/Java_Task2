package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.util.*;

public class EmployeeController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDatabase employee=new EmployeeDatabase();

        List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();

        employee.storeEmployeeDetail(employeeList);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee details:");
        for(EmployeeEntity empDetail:employeeList)
            System.out.println(empDetail);




        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee details after sorting based on their employee id:");
        Collections.sort(employeeList);
        for(EmployeeEntity empDetail:employeeList)
            System.out.println(empDetail);



        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee details after sorting based on their name:");
        Collections.sort(employeeList,new Comparator<EmployeeEntity>(){
            public int compare(EmployeeEntity o1,EmployeeEntity o2){
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        for(EmployeeEntity empDetail:employeeList)
            System.out.println(empDetail);



        System.out.println("---------------------------------------------------------------------");
        System.out.println("Unique Employee details:");

        HashSet<EmployeeEntity> employeeSet  = new HashSet<>();
        for(EmployeeEntity empDetail:employeeList){
            employeeSet.add(empDetail);
        }
        for(EmployeeEntity empDetail:employeeSet)
            System.out.println(empDetail);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("Unique employee details after sorting based on their name:");

        List<EmployeeEntity> uniqueEmployeeList = new ArrayList<EmployeeEntity>();
        for(EmployeeEntity empDetail:employeeSet){
            uniqueEmployeeList.add(empDetail);
        }


        Collections.sort(uniqueEmployeeList,new Comparator<EmployeeEntity>(){
            public int compare(EmployeeEntity o1,EmployeeEntity o2){
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        for(EmployeeEntity empDetail:uniqueEmployeeList)
            System.out.println(empDetail);




        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee details stored in map:");
        HashMap<Integer,EmployeeEntity> map  = new HashMap<>();
        employee.employeeDetailInMap(map);

        System.out.println(map);



        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter employee id to fetch his details:");
        int empId=sc.nextInt();
        if(map.containsKey(empId))
            System.out.println(map.get(empId));



        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee details stored in json format:");

        JSONArray jsonArray = new JSONArray();
        for (int j = 0; j < employeeList.size() ; j++) {
            JSONObject emps = new JSONObject();
            JSONObject empObj =  new JSONObject();
            
            emps.put("id", employeeList.get(j).getEmployeeId());
            emps.put("name",  employeeList.get(j).getEmployeeName());
            emps.put("salary",  employeeList.get(j).getEmployeeSalary());
            
            empObj.put("empList", emps);
            jsonArray.add(empObj);
        }

        try (FileWriter file = new FileWriter("your path")) {
            file.write(jsonArray.toString());
            System.out.println("Success...");
            System.out.println("\nIn json format: " + jsonArray);
        } catch(Exception e){
            System.out.println(e);
        }

    }
}