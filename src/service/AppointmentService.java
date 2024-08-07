package service;

import Hospital.Appointments.Appointment;
import Hospital.Employee.Employee;

import java.util.List;

public class AppointmentService {

    public static void getAppointmentDetails(List<Appointment> appointmentList) {
        for(Appointment appointment: appointmentList){
            displayAppointmentDetails(appointment);
        }
    }

    public static void displayAppointmentDetails(Appointment appointment) {
        appointment.displayDetails();
    }
}
