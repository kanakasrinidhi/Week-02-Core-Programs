import java.util.ArrayList;

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        p.doctors.add(this);
        System.out.println("Dr. " + name + " consulted patient " + p.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void showDoctors() {
        System.out.println(name + "'s doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Meera");
        Doctor d2 = new Doctor("Shyam");

        Patient p1 = new Patient("Aarav");
        Patient p2 = new Patient("Riya");

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
