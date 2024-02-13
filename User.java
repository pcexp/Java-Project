
public class User {
    int id;
    int age;
    char gender;
    int occupationId;
    String occupation;
    float averageRating;


public void displayUser( User user){
    System.out.println("User id : " + user.id );
    System.out.println("User age : " + user.age );
    System.out.println("User gender : " + user.gender );
    System.out.println("User occupation id  : " + user.occupationId );
    System.out.println("User occupation : " + user.occupation );
    System.out.println("User average rate : " + user.averageRating );
    System.out.println();
}

}
