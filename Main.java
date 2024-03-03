import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<User> users = new Reader().readUser();
        List<Movie> movies = new Reader().readMovie();
        List<Occupation> occupations = new Reader().readOccupation();
        List<Genre> genres = new Reader().readGenre();
        List<Data> data = new Reader().readData();

        System.out.println(users.get(8).getGender());
        System.out.println(movies.get(6).getTitle());
        System.out.println(occupations.get(14).getName());
        System.out.println(genres.get(8).getGenre());
        System.out.println(data.get(8).getRate());

    }

}