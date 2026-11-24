
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PatientRecord<T1, T2> {
    T1 patientID;
    T2 doctorAssigned;

    void addRecord(T1 patientID, T2 doctorAssigned) {
        this.patientID = patientID;
        this.doctorAssigned = doctorAssigned;
    }

    void displayRecord() {
        System.out.println("Patient ID      : " + patientID);
        System.out.println("Doctor Assigned : " + doctorAssigned);
        System.out.println("-----------------------------");
    }
}

public class HospitalPatientSystem {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        PatientRecord<String, String> p1 =
            new PatientRecord<String, String>();

        PatientRecord<String, String> p2 =
            new PatientRecord<String, String>();

        System.out.println("Enter First Patient Details");
        System.out.print("Enter Alphanumeric Patient ID: ");
        String id1 = br.readLine();

        System.out.print("Enter Doctor Name: ");
        String doctor1 = br.readLine();

        p1.addRecord(id1, doctor1);

        System.out.println("\nEnter Second Patient Details");
        System.out.print("Enter Numeric Patient ID: ");
        String id2 = br.readLine();

        System.out.print("Enter Doctor Name: ");
        String doctor2 = br.readLine();

        p2.addRecord(id2, doctor2);
        System.out.println("\n===== HOSPITAL PATIENT RECORDS =====");

        System.out.println("\nPatient Record 1:");
        p1.displayRecord();

        System.out.println("Patient Record 2:");
        p2.displayRecord();
    }
}
