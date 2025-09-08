public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        }
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPG() {
        System.out.println("PG Name (protected access): " + this.name + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Gina", 8.2);
        s.display();
        s.setCgpa(8.5);
        s.display();

        PostgraduateStudent pg = new PostgraduateStudent(2, "Henry", 9.1, "AI");
        pg.display();
        pg.displayPG();
    }
}
