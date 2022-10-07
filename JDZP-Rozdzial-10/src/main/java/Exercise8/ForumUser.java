package Exercise8;

public class ForumUser extends User{

    String userName;
    int numberOfPosts;
    boolean logged;

    public ForumUser(String name, String surname, String gender, String year, String email, String userName,
                     int numberOfPosts, boolean logged) {
        super(name, surname, gender, year, email);
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.logged = logged;
    }

    public void publicationPost(){
        System.out.println("The post has been published");
        numberOfPosts++;
    }

    public void logging(){
        System.out.println("Logging in system");
        logged = true;
    }

    public void deleteAcc(){
        System.out.println("Account deleted");
        logged = false;
        this.name = "deleted";
        this.surname = "deleted";
        this.gender = "deleted";
        this.numberOfPosts = 0;
        this.email = "deleted";
        this.year = "deleted";
    }

    public void commentPost(){
        System.out.println("The post has been commented");
    }

    public String toString(){
        return "Name: " + name + "\nUser name: " + userName + "\nGender: " + gender + "\nE-mail: " + email +
                "\nNumber of post inserted: " + numberOfPosts + "\nLogin status: " + logged;
    }
}
