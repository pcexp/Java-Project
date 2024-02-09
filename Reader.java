import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;

public class Reader {
    // METHOD 1
    public ArrayList<ArrayList<String>> readUser(String fileName) throws IOException {

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        ArrayList< ArrayList<String> > userStorage1 = new ArrayList<>();

        while (scanner.hasNextLine()) {
            //process each line
            String line = scanner.nextLine();
            List<String> separator = Arrays.asList(line.split("\\|"));
            ArrayList<String> myArray = new ArrayList<String>(separator);
            userStorage1.add(myArray);
        }

        scanner.close();
        return userStorage1;
    }
}
