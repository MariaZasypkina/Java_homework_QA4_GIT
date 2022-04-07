public class Employee {
    String name;
    int age;
    String gender;
    double salary;

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Maria Zasypkina";


        Employee employee1 = new Employee();
        employee1.name = "Ivan Ivanov";

        System.out.println(employee.isSameName(employee));
        System.out.println(employee1.isSameName(employee));
    }

}
