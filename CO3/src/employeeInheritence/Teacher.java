package employeeInheritence;



public class Teacher extends Employee {
    String department,subject;
    int n;

    public Teacher(){
        super();
    }
    public Teacher(int n,int empId, float empSalary, String empName, String empAddress, String department, String subject) {
        super(empId, empSalary, empName, empAddress);
        this.department = department;
        this.subject = subject;
        this.n=n;
    }
//    void display(){
//        for (int i=0;i<n;i++){
//            System.out.println("---------------------");
//            System.out.println("Teacher details");
//            System.out.println("---------------------");
//            System.out.println("Id : " + empId);
//            System.out.println("Name : " + empName);
//            System.out.println("Department : " + department);
//            System.out.println("Subject taught : " + subject);
//            System.out.println("Salary : " + empSalary);
//            System.out.println("Address: " + empAddress);
//        }
//    }
}
