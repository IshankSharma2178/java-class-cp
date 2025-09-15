class EmployeeBase {
    protected String name;
    protected int id;
    protected double salary;

    public EmployeeBase(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class ManagerEmp extends EmployeeBase {
    private int teamSize;
    public ManagerEmp(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override public void displayDetails() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

class DeveloperEmp extends EmployeeBase {
    private String programmingLanguage;
    public DeveloperEmp(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override public void displayDetails() {
        System.out.println("Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}

class InternEmp extends EmployeeBase {
    private int durationMonths;
    public InternEmp(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }
    @Override public void displayDetails() {
        System.out.println("Intern: " + name + ", ID: " + id + ", Stipend: " + salary + ", Duration: " + durationMonths + " months");
    }
}

class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        EmployeeBase[] emps = new EmployeeBase[] {
            new ManagerEmp("Asha", 101, 95000, 7),
            new DeveloperEmp("Ben", 102, 85000, "Java"),
            new InternEmp("Chloe", 103, 20000, 6)
        };
        for (EmployeeBase e : emps) { e.displayDetails(); }
    }
}