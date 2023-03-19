package personInheritence;

public class Employee extends Person {
    int empId;
    float empSalary;
    String companyName,qualification;


    public Employee(String name, String gender, String address, int age, int empId, float empSalary, String companyName, String qualification) {
        super(name, gender, address, age);
        this.empId = empId;
        this.empSalary = empSalary;
        this.companyName = companyName;
        this.qualification = qualification;
    }

    public Employee() {
        super();
    }
}
