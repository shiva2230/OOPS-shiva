package personInheritence;

public class Teacher extends Employee {
    String department,subject;
    int teacherId;
    int n;

    public Teacher(){
        super();
    }

    public Teacher(String name, String gender, String address, int age, int empId, float empSalary, String companyName, String qualification, String department, String subject, int teacherId, int n) {
        super(name, gender, address, age, empId, empSalary, companyName, qualification);
        this.department = department;
        this.subject = subject;
        this.teacherId = teacherId;
        this.n = n;
    }

//    void display(Teacher[] teacher){
//        for (int i=0;i<n;i++) {
//            System.out.println("---------------------");
//            System.out.println("Teacher details");
//            System.out.println("---------------------");
//            System.out.println("Id : " + teacher[i].empId);
//            System.out.println("Name : " + teacher[i].name );
//            System.out.println("Gender : "+teacher[i].gender);
//            System.out.println("Age: "+teacher[i].age);
//            System.out.println("CompanyName : "+teacher[i].companyName);
//            System.out.println("Qualification : "+teacher[i].qualification);
//            System.out.println("Department : " + teacher[i].department);
//            System.out.println("Subject taught : " + teacher[i].subject);
//            System.out.println("Salary : " + teacher[i].empSalary);
//            System.out.println("Address: " + teacher[i].address);
//        }
//    }

}
