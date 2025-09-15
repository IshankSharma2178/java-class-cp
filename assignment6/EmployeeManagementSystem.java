interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class EmployeeEMS implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public EmployeeEMS(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    @Override public void assignDepartment(String deptName) { this.department = deptName; }
    @Override public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base: " + baseSalary + ", Dept: " + getDepartmentDetails() + ", Final Salary: " + String.format("%.2f", calculateSalary()));
    }
}

class FullTimeEmployee extends EmployeeEMS {
    private double monthlyFixed;
    public FullTimeEmployee(String employeeId, String name, double baseSalary, double monthlyFixed) {
        super(employeeId, name, baseSalary);
        this.monthlyFixed = monthlyFixed;
    }
    @Override public double calculateSalary() { return monthlyFixed; }
}

class PartTimeEmployee extends EmployeeEMS {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override public double calculateSalary() { return hoursWorked * hourlyRate; }
}

class EmployeeManagementSystemDemo {
    public static void main(String[] args) {
        EmployeeEMS[] emps = new EmployeeEMS[] {
            new FullTimeEmployee("E001", "Rohan", 50000, 70000),
            new PartTimeEmployee("E002", "Sara", 0, 80, 25)
        };
        emps[0].assignDepartment("Engineering");
        emps[1].assignDepartment("Support");
        for (EmployeeEMS e : emps) { e.displayDetails(); }
    }
}
