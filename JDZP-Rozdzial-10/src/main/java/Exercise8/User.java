package Exercise8;

public class User {

    String name;
    String surname;
    String gender;
    String year;
    String email;

    public User(String name, String surname, String gender, String year, String email) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.year = year;
        this.email = email;
    }

    public void logging(){
        System.out.println("Logging in system");
    }

    public void deleteAcc(){
        System.out.println("Account deleted");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }
}
