import java.util.ArrayList;

public class Movie {
    private Integer id;
    private String title;
    private String releaseDate;
    private String imdbLink;
    private ArrayList<String> genreIdList;
    private ArrayList<String> genreList;
    private float averageRate;

    public Movie(){
    }

    public Movie(Integer id, String title, String releaseDate, String imdbLink , ArrayList<String> genreIdList) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.imdbLink = imdbLink;
        this.genreIdList = genreIdList;
    }



    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public ArrayList<String> getGenreIdList() {
        return genreIdList;
    }

    public ArrayList<String> getGenreList() {
        return genreList;
    }

    public float getAverageRate() {
        return averageRate;
    }



}
