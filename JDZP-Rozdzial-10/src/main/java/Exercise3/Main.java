package Exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John","Lenon", LocalDate.of(1990,6,18));
        Manager manager1 = new Manager("Michael","Jordan", LocalDate.of(1984,6,18), "IT");

        employee1.goToVacation();
        manager1.goToVacation();

        manager1.getBonus();

        System.out.println(employee1);
        System.out.println(manager1);
    }
}
