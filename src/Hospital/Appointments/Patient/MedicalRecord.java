package Hospital.Appointments.Patient;

public class MedicalRecord  extends Patient
{
    private String diagnosisTreatment;
    private String prescription;
    private String allergies;

    public String getDiagnosisTreatment() {
        return diagnosisTreatment;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getAllergies() {
        return allergies;
    }

    public MedicalRecord(int appointmentId, String appointmentDate, String appointmentTime, String appointmentReason, int patientId, String patientName, String patientGender, String patientDob, String patientEmail, String patientAddress, String patientContactno, String diagnosisTreatment, String prescription, String allergies) {
        super(appointmentId, appointmentDate, appointmentTime, appointmentReason, patientId, patientName, patientGender, patientDob, patientEmail, patientAddress, patientContactno);
        this.diagnosisTreatment = diagnosisTreatment;
        this.prescription = prescription;
        this.allergies = allergies;
    }
}
