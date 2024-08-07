package Hospital.Appointments.Patient;

public class Billing extends MedicalRecord
{
    private float amount;
    private String billingDate;
    private String paymentMethod;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Billing(int appointmentId, String appointmentDate, String appointmentTime, String appointmentReason, int patientId, String patientName, String patientGender, String patientDob, String patientEmail, String patientAddress, String patientContactno, String diagnosisTreatment, String prescription, String allergies, float amount, String billingDate, String paymentMethod) {
        super(appointmentId, appointmentDate, appointmentTime, appointmentReason, patientId, patientName, patientGender, patientDob, patientEmail, patientAddress, patientContactno, diagnosisTreatment, prescription, allergies);
        this.amount = amount;
        this.billingDate = billingDate;
        this.paymentMethod = paymentMethod;
    }

}
