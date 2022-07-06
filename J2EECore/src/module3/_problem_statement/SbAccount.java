package module3._problem_statement;

public final class SbAccount extends Account{

    int accountNumber;
    String name;
    double amount;

    public SbAccount(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void getAccountNumber() {
        System.out.println("The Account number is  -> "+accountNumber);
    }

    @Override
    public void getName() {
        System.out.println("The Account Type is -> "+name);
    }

    @Override
    public double getAmount() {
        double retAmount;
        if(name.equalsIgnoreCase("Account")){
            retAmount = amount;
        }else{
            retAmount = amount+(40);
        }
        return retAmount;
    }
}
