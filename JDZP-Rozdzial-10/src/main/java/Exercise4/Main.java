package Exercise4;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Logger logger = new FileLogger();
        logger.log("Testuje logera");

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
    }
}
