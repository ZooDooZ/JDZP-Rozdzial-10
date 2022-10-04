package Exercise1;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
//        Employee employee1 = new Employee("John", "AR123", "12.04.2020");
//        ProductionWorker productionWorker1 = new ProductionWorker(2, 25);
//
//        System.out.println(employee1);
//        System.out.print("Shift: ");
//        productionWorker1.printYourShift(productionWorker1.getShift());
//
//        // Exercise 2
//        ShiftSupervisor shiftSupervisor1 = new ShiftSupervisor(230.5, 105.10);
//        System.out.println(shiftSupervisor1);

        // Exercise 3
        TeamLeader teamLeader1 = new TeamLeader();

        teamLeader1.setMonthlyBonusAmount(100);
        teamLeader1.setRequiredNumOfCourse(20);
        teamLeader1.setHoursOfTheCompletedCourse(10);

        System.out.println(teamLeader1);
    }
}
