package Exercise5;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jordan", "Illinois", "789099982",
                "AR1234");

        PreferredCustomer preferredCustomer1 = new PreferredCustomer("Jordan", "Illinois",
                "789099982","AR1234", 2300);

        System.out.println(preferredCustomer1);
    }
}
