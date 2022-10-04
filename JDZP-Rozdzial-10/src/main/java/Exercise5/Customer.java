package Exercise5;

public class Customer extends Person{

    private String clientNumber;
    private boolean isWantToBeOnMailList;

    public Customer(String clientNumber, boolean isWantToBeOnMailList) {
        this.clientNumber = clientNumber;
        this.isWantToBeOnMailList = isWantToBeOnMailList;
    }

    public Customer(String surname, String adres, String phoneNumber, String clientNumber) {
        super(surname, adres, phoneNumber);
        this.clientNumber = clientNumber;

    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public boolean isWantToBeOnMailList() {
        return isWantToBeOnMailList;
    }

    public void setWantToBeOnMailList(boolean wantToBeOnMailList) {
        isWantToBeOnMailList = wantToBeOnMailList;
    }

    public String toString(){
        return "Surname: " + getSurname() + "\nAdres: " + getAdres()+ "\nPhone number: " + getPhoneNumber()+
                "\nClient number: " + clientNumber;
    }
}
