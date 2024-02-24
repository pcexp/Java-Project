import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<User> users = Reader.readUser();
        System.out.println(users);



    }




}
