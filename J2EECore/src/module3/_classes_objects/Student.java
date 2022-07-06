package module3._classes_objects;

public class Student {
    String name;
    double gpa;
    String graduated;
    boolean isAthlete;

    public Student(String name,double gpa,String graduated,boolean isAthlete){
        this.name = name;
        this.gpa = gpa;
        this.graduated = graduated;
        this.isAthlete = isAthlete;
    }

    public void semGrade(){
        System.out.println(name+" Grade is "+gpa);
    }

    public void isGraduated(){
        System.out.println(name+" was already "+graduated);
    }

    public void isAthlete(){
        System.out.println(name+" is Athlete -> "+isAthlete);
    }

    public void collegeName(){
        System.out.println(name+" completed studying in FIT University");
    }

    public void degreeName(){
        System.out.println(name+" had done Master's in Computer Science");
    }

}
