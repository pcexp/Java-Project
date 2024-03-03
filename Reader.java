import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Reader {

    private static final String USER_FILE_PATH = "data/u.user";
    private static final String MOVIE_FILE_PATH = "data/u.item";
    private static final String OCCUPATION_FILE_PATH = "data/u.occupation";
    private static final String GENRE_FILE_PATH = "data/u.genre";
    private static final String DATA_FILE_PATH = "data/u.data";

    public List<User> readUser() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(USER_FILE_PATH));
        List<User> userContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] userInfo = line.split("\\|");

            Integer id = Integer.parseInt(userInfo[0]);
            Integer age = Integer.parseInt(userInfo[1]);
            Character gender = userInfo[2].charAt(0);
            Integer occupationId = Integer.parseInt(userInfo[3]);

            User user = new User(id, age, gender, occupationId);
            userContainer.add(user);
        }
        return userContainer;
    }


    public List<Movie> readMovie() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(MOVIE_FILE_PATH));
        List<Movie> movieContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] movieInfo = line.split("\\|");

            Integer id = Integer.parseInt(movieInfo[0]);
            String title = movieInfo[1];
            String releaseDate = movieInfo[2];
            String imdbLink = movieInfo[3];
            ArrayList<String> genreIdList = new ArrayList<>();

            for (int i = 4; i < movieInfo.length; i++) {
                genreIdList.add(movieInfo[i]);
            }

            Movie movie = new Movie(id, title, releaseDate, imdbLink, genreIdList);
            movieContainer.add(movie);
        }
        return movieContainer;
    }

    public List<Occupation> readOccupation() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(OCCUPATION_FILE_PATH));
        List<Occupation> occupationContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] occupationInfo = line.split("\\|");

            Integer id = Integer.parseInt(occupationInfo[0]);
            String name = occupationInfo[1];

            Occupation occupat = new Occupation(id, name);
            occupationContainer.add(occupat);

        }

        return occupationContainer;
    }


    public List<Genre> readGenre() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(GENRE_FILE_PATH));
        List<Genre> genreContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] genreInfo = line.split("\\|");

            String genre = genreInfo[0];

            Genre genreName = new Genre(genre);
            genreContainer.add(genreName);
        }

        return genreContainer;

    }

    public List<Data> readData() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(DATA_FILE_PATH));
        List<Data> dataContainer = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] dataInfo = line.split("\t");

            Integer userId = Integer.parseInt(dataInfo[0]);
            Integer movieId = Integer.parseInt(dataInfo[1]);
            Integer rate = Integer.parseInt(dataInfo[2]);

            Data data = new Data(userId, movieId, rate);
            dataContainer.add(data);

        }

        return dataContainer;

    }
}