package package1.src;

public class Employee {
    private String employeeName;
    private int employeeId;

    // Outer class constructor
    public Employee(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
    }

    // Inner class
    class Department {
        private String departmentName;
        private int totalEmployees;

        // Inner class constructor
        public Department(String name, int totalEmployees) {
            this.departmentName = name;
            this.totalEmployees = totalEmployees;
        }

        // Inner class method accessing both inner and outer class variables
        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department Name: " + departmentName);
            System.out.println("Total Employees in Department: " + totalEmployees);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Employee employee = new Employee("Biswaranjan Prusty", 101);

        // Creating an instance of the inner class using the outer class instance
        Employee.Department department = employee.new Department("IT Department", 50);

        // Calling the method of the inner class
        department.displayInfo();
    }
}
