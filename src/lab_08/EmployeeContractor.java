package lab_08;

public class EmployeeContractor extends Employee{

    @Override
    public int getSalary() {
        return 40000;
    }
    @Override
    public String getEmployeeType() {
        return super.getEmployeeType();
    }
}
