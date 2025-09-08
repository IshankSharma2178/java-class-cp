public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void display() {
        System.out.println("Manager ID: " + this.employeeID + ", Dept: " + this.department + ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager m = new Manager("EMP789", "Engineering", 95000, 8);
        m.display();
        m.updateSalary(100000);
        m.display();
    }
}
