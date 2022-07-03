package question2;

public class Person {
    private String lastName;
    private String name;
    private String fathersName;


    public Person(String lastName, String name, String fathersName) {
        this.lastName = lastName;
        this.name = name;
        this.fathersName = fathersName;
    }

    public String getFullName(){
        return this.lastName + " " + this.name + " " + this.fathersName;
    }
}
