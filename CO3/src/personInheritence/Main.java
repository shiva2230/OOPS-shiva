package personInheritence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many details of employee you want to add");
        n = sc.nextInt();
        Teacher[] teachers = new Teacher[n];

        System.out.println("Enter details of Teachers: ");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------");
            System.out.println("Teacher " + (i+1));
            System.out.println("-------------------");
            System.out.println("Id: ");
            int empId = sc.nextInt();
            System.out.println("Name: ");
            String empName = sc.next();
            System.out.println("Gender: ");
            String gender = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Department: ");
            String department = sc.next();
            System.out.println("Subjects taught: ");
            String subject = sc.next();
            System.out.println("Salary: ");
            float empSalary = sc.nextFloat();
            System.out.println("Address: ");
            String empAddress = sc.next();
            System.out.println("Company Name: ");
            String companyName = sc.next();
            System.out.println("Qualification: ");
            String qualification = sc.next();
            teachers[i] = new Teacher(empName, gender, empAddress, age, empId, empSalary, companyName, qualification, department, subject, empId, n);
        }





            for (int i = 0; i < teachers.length; i++) {
                System.out.println("---------------------");
                System.out.println("Teacher details");
                System.out.println("---------------------");
                System.out.println("Id : " + teachers[i].empId);
                System.out.println("Name : " + teachers[i].name);
                System.out.println("Gender : " + teachers[i].gender);
                System.out.println("Age: " + teachers[i].age);
                System.out.println("CompanyName : " + teachers[i].companyName);
                System.out.println("Qualification : " + teachers[i].qualification);
                System.out.println("Department : " + teachers[i].department);
                System.out.println("Subject taught : " + teachers[i].subject);
                System.out.println("Salary : " + teachers[i].empSalary);
                System.out.println("Address: " + teachers[i].address);
            }




}}
