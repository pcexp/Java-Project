public class User {
    int id;
    int age;
    char gender;
    int occupationId;
    String occupation;
    float averageRating;

    public User(){
    }

    public User(int id, int age, char gender, int occupationId, String occupation, float averageRating) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.occupationId = occupationId;
        this.occupation = occupation;
        this.averageRating = averageRating;
    }
}
