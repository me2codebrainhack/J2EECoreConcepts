package module2.problem_statement;

public class ModuleAssignment {

    public void displayEmployeeInfo(int[] employeeId,String[] employeeName,int[] employeeSalary){
        System.out.println("ID"+"       "+"Name"+"          "+"Salary"+"            ");
        for(int i=0;i<5;i++){
            System.out.print(employeeId[i]+"        ");
            System.out.print(employeeName[i]+"          ");
            System.out.print(employeeSalary[i]+"            ");
            System.out.println(" ");
        }
    }

    public void displayEmployeeInfo(int[] employeeId,String[] employeeName){
        System.out.println("ID"+"       "+"Name"+"          ");
        for(int i=0;i<5;i++){
            System.out.print(employeeId[i]+"        ");
            System.out.print(employeeName[i]+"          ");
            System.out.println(" ");
        }
    }

    public void displayEmployeeInfo(String name,int[] employeeId,String[] employeeName,int[] employeeSalary){
        System.out.println("ID"+"       "+"Name"+"          "+"Salary"+"            ");
        for(int i=0;i<5;i++){
            if(name.equalsIgnoreCase(employeeName[i])){
                System.out.print(employeeId[i]+"        ");
                System.out.print(employeeName[i]+"          ");
                System.out.print(employeeSalary[i]+"            ");
                System.out.println(" ");
                break;
            }
        }
    }

}
