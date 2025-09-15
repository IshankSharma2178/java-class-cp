class CourseML {
    protected String courseName;
    protected int duration;
    public CourseML(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends CourseML {
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public void display() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + isRecorded + ", Fee: " + fee + ", Discount: " + discount + "%");
    }
}

class CourseMultilevelDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOP", 6, "Udemy", true, 49.99, 20);
        poc.display();
    }
}
