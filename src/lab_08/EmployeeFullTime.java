package lab_08;

public class EmployeeFullTime extends Employee{

    @Override
    public int getSalary() {
        return 50000;
    }
    @Override
    public String getEmployeeType() {
        return super.getEmployeeType();
    }
}
