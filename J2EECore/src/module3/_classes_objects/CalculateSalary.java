package module3._classes_objects;

import module3._classes_objects.Employee;

import java.util.Scanner;

public class CalculateSalary extends Employee {
    public CalculateSalary(String employeeName) {
        super(employeeName);
        this.employeeName();
        this.inputSalary();
    }
    public void inputSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monthly HRA");
        int HRA = sc.nextInt();
        System.out.println("Enter your monthly DA");
        int DA = sc.nextInt();
        System.out.println("Enter your monthly Basic Pay");
        int BA = sc.nextInt();
        int salary = BA+HRA+DA;
        System.out.println("Monthly Pay is -> $"+salary);
    }
}
