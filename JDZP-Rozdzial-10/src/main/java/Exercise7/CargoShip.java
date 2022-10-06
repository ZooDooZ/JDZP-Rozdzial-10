package Exercise7;

public class CargoShip extends Ship{

    int capacityTon;

    public CargoShip(String name, String constructionYear, int capacityInTon){
        super(name,constructionYear);
        this.capacityTon = capacityInTon;
    }

    public int getCapacityInTon() {
        return capacityTon;
    }

    public String toString(){
        return "Ship name: " + shipName + "\nLoad capacity in tonnes: " + capacityTon;
    }
}
