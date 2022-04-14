package HW6;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.person.name = "Maria";
        Employee employee2 = new Employee();
        employee2.person.name = "Maria";

        System.out.println(employee1.isSameName(employee2));
    }
}
