import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Reader {

    private static final String USER_FILE_PATH = "data/u.user";

    public List<User> readUser() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(USER_FILE_PATH));
        List<User> userContainer = new ArrayList<User>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] userInfos = line.split("\\|");
            User user = new User();
            user.id = Integer.parseInt(userInfos[0]);
            user.age = Integer.parseInt(userInfos[1]);
            user.gender = userInfos[2].charAt(0);
            user.occupationId = Integer.parseInt(userInfos[3]);

            userContainer.add(user);
        }
        return userContainer;
    }

}

