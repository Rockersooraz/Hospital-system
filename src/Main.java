import Hospital.Employee.Doctor;
import Hospital.Employee.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> person = new ArrayList<>();

        Employee build = new Employee.EmployeeBuilder()
                .withEmployeeName("Ram")
                .withEmployeeEmail("ram50@gmail.com")
                .withEmployeeAddress("Mississauga")
                .withEmployeeGender("Male")
                .withEmployeeDOB("1996/05/05")
                .withEmployeeContactNumber("4125563256")
                .build();


        Employee doctor = new Doctor.DoctorBuilder()
                .withEmployeeName("Ram")
                .withEmployeeAddress("Mississauga")
                .withEmployeeEmail("ram50@gmail.com")
                .withEmployeeGender("Male")
                .withEmployeeDOB("1996/05/05")
                .withEmployeeContactNumber("4125563256")
                .build();

        person.add(build);
        person.add(doctor);

        EmployeeService.getPersonDetails(person);

//        List<Appointment> appointments = new ArrayList<>();
//        appointments.add(new Appointment(1, "2024/05/05", "2pm", "Regular Health check up"));
//        appointments.add(new Patient(2, "2024/05/05", "5 pm", "Neck pain", 3, "Pumpi", "F", "1998/04/05", "pumpi344@gmail.com", "Mississauga", "4787336525"));
//        AppointmentService.getAppointmentDetails(appointments);
    }
}
