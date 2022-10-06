package Exercise7;

public class Main {
    public static void main(String[] args) {

        Ship[] arrayShips =  new Ship[3];

        arrayShips[0] = new Ship("Mary Jane","1984");
        arrayShips[1] = new CargoShip("Black Pearl", "1979", 40);
        arrayShips[2] = new CruiseShip("Titanic", "1991", 2000);

        for(int i = 0; i < arrayShips.length; i++){
            System.out.println(arrayShips[i]);
            System.out.println();
        }



    }
}
