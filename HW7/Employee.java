package HW7;

public class Employee {
  private double baseSalary;
  private double name;
  private double salary;

    public Employee(double baseSalary, double name, double salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(double name) {
        this.name = name;
    }

}

