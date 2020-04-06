package hello;

public class Student {
    public String name;
    public String lastname;
    public String birthdate;

    public void createStudent(String name, String lastname, String bd) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = bd;
    }
}