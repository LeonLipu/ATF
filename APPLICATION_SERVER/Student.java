package APPLICATION_SERVER;

/**
 * Created by brahmanandakar on 18/07/17.
 */
public class Student {

    String id;
    String firstname;
    String lastname;
    String standard;

    public Student(String id, String firstname, String lastname, String standard) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.standard = standard;
    }

    //added for automatic type casting of from json to object
    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getStandard() {
        return standard;
    }
}
