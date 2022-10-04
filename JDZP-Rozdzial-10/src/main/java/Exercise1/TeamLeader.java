package Exercise1;

public class TeamLeader extends ProductionWorker {

    private double monthlyBonusAmount;
    private double requiredNumOfCourse;
    private double hoursOfTheCompletedCourse;

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public double getRequiredNumOfCourse() {
        return requiredNumOfCourse;
    }

    public void setRequiredNumOfCourse(double requiredNumOfCourse) {
        this.requiredNumOfCourse = requiredNumOfCourse;
    }

    public double getHoursOfTheCompletedCourse() {
        return hoursOfTheCompletedCourse;
    }

    public void setHoursOfTheCompletedCourse(double hoursOfTheCompletedCourse) {
        this.hoursOfTheCompletedCourse = hoursOfTheCompletedCourse;
    }

    public String toString(){
        return "Monthly bonus amount: " + monthlyBonusAmount + "\nRequired numbers of course: " + requiredNumOfCourse +
                "\nHours of the completed course: " +  hoursOfTheCompletedCourse;
    }
}
