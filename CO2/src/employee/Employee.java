package employee;


import java.util.Scanner;

class EmployeeFunction {

    int eNo;
    int n;
    String eName;
    float salary;

    public EmployeeFunction(int eNo, int n, String eName, float salary) {
        this.eNo = eNo;
        this.n = n;
        this.eName = eName;
        this.salary = salary;
    }

    public EmployeeFunction() {
    }

    void search(int eNo, EmployeeFunction[] employee, int n){
        this.eNo=eNo;
        int flag=0;
        String count = null;
        this.n=n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id to search: ");
        eNo=sc.nextInt();

        for (int i=0;i<n;i++){

            if(eNo==employee[i].eNo){
                count=employee[i].eName;
                flag=1;
                break;
            }

        }
        if(flag==1){
            System.out.println("Employee with employee number "+eNo+" is "+count);

        }
        else {
            System.out.println("Item not found");
        }

    }

    void display(EmployeeFunction[] employee){

        for (int i=0;i<n;i++){
            System.out.println("-----------------------------------");
            System.out.println("Employee name:  "+employee[i].eName);
            System.out.println("Employee number: "+"Rs "+employee[i].eNo);
            System.out.println("Employee salary "+employee[i].salary);
            System.out.println("-------------------------");

        }

    }




}


class Employee {
    public static void main(String[] args) {
        int n;
        int eno = 0;
        String ename;
        float salary;
        Scanner sc = new Scanner(System.in);
        EmployeeFunction emp=new EmployeeFunction();
        System.out.println("Enter how many details of employee you want to add");
        n=sc.nextInt();
        EmployeeFunction[] employeeFunction=new EmployeeFunction[n];

        System.out.println("Enter the employee details");
        for (int i=0;i<n;i++){
            System.out.println("Employee Name: ");
            ename=sc.next();
            System.out.println("Employee No: ");
            eno=sc.nextInt();
            System.out.println("Employee Salary: ");
            salary=sc.nextInt();
            employeeFunction[i]=new EmployeeFunction(eno,n,ename,salary);

        }
        emp.search(eno,employeeFunction,n);
        emp.display(employeeFunction);

    }
}

