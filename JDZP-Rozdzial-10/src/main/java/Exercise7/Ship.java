package Exercise7;

public class Ship {

    String shipName;
    String constructionYear;

    public Ship(String shipName, String constructionYear) {
        this.shipName = shipName;
        this.constructionYear = constructionYear;
    }

    public String getShipName() {
        return shipName;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    @Override
    public String toString() {
        return "Ship name: " + shipName + "\nYear of construction: " + constructionYear;
    }
}
