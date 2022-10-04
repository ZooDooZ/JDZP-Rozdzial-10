package Exercise3;

import java.time.LocalDate;

public class Employee {

    String name;
    String surname;
    LocalDate dateOfBirthday;
    String PESEL;

    public Employee(String name, String surname, LocalDate dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
    }

    public void goToVacation(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}
