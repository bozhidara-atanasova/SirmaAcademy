public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;


    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public String getInfo() {
        return firstName + " " + lastName + " is " + age + " years old";
    }
}
