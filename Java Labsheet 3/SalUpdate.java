class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " has salary: " + salary);
    }
}

class SalaryUpdater {
    void increaseSalary(Employee e, double amount) {
        e.salary += amount;  
    }
}

public class SalUpdate {
    public static void main(String[] args) {
        Employee emp = new Employee("Priyanshu", 30000);
        emp.display();

        SalaryUpdater updater = new SalaryUpdater();
        updater.increaseSalary(emp, 5000);

        emp.display();
    }
}
