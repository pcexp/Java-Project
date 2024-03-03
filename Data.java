public class Data {
    private Integer userId;
    private Integer movieId;
    private Integer rate;


    public Data(){
    }

    public Data(Integer userId , Integer movieId , Integer rate){
        this.userId = userId;
        this.movieId = movieId;
        this.rate = rate;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public Integer getRate() {
        return rate;
    }

}