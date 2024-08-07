package service;

import Hospital.Employee.Employee;

import java.util.List;

public class EmployeeService {

    public static void getPersonDetails(List<Employee> employeeList) {
        for(Employee person: employeeList){
            displayEmployeeDetails(person);
        }
    }

    public static void displayEmployeeDetails(Employee employee) {
        employee.displayEmployeeDetails();
    }
}
