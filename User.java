public class User {
    private Integer id;
    private Integer age;
    private Character gender;
    private Integer occupationId;
    public String occupation;



    public User(){
    }

    public User(Integer id, Integer age, Character gender, Integer occupationId) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.occupationId = occupationId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getOccupationId() {
        return occupationId;
    }




}
