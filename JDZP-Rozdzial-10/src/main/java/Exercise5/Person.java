package Exercise5;

public class Person {

    private String surname;
    private String adres;
    private String phoneNumber;

    public Person(){

    }
    public Person(String surname, String adres, String phoneNumber) {
        this.surname = surname;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Surname: " + surname + "\nAdres: " + adres + "\nPhone number: " + phoneNumber;
    }
}
