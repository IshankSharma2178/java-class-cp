public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + ", Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + String.format("%.2f", fee));
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 199.0);
        Course c2 = new Course("Python", 6, 179.0);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Global Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
