package staff;

public class Employee {
    String name;
    String niNumber;
    Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double amount){
        this.salary += amount;
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }
}
