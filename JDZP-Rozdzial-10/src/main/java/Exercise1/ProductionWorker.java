package Exercise1;

public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyRate;

    public ProductionWorker(){

    }

    public ProductionWorker(int shift, double hourlyRate){
        this.shift = shift;
        this.hourlyRate = hourlyRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void printYourShift(int shift){
        if(shift == 1){
            System.out.println("Dzienna zmiana.");
        } else if (shift == 2){
            System.out.println("Nocna zmiana.");
        } else {
            System.out.println("Błąd!");
        }
    }
}
