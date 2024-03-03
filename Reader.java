import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Reader {

    private static final String USER_FILE_PATH = "data/u.user";

    public List<User> readUser() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(USER_FILE_PATH));
        List<User> userContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] userInfos = line.split("\\|");
            Integer id = Integer.parseInt(userInfos[0]);
            Integer age = Integer.parseInt(userInfos[1]);
            Character gender = userInfos[2].charAt(0);
            Integer occupationId = Integer.parseInt(userInfos[3]);

            User user = new User(id, age, gender, occupationId);
            userContainer.add(user);
        }
        return userContainer;
    }

}