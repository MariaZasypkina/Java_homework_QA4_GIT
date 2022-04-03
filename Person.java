public class Person {
    String name;
    int age;
    String gender;

    public String getName(){
        if (this.gender.equals("male")) {
            return "Mr. " + name;
        }
        if (this.gender.equals("female")) {
            return "Mrs. " + name;
        }
        else {
            return "Data entry error";
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Maria Zasypkina";
        person.gender = "female";
        person.age = 42;

        System.out.println(person.getName());

        Person person2 = new Person();
        person2.name = "Ivan Ivanov";
        person2.gender = "male";
        person2.age = 43;

        System.out.println(person2.getName());

        Person person3 = new Person();
        person3.name = "Piter Parker";
        person3.gender = "spider";
        person3.age = 26;

        System.out.println(person3.getName());
    }
}
