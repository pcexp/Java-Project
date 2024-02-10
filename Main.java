import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        ArrayList< User > userStorage4 = allUsers();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user sequence number to display information : " );
        int userId =  scanner.nextInt();
        new User().displayUser(userStorage4.get(userId));
    }




    static ArrayList<User> allUsers() throws IOException {
    String userDataFile = "data/u.user";
    ArrayList< ArrayList<String> > userStorage2 = new Reader().readUser(userDataFile);


        ArrayList<User> userStorage3 = new ArrayList<>();

        for ( ArrayList<String> oneUser : userStorage2) {

            User user = new User();
            user.id =  Integer.parseInt(oneUser.get(0));
            user.age = Integer.parseInt(oneUser.get(1));

            // CONTINUE

            userStorage3.add(user);
    }
return userStorage3;
}



}
