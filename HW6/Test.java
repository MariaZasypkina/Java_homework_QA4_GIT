package HW6;
public class Test {
    public static void main(String[] args) {
Employee employee1 = new Employee();
employee1.person.name = "Maria";
employee1.salary = 120000;

Employee employee2 = new Employee();
employee2.person.name = "Maria1";
employee2.salary = 100000;

Salary salary = new Salary();
Employee [] employeeArray = {employee1, employee2};

        System.out.println(employee1.isSameName(employee2));
        System.out.println(salary.getSum(employeeArray));


    }
}
