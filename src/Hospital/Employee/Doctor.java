package Hospital.Employee;

public class Doctor extends Employee {
    private final int doctorId;
    private final String doctorDepartment;
    private final String doctorSpeciality;
    private final String type;

    public int getDoctorId() {
        return doctorId;
    }

    public String getType() {
        return type;
    }

    public String getDoctorDepartment() {
        return doctorDepartment;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    private Doctor(DoctorBuilder builder) {
        super(builder);
        this.doctorId = builder.doctorId;
        this.doctorDepartment = builder.doctorDepartment;
        this.doctorSpeciality = builder.doctorSpeciality;
        this.type = builder.type;
    }


    @Override
    public void displayEmployeeDetails() {
        System.out.println("Doctor Name " + getEmployeeName());
        System.out.println("Doctor Email " + getEmployeeEmail());
        System.out.println("Doctor Gender " + getEmployeeGender());
        System.out.println("Doctor address " + getEmployeeAddress());
    }

    public static void performduty() {
        System.out.println("  Doctor is attending patient");
    }

    public static void schedulingAppointment() {
        System.out.println("Doctor is scheduling appointments");
    }


    public static class DoctorBuilder extends Employee.EmployeeBuilder {
        private int doctorId;
        private String doctorDepartment;
        private String doctorSpeciality;
        private String type;


        public static DoctorBuilder aDoctor() {
            return new DoctorBuilder();
        }

        public DoctorBuilder withDoctorId(int doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public DoctorBuilder withDoctorDepartment(String doctorDepartment) {
            this.doctorDepartment = doctorDepartment;
            return this;
        }

        public DoctorBuilder withDoctorSpeciality(String doctorSpeciality) {
            this.doctorSpeciality = doctorSpeciality;
            return this;
        }

        public DoctorBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}
