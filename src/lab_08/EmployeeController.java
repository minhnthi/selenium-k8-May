package lab_08;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {

        Employee employeeFullTime = new EmployeeFullTime();
        Employee employeeContractor = new EmployeeContractor();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeContractor);
        employeeList.add(employeeContractor);

        int salary = totalSalary(employeeList);
        System.out.println("This Is Total Salary: " + salary);
    }
    public static int totalSalary(List<Employee> employeeList) {
        int total = 0;
        for (Employee employee : employeeList) {
            total = total + employee.getSalary();
            // System.out.println(employee.getSalary());
        }
        return total;
    }

}
