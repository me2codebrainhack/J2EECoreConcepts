package module3._classes_objects;

public class Employee {
    String employeeName;

    public Employee(String employeeName){
        this.employeeName = employeeName;
    }

    public void employeeName(){
        System.out.println("Employee name is "+employeeName);
    }

    public void CompanyName(){
        System.out.println(employeeName+" is working as Sr Software Engineer in HP");
    }

    public void TeamName(){
        System.out.println(employeeName+" works in Avengers Team");
    }

    public void ProjectName(){
        System.out.println(employeeName+" works for TechPulse Project");
    }
}
