import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        //System.out.println(allUsers());
        ArrayList< User > userStorage4 = allUsers();
        System.out.println(userStorage4);

        new User().displayUser(userStorage4.get(10));

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
