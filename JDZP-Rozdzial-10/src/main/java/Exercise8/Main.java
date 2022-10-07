package Exercise8;

public class Main {
    public static void main(String[] args) {

        ForumUser forumUser1 = new ForumUser("Michael", "Jordan","male","52",
                "michaeljordan@gmai.com", "mjordan",0, false);

        System.out.println("Information about forum user: ");
        System.out.println(forumUser1);

        System.out.println();
        forumUser1.logging();

        System.out.println();
        forumUser1.publicationPost();
        System.out.println();
        forumUser1.publicationPost();
        System.out.println();
        forumUser1.publicationPost();

        System.out.println();
        System.out.println("Information about forum user: ");
        System.out.println(forumUser1);

        System.out.println();
        System.out.println("User delete account: ");
        forumUser1.deleteAcc();

        System.out.println();
        System.out.println("Information about forum user: ");
        System.out.println(forumUser1);

    }
}
