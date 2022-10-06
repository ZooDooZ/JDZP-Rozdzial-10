package Exercise7;

public class CruiseShip extends Ship{

    int maxNumberOfPassenger;

    public CruiseShip(String name, String constructionYear, int maxNumberOfPassenger){
        super(name, constructionYear);
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public String toString(){
        return "Ship name: " + shipName + "\nNumber of passenger: " + maxNumberOfPassenger;
    }
}
