package employeeInheritence;




public class Employee {
    int empId;
    float empSalary;
    String empName,empAddress;

    public Employee(int empId, float empSalary, String empName, String empAddress) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public Employee() {

    }
}
