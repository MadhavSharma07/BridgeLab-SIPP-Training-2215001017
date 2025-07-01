import java.util.*;

public class Patient {
    String name;
    int age;
    String ailment;
    final int patientID;
    static String hospitalName = "Mathura City Hospital";
    static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Ailment: ");
            String ailment = sc.nextLine();
            System.out.print("Patient ID: ");
            int patientID = sc.nextInt();
            sc.nextLine();
            patients[i] = new Patient(name, age, ailment, patientID);
        }

        System.out.println("\n Patient Records are:");
        for (Patient p : patients) {
            System.out.println();
            p.displayDetails(); 
        }
        getTotalPatients();
     
    }
}