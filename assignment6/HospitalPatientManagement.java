import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String note);
    List<String> viewRecords();
}

abstract class PatientHPM implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private List<String> records = new ArrayList<>();
    private String diagnosis; // sensitive

    public PatientHPM(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    protected String maskDiagnosis() { return diagnosis == null ? "N/A" : "Confidential"; }

    @Override public void addRecord(String note) { records.add(note); }
    @Override public List<String> viewRecords() { return new ArrayList<>(records); }

    public String getPatientDetails() {
        return name + " (" + patientId + ", age " + age + ") diag: " + maskDiagnosis();
    }

    public abstract double calculateBill();
}

class InPatient extends PatientHPM {
    private int daysAdmitted;
    private double dailyRate;
    public InPatient(String id, String name, int age, int days, double rate) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyRate = rate;
    }
    @Override public double calculateBill() { return daysAdmitted * dailyRate; }
}

class OutPatient extends PatientHPM {
    private int visits;
    private double consultationFee;
    public OutPatient(String id, String name, int age, int visits, double fee) {
        super(id, name, age);
        this.visits = visits;
        this.consultationFee = fee;
    }
    @Override public double calculateBill() { return visits * consultationFee; }
}

class HospitalPatientManagementDemo {
    public static void main(String[] args) {
        PatientHPM[] patients = new PatientHPM[] {
            new InPatient("P001", "Isha", 30, 4, 1500),
            new OutPatient("P002", "Jay", 25, 3, 300)
        };
        for (PatientHPM p : patients) {
            p.addRecord("Vitals normal");
            p.setDiagnosis("Flu");
            System.out.println(p.getPatientDetails() + ", Bill: " + p.calculateBill());
        }
    }
}
