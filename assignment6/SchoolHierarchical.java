class PersonBase {
    protected String name;
    protected int age;
    public PersonBase(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends PersonBase {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() { System.out.println("Teacher: " + name + ", Subject: " + subject); }
}

class StudentRole extends PersonBase {
    private String grade;
    public StudentRole(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() { System.out.println("Student: " + name + ", Grade: " + grade); }
}

class Staff extends PersonBase {
    private String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayRole() { System.out.println("Staff: " + name + ", Dept: " + department); }
}

class SchoolHierarchicalDemo {
    public static void main(String[] args) {
        new Teacher("Rita", 35, "Math").displayRole();
        new StudentRole("Sam", 16, "10th").displayRole();
        new Staff("Uma", 40, "Admin").displayRole();
    }
}
