package module3._classes_objects;

public class Bank {
    String userName;
    double bankWithDrawlAmount;

    public Bank(String userName, Double bankWithDrawlAmount){
        this.userName = userName;
        this.bankWithDrawlAmount = bankWithDrawlAmount;
    }

    public void displayUserName(){
        System.out.println("The User Name is -> "+userName);
    }

    public void displayAmountWithdrawn(){
        System.out.println("The Amount withdrawn from Account is -> "+bankWithDrawlAmount);
    }

    public void remainingBalance(){
        System.out.println("The Remaining Balance after withdrawal is -> "+50000.00);
    }
}
