import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public Main()  {
    }

    public static void main(String[] args) throws FileNotFoundException {

        List< User> Users = new Reader().readUser();
        System.out.println(Users);


    }




}
