package employeeInheritence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int empId;
        float empSalary;
        String empName,empAddress;
        String subject,department;

        Teacher teach=new Teacher();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many details of employee you want to add");
        n=sc.nextInt();
        Teacher[] teacher=new Teacher[n];

        System.out.println("Enter details of Teachers: ");
        for (int i=0;i<n;i++){
            System.out.println("-------------------");
            System.out.println("Teacher "+i+1);
            System.out.println("-------------------");
            System.out.println("Id : ");
            empId=sc.nextInt();
            System.out.println("Name : ");
            empName=sc.next();
            System.out.println("Department : ");
            department=sc.next();
            System.out.println("Subjects taught : ");
            subject=sc.next();
            System.out.println("Salary: ");
            empSalary=sc.nextFloat();
            System.out.println("Address : ");
            empAddress=sc.next();
            teacher[i] =new Teacher(n,empId,empSalary,empName,empAddress,department,subject);

        }
        for (int i=0;i<teacher.length;i++) {
            System.out.println("---------------------");
            System.out.println("Teacher details");
            System.out.println("---------------------");
            System.out.println("Id : " + teacher[i].empId);
            System.out.println("Name : " + teacher[i].empName);
            System.out.println("Department : " + teacher[i].department);
            System.out.println("Subject taught : " +teacher[i].subject);
            System.out.println("Salary : " + teacher[i].empSalary);
            System.out.println("Address: " + teacher[i].empAddress);
        }
    }


}
