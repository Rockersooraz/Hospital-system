package Hospital.Appointments;

import Hospital.Hospital_MIS;

public class Appointment extends Hospital_MIS

{

    private int appointmentId;
    private String appointmentDate;
    private String appointmentTime;
    private String appointmentReason;

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public Appointment(int appointmentId, String appointmentDate, String appointmentTime, String appointmentReason) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentReason = appointmentReason;
    }

    public void displayDetails() {
        System.out.println("Appointment Id" + getAppointmentId());
        System.out.println("Appointment Date" + getAppointmentDate());
        System.out.println("Appointment Time" + getAppointmentTime());
        System.out.println("Appointment Reason" + getAppointmentReason());
    }
}
