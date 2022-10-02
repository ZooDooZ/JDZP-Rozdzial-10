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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
