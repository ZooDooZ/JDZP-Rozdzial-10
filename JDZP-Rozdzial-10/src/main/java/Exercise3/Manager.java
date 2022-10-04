package Exercise3;

import java.time.LocalDate;

public class Manager extends Employee{

    private String department;

    public Manager(String name, String surname, LocalDate dateOfBirthday,String department) {
        super(name, surname, dateOfBirthday);
        this.department = department;
    }

    public void getBonus(){

    }

    @Override
    public String toString() {
        return "Manager{" +
                "department= " + department + "\'" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}
