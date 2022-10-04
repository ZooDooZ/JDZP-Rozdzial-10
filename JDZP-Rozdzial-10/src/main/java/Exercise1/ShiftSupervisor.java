package Exercise1;

public class ShiftSupervisor extends Employee { //nadzorca zmiany

    private double annualSalary; // roczne wynagrodzenie
    private double annualBonus; // roczna premia

    private Employee employee;

    public ShiftSupervisor(double annualSalary, double annualBonus){
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    @Override
    public String toString(){
        return "\nSupervisor: " + "\nAnnual salary: " + annualSalary + "\nAnnual bonus: " + annualBonus;
    }
}
