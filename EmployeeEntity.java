package com.company;
import java.util.*;


    public class EmployeeEntity implements Comparable<EmployeeEntity>{
        private int employeeId;
        private String employeeName;
        private int employeeSalary;

        EmployeeEntity(int employeeId,String employeeName, int employeeSalary){
            this.employeeId=employeeId;
            this.employeeName=employeeName;
            this.employeeSalary=employeeSalary;
        }

        public int getEmployeeId(){
            return employeeId;
        }
        public int getEmployeeSalary(){
            return employeeSalary;
        }
        public String getEmployeeName(){
            return employeeName;
        }

        public String toString(){
            return employeeId+" "+employeeName+" "+employeeSalary;
        }

        public int compareTo(EmployeeEntity o){
            return this.employeeId-o.employeeId;
        }


        public int hashCode(){
            return this.employeeId;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;

            EmployeeEntity other = (EmployeeEntity) obj;
            return Objects.equals(employeeId, other.employeeId);
        }


    }



