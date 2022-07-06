package module3._constructors;

import module3._classes_objects.CalculateSalary;

public class Constructors {
    int emp_id;
    String name;
    String department;
    double basic;
    double HRA;
    double DA;
    double tax;

    public Constructors(int emp_id, String name, String department, double basic, double HRA, double DA, double tax ){
        this.emp_id = emp_id;
        this.name = name;
        this.department = department;
        this.basic = basic;
        this.HRA = HRA;
        this.DA = DA;
        this.tax = tax;
        this.detailsOfEmployee(this.emp_id,this.name,this.department,this.basic,this.HRA,this.DA,this.tax);
    }

    public double[] CalculateSalary(double basic,double HRA,double DA,double tax){
        double[] salaries = new double[2];
        salaries[0] = basic+HRA+DA;
        salaries[1] = basic+HRA+DA-tax;
        return salaries;
    }

    public void detailsOfEmployee(int emp_id, String name, String department, double basic, double HRA, double DA, double tax ){
        double[] salaries = CalculateSalary(basic,HRA,DA,tax);
        double grossSalary = 0;
        double takeHomeSalary = 0;
        for (int i=0;i<salaries.length;i++){
            if(i==0){
                grossSalary = salaries[i];
            }else{
                takeHomeSalary = salaries[i];
            }
        }
        System.out.println("Employee id is -> "+emp_id);
        System.out.println("Employee name is -> "+name);
        System.out.println("Employee Working in -> "+department+" department");
        System.out.println("Employee Basic package is -> "+basic);
        System.out.println("Employee HRA is -> "+HRA);
        System.out.println("Employee DA is -> "+DA);
        System.out.println("Employee paying "+tax+" as tax ");
        System.out.println("Employee Gross Salary -> "+grossSalary);
        System.out.println("Employee Take Home Salary -> "+takeHomeSalary);

    }
}
