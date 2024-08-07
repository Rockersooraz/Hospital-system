package Hospital.Employee;

public class Employee {
    private String employeeName;
    private String employeeDOB;
    private String employeeEmail;
    private String employeeGender;
    private String employeeAddress;
    private String employeeContactNumber;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public static void performduty() {
        System.out.println("is performing duty");
    }

    protected Employee(EmployeeBuilder builder) {
        this.employeeName = builder.employeeName;
        this.employeeDOB = builder.employeeDOB;
        this.employeeEmail = builder.employeeEmail;
        this.employeeGender = builder.employeeGender;
        this.employeeAddress = builder.employeeAddress;
        this.employeeContactNumber = builder.employeeContactNumber;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee Name " + employeeName);
        System.out.println("Person Email " + employeeEmail);
        System.out.println("Employee Gender " + employeeGender);
        System.out.println("Employee address " + employeeAddress);
    }


    public static class EmployeeBuilder {
        private String employeeName;
        private String employeeDOB;
        private String employeeEmail;
        private String employeeGender;
        private String employeeAddress;
        private String employeeContactNumber;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder withEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeBuilder withEmployeeDOB(String employeeDOB) {
            this.employeeDOB = employeeDOB;
            return this;
        }

        public EmployeeBuilder withEmployeeEmail(String employeeEmail) {
            this.employeeEmail = employeeEmail;
            return this;
        }

        public EmployeeBuilder withEmployeeGender(String employeeGender) {
            this.employeeGender = employeeGender;
            return this;
        }

        public EmployeeBuilder withEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
            return this;
        }

        public EmployeeBuilder withEmployeeContactNumber(String employeeContactNumber) {
            this.employeeContactNumber = employeeContactNumber;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
