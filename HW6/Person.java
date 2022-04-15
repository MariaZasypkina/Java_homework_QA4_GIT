package HW6;
public class Person {
    String name;
    int age;
    String gender;

    public String getName() {
        if (gender.equalsIgnoreCase("M")) {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
        }
    }
