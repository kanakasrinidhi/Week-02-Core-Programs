abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        double dailyRate = 1000;
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    @Override
    public String viewRecords() {
        return "Medical History: " + medicalHistory;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    @Override
    public String viewRecords() {
        return "Medical History: " + medicalHistory;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "John Doe", 30, 5);
        Patient outPatient = new OutPatient(102, "Jane Smith", 25, 500);

        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Sample medical record for patient " + patient.getName());
                System.out.println(record.viewRecords());
            }
            System.out.println();
        }
    }
}
