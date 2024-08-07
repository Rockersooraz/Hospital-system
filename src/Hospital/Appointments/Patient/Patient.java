package Hospital.Appointments.Patient;

import Hospital.Appointments.Appointment;

public class Patient extends Appointment
{
    private int patientId;
    private String patientName;
    private String patientGender;
    private String patientDob;
    private String patientEmail;
    private String patientAddress;
    private String patientContactno;

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public String getPatientDob() {
        return patientDob;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public String getPatientContactno() {
        return patientContactno;
    }

    public Patient(int appointmentId, String appointmentDate, String appointmentTime, String appointmentReason, int patientId, String patientName, String patientGender, String patientDob, String patientEmail, String patientAddress, String patientContactno) {
        super(appointmentId, appointmentDate, appointmentTime, appointmentReason);
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientDob = patientDob;
        this.patientEmail = patientEmail;
        this.patientAddress = patientAddress;
        this.patientContactno = patientContactno;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient Id " + getPatientId());
        System.out.println("Patient Name " + getPatientName());
        System.out.println("Patient Address " + getPatientAddress());
        System.out.println("Patient contact " + getPatientContactno());
    }
}
