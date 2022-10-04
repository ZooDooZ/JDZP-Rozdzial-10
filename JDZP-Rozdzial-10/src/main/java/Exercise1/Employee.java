package Exercise1;

public class Employee {
    private String name;
    private String employeeId;
    private String dateOfEmployment;

    public Employee(){

    }

    public Employee(String name, String employeeId, String dateOfEmployment) {
        this.name = name;
        this.employeeId = employeeId;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + "\nEmployee ID: " + employeeId + "\nDate of employment: " + dateOfEmployment;
    }
}
